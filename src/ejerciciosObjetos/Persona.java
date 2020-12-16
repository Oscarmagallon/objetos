package ejerciciosObjetos;

import java.util.Random;
import java.util.Scanner;

public class Persona {
	private String nombre;
	private String dni;
	private int edad;
	private char sexo; //H-Hombre M-Mujer
	private double peso;
	private double altura; // altura en metros
	
	private final char HOMBRE='H'; // Constante hombre
	private final char MUJER='H'; //Constante mujer
	private final int SOBREPESO=1;
	private final int PESOIDEAL=0;
	private final int PESOBAJO=-1;
	
	public Persona() {
		this.nombre = "";
		dni = generarDNI();
		this.edad = 0;
		this.sexo = HOMBRE;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		
		this.nombre = nombre;
		dni = generarDNI();
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
        this.nombre = dimeNombre();
        this.dni = comprobarDNI(dni);
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
	
	public int calcularIMC() {
		double peso = this.peso / (altura*altura);
		if(peso< 18.5) {
			return PESOBAJO;
		}else if(peso>24.9) {
			return PESOIDEAL;
		}else {
			return SOBREPESO;
		}
	}
	public boolean esMayorDeEdad() {
		boolean mayorEdad=false;
		if(edad>=18){
			mayorEdad=true;
			return mayorEdad;
		}else {
			mayorEdad=false;
			return mayorEdad;
		}
	}
	private char comprobarSexo(char sexo) {
		if(sexo == HOMBRE || sexo == MUJER) {
			return sexo;
		}else {
			return HOMBRE;
		}
		
	}
	private String generarDNI() {
		Random r = new Random();
		String dni = "";
		
		for(int i = 0;i<8;i++) {
			dni+=r.nextInt(9);
		}
		dni+= "-" + gererarLetraDNI(dni);
		return dni;
		
	}
	private String gererarLetraDNI(String dni) {
		String letra ="";
		int resto = 0;
		int dniNum= Integer.valueOf(dni);
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		resto = dniNum%23;
		letra+=letras.substring(resto,resto+1);
		return letra;
	}
	private String comprobarDNI(String dni) {

        boolean valido = false;
        String letraValida, letraRecibida;
        String numDni;

        numDni=dni.substring(0,8);
        letraRecibida=dni.substring(9);

        letraValida=gererarLetraDNI(numDni);

        if(letraRecibida.equalsIgnoreCase(letraValida)) {
            valido=true;
        }
        if (valido) {
            return dni;
        } else {
            //Dos opciones - 1º Corregir letra mal o
            //2º generar un dni nuevo
            return numDni+"-"+letraValida;
        }
    }
	private String dimeNombre() {
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime nombre");
		this.nombre=leer.next();
		return nombre;
		
	}
	private char dimeSexo() {
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime sexo");
		this.sexo=leer.next();
		return s;
		
	}
		
		
		
	
	

	@Override
	public String toString() {
		String sexo;
		if (this.sexo==HOMBRE) {
			sexo="Hombre";
		}else {
			sexo="Mujer";
		}
		return "Persona nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ "kg, altura=" + altura + "m";
	}
	
	
	

}
