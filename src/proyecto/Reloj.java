package proyecto;

public class Reloj {
	private int Nombre;
	private int Apellidos;
	private int Dni;
	public Reloj(int nombre, int apellidos, int dni) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Dni = dni;
	}
	public int getNombre() {
		return Nombre;
	}
	public void setNombre(int nombre) {
		Nombre = nombre;
	}
	public int getApellidos() {
		return Apellidos;
	}
	public void setApellidos(int apellidos) {
		Apellidos = apellidos;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	
}
