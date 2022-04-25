package ExerciciosTDD;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import tdd_junit.Calculadora;

/*
Fafiretech         Curso Automação de Testes
Aluna: Micheline Medeiros

Exercicios de TDD: Implementar métodos de cálculos de área de figuras planas na classe ‘Calculadora’,
utilizando os ciclos TDD e realização de testes unitários para validar cada método criado.
Exercicios 1 ao 5
*/

public class calculadoraExercicios1ao5 {
    
	static Calculadora calculadora;
		
	@BeforeAll
	static void setupAll() {

	System.out.println("** Lista de Exercicios TDD **");
	calculadora = new Calculadora();
	} 

	@Disabled     
	@Test
	void testTriangulo() {
		
		/* Calcula a area de um Triangulo - 
		EX01 – Implementação do cálculo da área do triangulo: Área = b ∗ h / 2 
		*/
		
		System.out.println("Exercicio 01 =>Teste do calculo da area do triangulo. Area = b * h / 2 ");
		System.out.println("A area de um Triangulo com base 10 e altura 5 = " + calculadora.triangulo(10,5) + "\n");	
		
	}
	
	@Disabled    
	@Test
	void testRetangulo() {
		/*
		 EX02 – Implementação do cálculo da área do Retângulo: Área = b ∗ h 
		 */

		System.out.println("Exercicio 02 =>Teste do calculo da area do Retangulo. Area = b * h ");
		System.out.println("A area de um Retangulo com base 10 e altura 5 = " + calculadora.retangulo(10,5) + "\n");	
		
	}
	
	@Disabled
	@Test
	void testCirculo() {
		/*
		 * EX03 – Implementação do cálculo da área do círculo: Área = Pi * raio^2
		 * pi = 3,1416 e r = raio
		 */
		System.out.println("Exercicio 03 =>Teste do calculo da area do Circulo. Area = Pi * raio^2");
		System.out.println("A area de um Circulo com raio 20 = " + calculadora.circulo(20) + "\n");	
			
	}
	
	@Disabled
	@Test
	void testTrapezio() {
		/*
		 * EX04 – Implementação do cálculo da área do trapezio: Área = (B + b) ∗ h / 2
		 * Base maior, Base menor, Altura
		 */
		System.out.println("Exercicio 04 =>Teste do calculo da area do Trapezio. Area = (B + b) * h /2");
		System.out.println("A area de um Trapezio com Base maior 20, Base menor 10 e Altura 5 = " + calculadora.trapezio(20,10,5) + "\n");	
			
	}
	
	@Disabled 
	@Test
	void testLosango() {
		/*
		 * EX05 – Implementação do cálculo da área do losango: Área = (D1 + D2) /2
		 * Area = (Diagonal 1 + Diagonal 2) / 2
		 */
		System.out.println("Exercicio 05 =>Teste do calculo da area do Losango. Area = (D1 + D2)/2");
		System.out.println("A area de um Losango com D 20 e D 15 = " + calculadora.losango(20,15) + "\n");	
			
	}

}
