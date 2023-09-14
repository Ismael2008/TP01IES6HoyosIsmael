package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = 'e';
		String cadena = "Hola Mundo";
		
		CalculadoraDeCadenas calcu = new CalculadoraDeCadenas();
		calcu.setTexto(cadena);
		System.out.println(calcu.determinarSiElCaracterEstaEnUnaCadena(caracter));
		System.out.println("La cantidad de vocales son: "+ calcu.contarVocales(cadena));

	}

}
