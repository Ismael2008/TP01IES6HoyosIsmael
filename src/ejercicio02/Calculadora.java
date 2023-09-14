package ejercicio02;

public class Calculadora {
	
	private double numeroA;
	private double numeroB;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public double getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(double numeroA) {
		this.numeroA = numeroA;
	}

	public double getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(double numeroB) {
		this.numeroB = numeroB;
	}
	
	public double sumar() {
		double resultado = 0;
		resultado = numeroA + numeroB;
		return resultado;
	}
	
	public double restar() {
		double resultado = 0;
		resultado = numeroA - numeroB;
		return resultado;
    }
	
	public double multiplicar() {
		double resultado = 0;
		resultado = numeroA * numeroB;
		return resultado;
    }
	
	 public String dividir() {
		 double resultado = 0;
	     if (numeroB == 0) {
	        return "No se puede dividir por cero.";
	     }
	     resultado = numeroA / numeroB;
	        return resultado+"";
    }
	 
	 public double potenciacion() {
		 double resultado = 0;
	     resultado = Math.pow(numeroA, numeroB);
	     return resultado;
	}
	 
	 public String radicacion() {
		 double resultado = 0;
	      if (numeroB == 0) {
	          return "No se puede calcular la raíz con índice cero.";
	          
	      }
	       resultado = Math.pow(numeroA, 1.0 / numeroB);
	       return resultado+"";
	}
	 
	 public static void calcularParImpar(int numero) {
		 
		 if (numero % 2 == 0) {
			 int triple = numero * 3;
			 System.out.println("El numero es par.");
			 System.out.println("El triple del numero es: " + triple);
		 } else {
			 int doble = numero * 2;
			 System.out.println("El numero es impar.");
			 System.out.println("El doble del numero es: " + doble);
			 
		 }
	 }
	 
	 public static int calcularFactorial(int numero) {
		 if (numero == 0 || numero == 1) {
			 return 1;
		 } else {
			 int factorial = 1;
			 for (int i = 2; i <= numero; i++) {
				 factorial *= i;
			 }
			 
			 return factorial;
		 }
	 }
	 
	 public static void cuentaAtrasFor() {
		 for (int i = 320; i >= 160; i -= 20) {
			 System.out.println(i);
		 }
	 }
	 
	 public static void cuentaAtrasWhile() {
		 int numero = 320;
		 while (numero >= 160) {
			 System.out.println(numero);
			 numero -= 20;
		 }
	 }
	 
	 public static void cuentaAtrasDoWhile() {
		 int numero = 320;
		 do {
			 System.out.println(numero);
			 numero -=20;
		 } while (numero >= 160);
		 
	 }
}
