package br.com.itau.pocspock.test

import spock.lang.Specification

class SobremesasTest extends Specification {
	
	def "deve ter mais de 4 frutas na salada"() {
		given: "coletar as frutas para a salada"
		
		def pacote1 = ["maça", "abacate"]
		def pacote2 = ["abacaxi", "uva", "laranja"]
		
		when: "Preparar a salada"
		def saladas = pacote1 + pacote2
		
		then: "A salada deve conter pelo menos 4 frutas"
		saladas.size()>=4
	}
	
}
