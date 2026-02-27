package br.com.aerogerador.main;

import br.com.aerogerador.model.Aerogerador;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aerogerador aerogerador1 = new Aerogerador();
		aerogerador1.cor = "Branco";
		aerogerador1.pas = 3;
		aerogerador1.alturaM = 120;
		
		Aerogerador aerogerador2 = new Aerogerador();
		aerogerador2.cor = "Vermelho";
		aerogerador2.pas = 6;
		aerogerador2.alturaM = 200;
		
		System.out.println("--- Sistema Aerogerador ---");
		System.out.println("Aerogerador Cor: " + aerogerador1.cor + "| Pas: " + aerogerador1.pas + "| Altura M: " + aerogerador1.alturaM);
		System.out.println("Aerogerador Cor: " + aerogerador2.cor + "| Pas: " + aerogerador2.pas + "| Altura M: " + aerogerador2.alturaM);
		System.out.println("--- Sistema Aerogerador ---");

	}

}
