package br.com.itau.pocspock;

public class CalculadoraIMC {
	
	private double massa;
	private double altura;
	
	public CalculadoraIMC()
	{}
	
	public CalculadoraIMC(double massa, double altura) {
		this.massa = massa;
		this.altura = altura;
	}
	
	public void setMassa(double massa) {
		this.massa = massa;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC() {
		//IMC = massa / altura²;
		return this.massa / (this.altura * this.altura); 
	}
	
	/*
	IMC abaixo de 18,5 = Você esta abaixo do peso ideal;
	IMC entre 18,5 e 24,9 = Parabéns – você esta em seu peso ideal;
	IMC entre 25,0 e 29,9 = Você esta acima do seu peso;
	IMC entre 30,0 3 34,9 = Obesidade grau I;
	IMC entre 35,0 e 39,9 = Obesidade grau II;
	IMC acima de 40,0 = Obesidade grau III.
	*/

}
