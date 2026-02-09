package Principal;
@FunctionalInterface //este es un marcador(anotaciones) especial para indicar que esta interface es una 
//interface funcional
//una interface funcionales una interface con un solo metodo abtracto y se utilizan con funciones lambda
public interface ISaludo {
	
	public String saludar(String saludo, String despedida);

}
