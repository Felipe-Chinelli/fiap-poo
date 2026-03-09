package br.com.aerogerador.model;

public class Aerogerador {
	
	public String cor;
	public int pas;
	public double alturaM;
	public double energia;
	public String modeloMotor;
	
	public Aerogerador(String cor, String modeloMotor, int pas, double alturaM) {
        this.cor = cor;
        this.pas = pas;
        this.modeloMotor = modeloMotor;
        this.alturaM = alturaM;
        this.energia = 0.00;
    }

    public void adicionarEnergia(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de Energia deve ser maior que zero.");
        }
        this.energia += valor;
        System.out.println("Tudo operando normalmente, o valor de energia é: " + this.energia);
    }

    public void consulmirEnergia(double custo) {
        if (custo <= 0) {
            System.out.println("Erro, o aerogerador está consulmindo mais do que gerando.");
            return;
        }
        if (this.energia < custo) {
            System.out.println("Erro: Energia insulficeiente para continuar operando.");
            return;
        }
        this.energia -= custo;
        System.out.println("Energia Restante: " + this.energia);
    }
}


