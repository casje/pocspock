package br.com.itau.pocspock.test

class Pessoa {
	
	String nome
	int idade
	
	static void main (args) {
		println("Hello Groovy")
		
		def pessoinha = new Pessoa(nome: 'Claudio', idade: 40)
		
		pessoinha.setNome("Claudio Alves Jr")
		
		println("Nome é: ${pessoinha.nome} e a idade é de ${pessoinha.idade}")
		
		println("""
			Primeira mensagem
			Segunda mensagem
		""")
		
		def cores = ["azul", "preto", "amarelo"]
		
		println(cores[0])
		println(cores[-1])
		
		println(cores.first())
		println(cores.last())
		
		cores.each {
			println("cor: ${it}")
		}
		
		cores.each {cor ->
			println("cor: ${cor}")
		}
		
		10.times { idx ->
			println("abacate no indice ${idx}")
		}
		
		// Em java
		if(cores != null && !cores.isEmpty()) {
			println("a lista cores nao esta vazia")
		}
		
		// Em Groovy
		if(cores) {
			println("a lista cores nao esta vazia")
		}
		
		def apelido = 'zeze'
		if(apelido) {
			println('existe apelino')
		}
		apelido = null
		if(apelido) {
			println('existe apelino')
		}
		
		def filhos = 5
		if(filhos) {
			println("tem filhos")
		}
		filhos=0
		if(filhos) {
			println("tem filhos")
		}
		
		List bairros = null
		println(bairros?.first())
		
		bairros = ['Ipiranga', 'Mooca']
		println(bairros?.first())
	}
}
