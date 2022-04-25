package tdd_junit;

public class Calculadora {
// somando dois números
	
	public int somar(int num1, int num2) {
		return num1 + num2;
	}

// subtraindo dois números
	
		public int subtrair(int num1, int num2) {
			return num1 - num2;
		}

// area do triangulo
		
	public int triangulo(int base, int altura) {
		return (base*altura)/2 ;
	}

// area do retangulo
	
	public int retangulo(int base, int altura) {
 		return base*altura;
		}

// area do circulo
	
		public double circulo(double raio) {
			return (double) (Math.PI * Math.pow(raio, 2));
			}
// area do trapezio
		
		public int trapezio(int basemaior, int basemenor, int altura) {
			// Área = (B + b) ∗ h / 2
	 		return (int) (basemaior+basemenor)*altura/2;
			}

// area do losango
		
		public double losango(double d1, double d2) {
			// Área = (D1 + D2)/2
	 		return (double) (d1 + d2)/2;
			}

// calculo do IMC
		
		public double imc(double peso, double altura) {
					// IMC = Peso / altura2
			 		return (double) peso/ Math.pow(altura, 2);
					}
		
}
