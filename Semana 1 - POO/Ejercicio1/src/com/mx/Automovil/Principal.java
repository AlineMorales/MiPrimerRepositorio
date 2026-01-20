package com.mx.Automovil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//instanciar el objeto 
		Automovil a1 = new Automovil("Toyota", "Corolla", 150000, "rojo");
		Automovil a2 = new Automovil("SEAT", "Toledo", 170000, "Negro");
		Automovil a3 = new Automovil("Suzuki", "Swift", 250000,"blanco");
		Automovil a4 = new Automovil("Audi", "Q5", 360000, "Azul");
		Automovil a5 = new Automovil ("mazda", "X3", 350000,"Rojo");
		Automovil a6 = new Automovil("Volkswagen", "Beetle", 200000, "rosa");
		Automovil a7 = new Automovil("Honda", "civic", 20000 ,"gris");
		
		//objeto auxiliar
		Automovil auAux = null;
		
		//Declaracion de una lista para alamacenar los objetos
		
		List<Automovil> lista = new ArrayList<Automovil>();
		
		//agregar los objetos a la lista 
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		lista.add(a6);
		lista.add(a7);
		
		/*
		 * //mostrar lo que existe en lista, imprimir en consola
		 * System.out.println(lista);
		 * 
		 * //buscar un elemento en especifico auAux = lista.get(1);
		 * System.out.println("Elemento encontrado " + auAux);
		 * 
		 * //editar un elemento de la lista auAux = lista.get(2);
		 * auAux.setColor("Amazul"); auAux.setPrecio(3);
		 * System.out.println("Elemento editado " + auAux);
		 * 
		 * //eliminar un elemento de la lista lista.remove(3);
		 * System.out.println("Lista actualizda\n" + lista);
		 * 
		 * //contar los elementos en la lista System.out.println("Existen " +
		 * lista.size() + " Autos en la lista");
		 * 
		 * //eliminar todo lista.clear(); //validar si si esta vacia if(lista.isEmpty())
		 * { System.out.println("No existen elementos en la lista"); }else {
		 * System.out.println(lista); }
		 */
		

		
		//crear un menu interactivo que me ayudara a modificar la lista desde consola 
		
		Scanner scan = null; // se utiliza para leer la entrada de un usuario 
		int menuPrincipal=0, menuEditar=0, indice=0;
//los menus son variables que almacenaran opciones e indice va a simular el indice de un objeto 
		
		
		//variable locales 
		String marca, subMarca, color;
		int precio;
		
		/*Uso del ciclo Do-While: en java es una estructura que permite ejecutar un bloque de codigo al menos
		 * una vez y este continua su ejecucion hasta cumplir la condicion*/
		
		do {
			System.out.println("----Menu----");
			System.out.println("1.- AGREGAR");
			System.out.println("2.- MOSTRAR LA LISTA");
			System.out.println("3.- EDITAR");
			System.out.println("4.- BUSCAR UN ELMENTO");
			System.out.println("5.- ELIMINAR");
			System.out.println("6.- CONTAR");
			System.out.println("7.- SALIR");
			System.out.println("ELIGE UNA OPCION DENTRO DEL MENU");
			scan = new Scanner(System.in);
			menuPrincipal = scan.nextInt();
			
			/*Metodo Switch o case: Es una estrctura de constrol de flujo que nos permite ejecutar diferentes
			 * bloques de codigo basado en el valor de una expresion, tambien conocidos como metodo case
			 * porque denontro del switch se utilizan difenrete case paa menjar los difenrtes casos de una
			 * expresion
			 * */
			switch(menuPrincipal) {
			case 1: 
				System.out.println("1.- Agrega un nuevo registro");
				System.out.println("Escribe la marca del Automovil");
				scan = new Scanner(System.in);
				marca = scan.nextLine();
				
				System.out.println("Escribe la subMarca del Automovil");
				scan = new Scanner(System.in);
				subMarca = scan.nextLine();
				
				System.out.println("Escribe el precio del Automovil");
				scan = new Scanner(System.in);
				precio = scan.nextInt();
				
				System.out.println("Escribe el color del Automovil");
				scan = new Scanner(System.in);
				color = scan.nextLine();
				
				//instanciar 
				auAux = new Automovil(marca, subMarca, precio, color);
				//guardar en la lista 
				lista.add(auAux);
				System.out.println("El registro se guardo con existo");
				break; //rompe el case de ese momento y romper el flujo y regresar automaticamente al menu
			case 2: 
				System.out.println("2.- Mostrar la lista");
				System.out.println(lista);
				break;
			case 3: 
				System.out.println("3.- Editar");
				System.out.println("Ingresa el indice para editae");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				
				auAux = lista.get(indice);
				do {
					System.out.println("1.- Editar Marca");
					System.out.println("2.- Editar SubMarca");
					System.out.println("3.- Editar Precio");
					System.out.println("4.- Editar Color");
					System.out.println("5.- Regresar el menu principal");
					System.out.println("Elige una opcion valida en el menu");
					scan = new Scanner(System.in);
					menuEditar = scan.nextInt();
					
					switch(menuEditar) {
					case 1:
						System.out.println("Escribe la nueva marca");
						scan = new Scanner(System.in);
						marca = scan.nextLine();
						auAux.setMarca(marca);
						System.out.println("Se edito correctamente");
						break;
					case 2: 
						System.out.println("Escribe la nueva subMarca");
						scan = new Scanner(System.in);
						subMarca = scan.nextLine();
						auAux.setSubMarca(subMarca);
						System.out.println("Se edito correctamente");
						break;
					case 3:
						System.out.println("Escribe el nuevo precio");
						scan = new Scanner(System.in);
						precio = scan.nextInt();
						auAux.setPrecio(precio);
						System.out.println("Se edito correctamente");
						break;
					case 4:
						System.out.println("Escribe el nuevo color");
						scan = new Scanner(System.in);
						color = scan.nextLine();
						auAux.setColor(color);
						break;
					case 5:
						System.out.println("Regresando al menu principal");
						break;
						default: 
							System.out.println("Indice fuera de ramga, intenta con un dentro del menu");
							break;
					}// cierra el switch de editar
					
				}while(menuEditar != 5); //cierra el do de editar
				break;// cierra el case de editar 
			case 4:
				System.out.println("4.-Buscar un elemento");
				System.out.println("Indica el indice para mostras la informacion");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				auAux = lista.get(indice);
				System.out.println("Esta es la infromacion complemnta: \n" + auAux);
				break;
			case 5:
				System.out.println("5.- Eliminar");
				System.out.println("Indique el indice que desee eliminar");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				lista.remove(indice);
				System.out.println("Elemento eliminado\n Lista Actualizada\n"+lista);
				break;
			case 6:
				System.out.println("6.- Contar");
				System.out.println("Existen " + lista.size() + " Autos regustrados");
				break;
			case 7: 
				System.out.println("Saliendo del menu, vuelve pronto");
				break;
				default:
					System.out.println("Indice fuera de rango, inetena con uno dentro del menu");
					break;
			}
			
		}while(menuPrincipal != 7);

	}

}
