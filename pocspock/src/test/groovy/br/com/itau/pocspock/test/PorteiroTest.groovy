package br.com.itau.pocspock.test

import br.com.itau.pocspock.Porteiro
import spock.lang.Specification

class PorteiroTest extends Specification {
	
	def "deve verificar se o cliente é maior de idade"() {
		given: "deve verificar a idade do cliente a partir do documento de identificação"
		def idadeMaior = 22
		def idadeMenor = 17
		
		when: "verificar a idade"
		def porteiro = new Porteiro()
		def verificacaoMaiorIdade = porteiro.podeEntrar(idadeMaior)
		def verificacaoMenorIdade = porteiro.podeEntrar(idadeMenor)
		
		then: "deve liberar só para idade a partir de 18"
		verificacaoMaiorIdade
		!verificacaoMenorIdade
	}
	
	def "deve calcular o desconto conforme a idade"() {
		expect: "O desconto deve estar correto conforme a idade"
		new Porteiro().retornarDesconto(idade) == desconto
		
		where: 
		idade | desconto
		16    | 0
		18    | 0
		20    | 0
		21    | 5
		29    | 5
		30    | 10
		39    | 10
		40    | 15
		45    | 15
		49    | 15
		50    | 20
		51    | 20
	}
	
}
