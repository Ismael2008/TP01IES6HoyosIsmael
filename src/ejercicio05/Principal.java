package ejercicio05;

import ejercicio02.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//codigo que muestra el factorial de un numero ingresado
		
		int numero = 6;
         
		if (numero >= 0 && numero <= 10) {
			int factorial = Calculadora.calcularFactorial(numero);
			System.out.print(numero + "! = ");
			
			for (int i = numero; i >= 1; i--) {
				System.out.print(i);
				if (i > 1) {
					System.out.print(" * ");
				}
			}
			
			System.out.print(" = " + factorial);
			
		} else {
			System.out.println("El numero ingresado debe estar en el rango [0, 10]");
		}

		//codigo que muestra todos los factoriales del 0 haasta el 10
		
		/*for (int numero = 0; numero <= 10; numero++) {
			int factorial = Calculadora.calcularFactorial(numero);
			System.out.print(numero + "!");
			
			if (numero > 0) {
				System.out.print(" = ");
				for (int i = numero; i >= 1; i--) {
					System.out.print(i);
					if (i > 1) {
						System.out.print(" * ");
					}
				}
			}
			
			System.out.println(" = " + factorial);
		}*/

	}

}
