package calculadora;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import tdd_junit.Calculadora;

class calculadoraTest {
// CTRL SHIFT O - organiza os imports
// Classe para Teste da Calculadora Java - Operacoes de Soma e Subtracao
	
	static Calculadora calculadora;
	
	
	@BeforeAll
	static void setupAll() {

	System.out.println("** BeforeAll -Executado antes de todos os Testes **");
	calculadora = new Calculadora();
	}
		
	@Test
	void testSoma() {
		// Soma dois numeros. Utiliza a classe Java de Calculadora - Somar
		System.out.println("=>Test - Teste de soma");
		System.out.println("A soma dos numeros 2 e 2 = " + calculadora.somar(2,2) + "\n" );	
	}
	
	@Test
	void testSubtracao() {
		// subtrair dois numeros. Utiliza a classe Java de Calculadora  - Subtrair 
		System.out.println("=>Test - Teste de subtracao");
		System.out.println("A subtracao dos numeros 5 e 2 = " + calculadora.subtrair(5,2) + "\n");	
		
	}

	
}
