package clase11.laboratorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Persona> personas = new HashSet<>();
		List<Persona> personasOrdenadas;
		byte cc;

		String nombre, apellido;

		String tipoDocumento = null;
		int numeroDocumento;

		LocalDate fechaNacimiento;

		String[] cursos;

		Persona persona = null;
		int tipoPersona;

		LocalDate fechaCargo;
		double sueldo;
		String carrera;

		do {

			System.out.println("Ingrese el tipo de persona o cero para finalizar");
			System.out.println("1-Alumno");
			System.out.println("2-Director");
			System.out.println("3-Profesor");
			System.out.println("4-Administrativo");

			tipoPersona = sc.nextInt();

			if (tipoPersona == 0) {
				break;
			}

			System.out.println("Ingrese el nombre");
			nombre = sc.next();
			
			System.out.println("Ingrese el apellido");
			apellido = sc.next();

			
			/* EXCEPCION PROPIA */
			boolean isDocuValido = false;

			while (!isDocuValido) {
				System.out.println("Ingrese el tipo de documento");
				tipoDocumento = sc.next().toUpperCase();

				try {

					for (int i = 0; i < TipoDocumentoValidos.values().length; i++) {
						if (tipoDocumento.equals(TipoDocumentoValidos.values()[i].toString())) {
							isDocuValido = true;
							break;
						}
					}

					if (!isDocuValido) {
						throw new DocumentoException(1);
					}

					break;

				} catch (DocumentoException e) {
					System.out.println(e.getMessage());
				}
			}

			
			System.out.println("Ingrese el nro de documento");
			numeroDocumento = sc.nextInt();

			System.out.println("Ingrese la fecha de nacimiento");
			fechaNacimiento = ingresarFechaValida();

			switch (tipoPersona) {
			case 1: // alumno
				System.out.println("Ingrese la cantidad de cursos");
				cc = sc.nextByte();
				cursos = ingresarCursos(cc);

				persona = new Alumno(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), fechaNacimiento,
						cursos);

				break;

			case 2: // director
				System.out.println("Ingrese la fecha de inicio del cargo: ");
				fechaCargo = ingresarFechaValida();

				System.out.print("Ingrese el sueldo: ");
				sueldo = sc.nextDouble();

				sc.nextLine();
				System.out.println("Ingrese la carrera: ");
				carrera = sc.nextLine();

				persona = new Director(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), fechaNacimiento,
						fechaCargo, sueldo, carrera);

				break;

			case 3: // profesor
				System.out.println("Ingrese la fecha de inicio del cargo: ");
				fechaCargo = ingresarFechaValida();

				System.out.print("Ingrese el sueldo: ");
				sueldo = sc.nextDouble();

				System.out.print("Ingrese la cantidad de cursos: ");
				cc = sc.nextByte();
				cursos = ingresarCursos(cc);

				persona = new Profesor(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), fechaNacimiento,
						fechaCargo, sueldo, cursos);

				break;

			case 4: // administrativo
				System.out.println("Ingrese la fecha de inicio del cargo: ");
				fechaCargo = ingresarFechaValida();

				System.out.print("Ingrese el sueldo: ");
				sueldo = sc.nextDouble();

				persona = new Administrativo(nombre, apellido, new Documento(tipoDocumento, numeroDocumento),
						fechaNacimiento, fechaCargo, sueldo);

				break;

			}

			personas.add(persona);
			

		} while (true);
		

		System.out.println("\nDatos de las personas");

		Iterator<Persona> it = personas.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		personasOrdenadas = new ArrayList<Persona>(personas);
		personasOrdenadas.sort(new OrdenDocumento());

		System.out.println("\nPersonas Ordenadas:");
		
		Iterator<Persona> ito = personasOrdenadas.iterator();
		while(ito.hasNext()) {
			System.out.println(ito.next());
		}

		sc.close();

	}

	private static String[] ingresarCursos(byte cc) {
		String[] cursos = new String[cc];

		for (int i = 0; i < cursos.length; i++) {
			System.out.println("Ingrese el curso");
			cursos[i] = sc.next();
		}

		return cursos;
	}

	
	private static LocalDate ingresarFechaValida() {
		int anio, mes, dia;

		while (true) {
			try {
				System.out.print("Ingrese el año: ");
				anio = Integer.parseInt(sc.next());
				break;
				
			} catch (Exception e) {
				System.err.println("Debe ingresar un dato valido.");
			}
		}

		
		while (true) {
			try {
				System.out.print("Ingrese el mes: ");
				mes = Integer.parseInt(sc.next());
				
				if (mes < 1 || mes > 12) {
					throw new Exception("Los meses deben estar comprendidos entre 1 y 12");
				}
				break;
				
			} catch (Exception e) {
				System.err.println("Debe ingresar un dato valido. " + e.getMessage());
			}
		}

		
		while (true) {
			try {
				System.out.print("Ingrese el dia: ");
				dia = Integer.parseInt(sc.next());
				
				if (dia < 1) {
					throw new Exception("Los dias deben ser un numero positivo");

				} else {

					if (mes == 2) {
						
						if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
							System.out.println("El año es bisiesto.");
							if (dia > 29) {
								throw new Exception("El mes 2 posee un maximo de 29 dias.");
							}
							
						} else {
							System.out.println("El año no es bisiesto.");
							if (dia > 28) {
								throw new Exception("El mes 2 posee un maximo de 28 dias.");
							}
						}						

					} else if ((dia > 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
						throw new Exception("Los dias para estos meses debe estar comprendidos entre 1 y 30.");

					} else if (dia > 31) {
						throw new Exception("Los dias para estos meses debe estar comprendidos entre 1 y 31.");
					}

				}
				break;

			} catch (Exception e) {
				System.err.println("Debe ingresar un dato valido. " + e.getMessage());
			}
		}

		return LocalDate.of(anio, mes, dia);
	}

}
