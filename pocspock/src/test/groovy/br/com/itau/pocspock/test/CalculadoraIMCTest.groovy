package br.com.itau.pocspock.test

import br.com.itau.pocspock.CalculadoraIMC
import spock.lang.Specification

class CalculadoraIMCTest extends Specification {
	
	/*
	 IMC abaixo de 18,5 = Você esta abaixo do peso ideal;
	 IMC entre 18,5 e 24,9 = Parabéns – você esta em seu peso ideal;
	 IMC entre 25,0 e 29,9 = Você esta acima do seu peso;
	 IMC entre 30,0 3 34,9 = Obesidade grau I;
	 IMC entre 35,0 e 39,9 = Obesidade grau II;
	 IMC acima de 40,0 = Obesidade grau III.
	 */
	
	def "deve verificar se o cliente esta abaixo do peso ideal"() { 
		given: "IMC abaixo de 18,5 = Você esta abaixo do peso ideal"
		def massa = 55.0
		def altura = 1.75
		
		when: "verificar o IMC"
		def calculadoraIMC = new CalculadoraIMC(massa, altura)
		def imc = calculadoraIMC.calcularIMC()
		
		then: "o peso deve ser abaixo do ideal"
		imc < 18.5
	}
	
	def "deve verificar se o cliente esta no peso ideal"() {
		given: "IMC entre 18,5 e 24,9 = Parabéns – você esta em seu peso ideal"
		def massa = 60.0
		def altura = 1.75
		
		when: "verificar o IMC"
		def calculadoraIMC = new CalculadoraIMC()
		calculadoraIMC.setMassa(massa)
		calculadoraIMC.setAltura(altura)
		def imc = calculadoraIMC.calcularIMC()
		
		then: "o peso deve estar no ideal"
		imc >= 18.5 && imc <= 24.9 
	}
	
	def "deve verificar se o cliente esta acima do peso ideal"() {
		given: "IMC entre 25,0 e 29,9 = Você esta acima do seu peso"
		def massa = 78.0
		def altura = 1.75
		
		when: "verificar o IMC"
		def calculadoraIMC = new CalculadoraIMC(massa, altura)
		def imc = calculadoraIMC.calcularIMC()
		
		then: "o peso deve estar no ideal"
		imc >= 25.0 && imc <= 29.9
	}
}
