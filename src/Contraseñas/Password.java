package Contraseñas;

import java.util.Random;

public class Password {
	private int longitud;
	private String contrasena;
	
	public Password() {
		longitud = 8;
		contrasena="AAAaa111111"; // Borrar luego despues de las pruebas.
		
	}
	public Password(int longitud) {
		this.longitud = longitud;
		contrasena="";
		generarPassword();
		
	}
	public boolean esFuerte() {
		
		
		
		return false;
	}
	private void generarPassword() {
		String letraMi= "abcdefghijklmnñopqrstuvwxyz";
		String letraMa= letraMi.toUpperCase();
		String numeros="0123456789";
		String posibi= letraMi + letraMa + numeros;
		Random r = new Random();
		int aleatorio=0;
		for(int i = 0;i<longitud;i++) {
			aleatorio=r.nextInt(posibi.length());
			contrasena += posibi.substring(aleatorio, aleatorio+1);
		}
		
	}
	public boolean esFuerte() {
		String letraMi= "abcdefghijklmnñopqrstuvwxyz";
		String letraMa= letraMi.toUpperCase();
		String numeros="0123456789";
		int conMin=0,contMay=0,contNums=0;
		
		for(int i = 0; i<letraMi.length();i++){
			if(contrasena.substring(i,i+1).equals(anObject)) {
				
			}
		}
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
