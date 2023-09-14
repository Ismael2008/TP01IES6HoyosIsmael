package ejercicio01;

public class Usuario {
	
	private String apellido;
	private String nombres;
    
	private String mail;
	private int edad;
	private double ingresosMensuales;
	private double gastosMensuales;
	
    public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getIngresosMensuales() {
		return ingresosMensuales;
	}

	public void setIngresosMensuales(double ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}

	public double getGastosMensuales() {
		return gastosMensuales;
	}

	public void setGastosMensuales(double gastosMensuales) {
		this.gastosMensuales = gastosMensuales;
	}
	
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
	
	public boolean puedeAhorrar() {
		return ingresosMensuales - gastosMensuales > 0;
	}
	
	public void mostrarDatos() {
		System.out.println("Apellido: " + apellido);
		System.out.println("Nombres: " + nombres);
		System.out.println("Correo: " + mail);
		System.out.println("Edad: " + edad);
		System.out.println("Ingresos Mensuales: $" + ingresosMensuales);
		System.out.println("Gastos Mensuales: $" + gastosMensuales);
		System.out.println("Es mayor de edad: " + esMayorDeEdad());
		System.out.println("Puede ahorrar: " + puedeAhorrar());
	}

}
