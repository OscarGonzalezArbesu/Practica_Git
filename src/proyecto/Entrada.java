package proyecto;

import java.util.Scanner;

public class Entrada {
	Scanner tc;
	public Entrada() {
		tc=new Scanner(System.in);
	}
	public String cadena() {
		return tc.nextLine();
	}
}
