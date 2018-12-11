package proyecto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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
	public void write() {
		// Copiar ficheros
		File origen = new File("origen.txt");
		File destino = new File("destino.txt");

		try {
		  InputStream in = new FileInputStream(origen);
		  OutputStream out = new FileOutputStream(destino);
						
		  byte[] buf = new byte[1024];
		  int len;

		  while ((len = in.read(buf)) > 0) {
		    out.write(buf, 0, len);
		  }
				
		  in.close();
		  out.close();
		} catch (IOException ioe){
		  ioe.printStackTrace();
		}

	}
}
