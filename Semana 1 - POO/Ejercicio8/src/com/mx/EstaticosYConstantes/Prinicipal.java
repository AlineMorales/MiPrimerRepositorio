package com.mx.EstaticosYConstantes;

public class Prinicipal {
	
	//miembro estatico: metodos o atributos que se asocian a una clase en lugar de una intancia 
	//mimebro constante: son variables que durante la ejecucion no cambian 
	
	
	//ejemplos
	//miembro estatico: Variable que se asocia a la clase 
	public static String frase1 = "Miembro estatico";
	
	//constante o variable final: no cmabia despues de la incializacion 
	public final String frase2= "Variable final constante";
	
	//constante estatica: Variable final aosicada a una clase
	public static final String frase3 = "Variable final estatica";
	
	///ejemplificacion de como funcionas las variables estaticas
	public static void main(String[] args) {
		
		//acceso a muiembros estaticos directamente desde mi clase 
		System.out.println(frase1);
		System.out.println(frase3);
		
		//ejemplo con un metodo que calcula el area de un circulo 
		float radio = 5;
		double area = calcularAreaCirculo(radio);
		
		System.out.println("El area del circulo con radio de: " + radio + " es de: " + area);
		
	}//termina mi metodo main 
	
	public static double calcularAreaCirculo(float radio) {
		return Math.PI * (radio * radio);
	}

}
