package ejercicio05;

import ejercicio02.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 8;
		
		if (numero >= 0 && numero <= 10) {
			int factorial = Calculadora.calcularFactorial(numero);
			System.out.println(numero + "! = " + factorial);
		} else {
			System.out.println("El numero ingresado debe estar en el rango [0, 10]");
		}

	}

}
