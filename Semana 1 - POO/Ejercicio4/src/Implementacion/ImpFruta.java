package Implementacion;
//para realizar una herencia de metodos, se utiliza la aplraba reservada extends
public class ImpFruta extends ImpGenerica{
	
	//metodo personalizado 
	public void contar() {
		System.out.println("Existen " + hash.size() + " frutas registradas");
	}
}
