package ejercicio03;

public class CalculadoraDeCadenas {
	private String texto;
	
	public CalculadoraDeCadenas() {
		// TODO Auto-generated constructor stub
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String determinarSiElCaracterEstaEnUnaCadena (char caracter) {
		String resultado = "";
		
		if (texto.indexOf(caracter) != -1) {
			resultado = "El caracter si esta en la cadena";
		} else {
			resultado = "El caracter no esta en la cadena";
		}
		
		return resultado;
	}
	
	public int contarVocales(String texto) {
		texto = texto.toLowerCase();
		int contadorVocales = 0;
		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			if (caracter == 'a'|| caracter == 'e' || caracter == 'i'|| caracter == 'o'|| caracter == 'u') {
				contadorVocales++;
			}
		}
		
		return contadorVocales;
	}

}
