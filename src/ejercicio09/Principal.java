package ejercicio09;

import ejercicio01.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellido = "Hoyos";
		String nombres = "Ismael Angel";
		String mail = "ismaelangel022@gmail.com";
		int edad = 34;
		double ingresosMensuales = 35000;
		double gastosMensuales = 25000;
		
		Usuario usuario = new Usuario();
		usuario.setApellido(apellido);
		usuario.setNombres(nombres);
		usuario.setMail(mail);
		usuario.setEdad(edad);
		usuario.setIngresosMensuales(ingresosMensuales);
		usuario.setGastosMensuales(gastosMensuales);
        usuario.mostrarDatos();
	}

}
