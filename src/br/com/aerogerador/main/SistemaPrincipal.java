package br.com.aerogerador.main;

import br.com.aerogerador.model.Aerogerador;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aerogerador aerogerador1 = new Aerogerador("Branco", "R852", 3, 120 );
		System.out.println("Energia Aerogerador 1");
		aerogerador1.adicionarEnergia(2500);
		
		Aerogerador aerogerador2 = new Aerogerador("Vermelho", "V776", 6, 200);
		System.out.println("Energia Aerogerador 2");
		aerogerador2.adicionarEnergia(500);
		
		System.out.println("--- Sistema Aerogerador ---");
        System.out.println("Aerogerador: " + aerogerador1.cor + " | Energia: V " + aerogerador1.energia + " | CPF: " + aerogerador1.modeloMotor);
        System.out.println("Aerogerador: " + aerogerador2.cor + " | Energia: V " + aerogerador2.energia + " | CPF: " + aerogerador2.modeloMotor);
        
        System.out.println("Comsumo Aerogerador 1");
        aerogerador1.consulmirEnergia(200);
        System.out.println("Comsumo Aerogerador 2");
        aerogerador2.consulmirEnergia(2000);


	}

}
