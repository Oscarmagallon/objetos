package ejerciciosObjetos;

public class Persona {
	private String nombre;
	private String dni;
	private int edad;
	private char sexo; //H-Hombre M-Mujer
	private double peso;
	private float altura; // altura en metros
	
	private final char HOMBRE='H'; // Constante hombre
	private final char MUJER='H'; //Constante mujer
	private final int SOBREPESO=1;
	private final int PESOIDEAL=0;
	private final int PESOBAJO=-1;
	
	public Persona() {
		this.nombre = "";
		dni = "";
		this.edad = 0;
		this.sexo = HOMBRE;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		
		this.nombre = nombre;
		dni = "";
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, String dni, int edad, char sexo, double peso, float altura) {
		super();
		this.nombre = nombre;
		this.dni = dni;
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
