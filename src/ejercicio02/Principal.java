package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroA = 20;
		int numeroB = 0;
		
		Calculadora calculadora = new Calculadora ();
		calculadora.setNumeroA(numeroA);
		calculadora.setNumeroB(numeroB);
		System.out.println("El resultado de la operacion es: "+ calculadora.sumar());
		System.out.println("El resultado de la operacion es: "+ calculadora.restar());
		System.out.println("El resultado de la operacion es: "+ calculadora.multiplicar());
		System.out.println("El resultado de la operacion es: "+ calculadora.dividir());
		System.out.println("El resultado de la operacion es: "+ calculadora.potenciacion());
		System.out.println("El resultado de la operacion es: "+ calculadora.radicacion());
	}

}
