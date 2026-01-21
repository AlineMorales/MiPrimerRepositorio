package Principal;

import Entidades.Fruta;
import implementacionLista.ImpFrutaL;

public class PrincipalLista {
	public static void main(String[] args) {
		
		Fruta f1 = new Fruta("Mango", "Amarillo", 1, 35, "Verano");
		Fruta f2 = new Fruta("Piña", "Amarillo", 1, 50, "Verano");
		Fruta f3 = new Fruta("kiwi", "verde",2 , 45, "otoño");
		Fruta f4 = new Fruta("Melon", "Naranja", 3, 75 , "Verano");
		Fruta f5 = new Fruta("Manzana", "Rojo", 3, 24, "Verano");
		Fruta f6 = new Fruta ("Fresa", "Rojo", 1,60,"Verano");
		Fruta f7 = new Fruta("Sandia ", " Roja ",2,42,"Verano" );
		
		Fruta auxF = null;
		//implementacion 
		ImpFrutaL impF = new ImpFrutaL();
		
		//guardar
		impF.create(0, f1);
		impF.create(1, f2);
		impF.create(2, f3);
		impF.create(3, f4);
		
		//mostrar
		impF.read();
	
		
		
		
	}

}
