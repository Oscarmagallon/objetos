package Agenda;

import java.util.Scanner;



public class Agenda {

	private String propietario;
	private Contacto[] vAgenda;

	public Agenda() {
		propietario = "";
		vAgenda = new Contacto[10];

	}

	public Agenda(String propietario) {
		this.propietario = propietario;
		vAgenda = new Contacto[10];
		vAgenda[0] = new Contacto("Juan", "999888777");
		vAgenda[1] = new Contacto("Pepe", "222222");
		vAgenda[2] = new Contacto("Silvia", "333333");
	}

	public Agenda(String propietario, int tam) {
		this.propietario = propietario;
		vAgenda = new Contacto[tam];
	}

	public static int verMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("Agenda telefonos 2.0 \n -------------- \n");
			System.out.println("1- Ver todos los contactos");
			System.out.println("2- Añadir contacto");
			System.out.println("3- Borrar contacto");
			System.out.println("4- Buscar contacto");
			System.out.println("5- Editar contacto");
			System.out.println("6- Salir");
			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				opc = 0;
				leer = new Scanner(System.in);
			}
			
			if (opc < 1 || opc > 6) {
				System.out.println("Opción no válida \n\n");
			}
		} while (opc < 1 || opc > 6);
		return opc;
	}

	public String getPropietario() {
		return propietario;
	}

	@Override
	public String toString() {
		String contactos = "";

		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i] != null) {
				contactos += vAgenda[i].toString() + "\n";
			}
		}

		return propietario + "\n" + contactos;
	}

	public void anadirContacto() {
		
		
	}
}
	
		




