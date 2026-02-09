package com.mx.EstaticosYConstantes;



public class Prueba {

	public static void main(String[] args) {
		
		//variables finales: se deben instanciar y una vez intanciadas, el valor ya no 
		//deberia cambiar 
		
		//instanciar principal
		Prinicipal obj = new Prinicipal();
		
		//acceder a los miembros 
		System.out.println(obj.frase2); //miembro de instancia 
		System.out.println(Prinicipal.frase3); //muiembro atra ves de una clase 

	}

}
