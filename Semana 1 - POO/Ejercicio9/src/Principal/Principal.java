package Principal;

import java.util.ArrayList;
import java.util.List;

import Entidad.Alumno;

public class Principal {

	public static void main(String[] args) {
		// definir lista
		List<Alumno> lista = new ArrayList<Alumno>();

		// isntanciar
		lista.add(new Alumno(1651554, "David", "Dominguez", "Diaz", 21, "Lic. Medicina", "Buap"));
		lista.add(new Alumno(5889867, "Mario", "Gonzalez", "Gomez", 24, "ing. Sistemas", "UNAM"));
		lista.add(new Alumno(5841554, "Sebastian", "Ramirez", "Flores", 26, "Ing. Sistemas", "UNAM"));
		lista.add(new Alumno(432344, "Jose", "Contreras", "Garcia", 26, "Lic. Arquitectura", "UPT"));
		lista.add(new Alumno(211112021, "Eduardo ", "Anaya", "Sanchez", 23, "ing.Mecatronica", "buap"));

		/*
		 * sintaxis de empresiones lambda(conocidas como funciones de flecha)
		 * 
		 * (arg1) -> (cuerpo) (tipo1, tipo1, arg2) -> (cuerpo)
		 */

		// funcion lamnda para imprimir los nombres de los alumnos

		lista.forEach(
				// espresion lambda
				(alumno) -> {
					System.out.println("Nombre del alumno: " + alumno.getNombre());
				});

		// imprimir el detalle de los alumnos
		System.out.println("\n-----Detalle de alumnos------\n");
		// mostrar el detalle de los alumnos usando un filtro, solo muestra los alumnos
		// de la UNAM
		lista.stream().filter(arg -> arg.getUniversidad().equalsIgnoreCase("unam"))
				.forEach(alumno -> System.out.println(
						"Nombre: " + alumno.getNombre() + " " + alumno.getaPaterno() + " estudia la carrera de: "
								+ alumno.getCarrera() + " en la universidad " + alumno.getUniversidad()));
		//funciones lambda con interfaces funciones 
		ISaludo mensaje = (saludo, despedida) -> saludo + " y " + despedida;
		
		System.out.println(mensaje.saludar("Hola con expresiones lambda", "Hasta luego"));
	}

}
