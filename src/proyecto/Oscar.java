package proyecto;

public class Oscar {
	private String Nombre;
	private String Apellidos;
	private String Dni;
	public Oscar(String nombre, String apellidos, String dni) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	
}
