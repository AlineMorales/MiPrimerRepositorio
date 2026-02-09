package com.mx.ClaseAbstracta;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar Abogado 
		Abogado abogado = new Abogado("Martin", "Mendez", 34, 254733258, "UNAM", 7, "De lo familiar", "DIF", 3000);
		System.out.println(abogado);
		abogado.trabajar();
		abogado.cobrar(abogado.getTipo(), abogado.getHonorarios());
		
		//instacir Medico 
		Medico medico = new Medico("Mariana", "Montero", 32, 4815848, "Buap", 5, "Medico de trabajo", "Planta textilera", 3500);
		System.out.println(medico);
		medico.trabajar();
		medico.cobrar(medico.getEspecialidad(), medico.getCostoConsulta());

	}

}
