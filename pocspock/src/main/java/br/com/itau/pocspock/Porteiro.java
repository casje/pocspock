package br.com.itau.pocspock;

public class Porteiro {
	
	public boolean podeEntrar(int idade) {
		return idade >= 18;
	}
	
	public double retornarDesconto(int idade) {
		double desconto = 0;
		
		if(idade < 21) {
			desconto = 0;
		}
		else if (idade < 30) {
			desconto =  5;
		}
		else if(idade < 40) {
			desconto =  10;
		}
		else if(idade < 50) {
			desconto =  15;
		}
		else if(idade >= 50) {
			desconto =  20;
		}
		
		return desconto;
	}

}
