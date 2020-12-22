package password;

import java.util.Random;

public class Password {
	private int longitud;
	private String contrasena;

	public Password() {
		longitud = 0;
		generarPassword(1); // Borrar luego despues de las pruebas.
		longitud = contrasena.length();
	}

	public Password(int longitud) {
		this.longitud = longitud;
		contrasena = "";
		generarPassword();

	}
	
	private void generarPassword(int num) {
		String letraMi = "abcdefghijklmnñopqrstuvwxyz";
		String letraMa = letraMi.toUpperCase();
		String numeros = "0123456789";
		String posibi = letraMi + letraMa + numeros;
		Random r = new Random();
		int aleatorio = 0;
		while (esFuerte() == false) {
			for (int i = 0; i < longitud; i++) {
				aleatorio = r.nextInt(posibi.length());
				contrasena += posibi.substring(aleatorio, aleatorio + 1);
			}
			longitud++;
		}
			
		

	}

	private void generarPassword() {
		String letraMi = "abcdefghijklmnñopqrstuvwxyz";
		String letraMa = letraMi.toUpperCase();
		String numeros = "0123456789";
		String posibi = letraMi + letraMa + numeros;
		Random r = new Random();
		int aleatorio = 0;
		//while (esFuerte() == false) {
			for (int i = 0; i < longitud; i++) {
				aleatorio = r.nextInt(posibi.length());
				contrasena += posibi.substring(aleatorio, aleatorio + 1);
			}

		//}

	}

	public boolean esFuerte() {
		String letraMi = "abcdefghijklmnñopqrstuvwxyz";
		String letraMa = letraMi.toUpperCase();
		String numeros = "0123456789";
		int conMin = 0, contMay = 0, contNums = 0;

		for (int i = 0; i < longitud; i++) {

			for (int j = 0; j < letraMa.length(); j++) {

				if (contrasena.substring(i, i + 1).equals(letraMa.substring(j, j + 1))) {
					contMay++;
				}
				if (contrasena.substring(i, i + 1).equals(letraMi.substring(j, j + 1))) {
					conMin++;

				}
			}
		}
		for (int i = 0; i < contrasena.length(); i++) {
			for (int j = 0; j < numeros.length(); j++) {
				if (contrasena.substring(i, i + 1).equals(numeros.substring(j, j + 1))) {
					contNums++;
				}
			}
		}
		if (contMay > 2 && contNums > 5 && conMin > 1) {
			return true;
		}
		return false;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

}
