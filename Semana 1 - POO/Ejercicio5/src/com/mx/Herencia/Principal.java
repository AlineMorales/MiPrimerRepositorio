package com.mx.Herencia;

public class Principal {

	public static void main(String[] args) {
		
		Hijo hijo1 = new Hijo("Roberto", "Rodriguez", 12, "Mexicano", "Cafe", 1.20, "Morena");
		System.out.println(hijo1);
		
		hijo1.setEdad(21);
		hijo1.setAltura(1.75);
		System.out.println("Actualizado\n" + hijo1);
		
		hijo1.trabajar();
		
		
		/*
		 * ejercicio de practica de herencia 
		 * definir una clase anima (agregar los atrbutos por defecto que definen un animal)
		 * la clase debe tener un un metodo hacerSonido();
		 * de esta deben heradr 2 clases Gato y perro y el metodo de hacerSonido en ambas clases debe 
		 * imprimir el sonido correspondiente 
		 * ejemplo : una vaca imprimiria: "muuuuu"
		 * 
		 * 
		 */
	}

}
