package ExerciciosTDD;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import tdd_junit.Calculadora;

public class calculadoraExercicios6ao11 {

/*
Fafiretech         Curso Automação de Testes
Aluna: Micheline Medeiros

Exercicios de TDD:  Implementar calculo de IMC na classe ‘Calculadora’,utilizando os ciclos TDD e 
realização de testes unitários para validar cada método criado.
IMC = Peso / altura2.
Exercicios 6 ao 11     
*/
	
 static Calculadora calculadora;
	
	@BeforeAll
	static void setupAll() {

	System.out.println("** Lista de Exercicios TDD para o IMC**");
	calculadora = new Calculadora();
	} 

	@Test
	void testIMC() {
		
	/* Calcula o IMC - validacao abaixo do peso 
    EX06 – Implementação de teste unitário para cálculo de IMC para abaixo do peso 
	IMC < 18, 5 => formula: Peso / altura2
	*/
		
	System.out.println("Exercicio 06 =>Calculo IMC abaixo do peso. IMC < 18, 5 ");
	System.out.println("Para um Peso de 49kg e uma Altura de 1,80 tem IMC " + calculadora.imc(49, 1.80) + "\n");	
		
		
	/*Calcula o IMC - validacao peso normal
	 EX07 – Implementação de teste unitário para cálculo de IMC para peso normal
	 IMC > 18, 5 e < 24,9
	 */
	
	System.out.println("Exercicio 07 =>Calculo IMC peso normal. IMC > 18, 5 e < 24,9 ");
	System.out.println("Para um Peso de 65kg e uma Altura de 1,75 tem IMC " + calculadora.imc(65, 1.75) + "\n");	

	/*Calcula o IMC - validacao peso normal
	 EX08 – Implementação de teste unitário para cálculo de IMC para sobrepeso
     IMC > 25 e < 29,9
	 */
	
	System.out.println("Exercicio 08 =>Calculo IMC sobrepeso. IMC > 25 e < 29,9 ");
	System.out.println("Para um Peso de 76kg e uma Altura de 1,66 tem IMC " + calculadora.imc(76, 1.66) + "\n");	

	/*Calcula o IMC - Obesidade Grau 1
	 EX09 – Implementação de teste unitário para cálculo de IMC para obesidade grau 1
	 IMC > 30 e < 34,9
	 */
	
	System.out.println("Exercicio 09 =>Calculo IMC para Obesidade Grau 1. IMC > 30 e < 34,9 ");
	System.out.println("Para um Peso de 96kg e uma Altura de 1,66 tem IMC " + calculadora.imc(86, 1.66) + "\n");	


	/*Calcula o IMC - Obesidade Grau 2
	EX10 – Implementação de teste unitário para cálculo de IMC para obesidade grau 2
	IMC > 35 e < 39,9
	 */
	
	System.out.println("Exercicio 10 =>Calculo IMC para Obesidade Grau 2. IMC > 35 e < 39,9 ");
	System.out.println("Para um Peso de 100kg e uma Altura de 1,66 tem IMC " + calculadora.imc(100, 1.66) + "\n");	

	/*Calcula o IMC - Obesidade Grau 3
	EX11 – Implementação de teste unitário para cálculo de IMC para obesidade grau 3
	IMC > 40
	 */
	
	System.out.println("Exercicio 11 =>Calculo IMC para Obesidade Grau 3. IMC > 40 ");
	System.out.println("Para um Peso de 150kg e uma Altura de 1,66 tem IMC " + calculadora.imc(150, 1.66) + "\n");	
		
	}
	
}
