package br.com.itau.pocspock.test

import spock.lang.Specification

class MusicasTest extends Specification {
	
	def "deve cantar a musica certa"() {
		given: "receber o nome da moça"
		def mina = "Jenifer"
		
		when: "cante a música"
		def musica = "o nome dela é $mina"
		
		then: "a musica deve ser sobre a Jenifer"
		musica == "o nome dela é Jenifer"
	}
	
}
