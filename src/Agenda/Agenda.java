package Agenda;

import java.util.Scanner;



public class Agenda {
	/**
	 * @author Óscar Magallón
	 * @version 1.0
	 */
	
/**
 * Inicializamos variables
 */
	private String propietario;
	private Contacto[] vAgenda;

	/**
	 * Constructor por defecto
	 */
	public Agenda() {
		propietario = "";
		vAgenda = new Contacto[10];

	}
/**
 * 
 * @param propietario Recibe de parametro propietario y rellena la agenda con contactos
 */
	public Agenda(String propietario) {
		this.propietario = propietario;
		vAgenda = new Contacto[10];
		vAgenda[0] = new Contacto("Juan", "999888777");
		vAgenda[1] = new Contacto("Pepe", "222222");
		vAgenda[2] = new Contacto("Silvia", "333333");
	}

	/**
	 * Definimos un tamaño para la agenda
	 * @param propietario Propietario de la agenda
	 * @param tam Recibe como parametro el tamaño
	 * 
	 */
	public Agenda(String propietario, int tam) {
		this.propietario = propietario;
		vAgenda = new Contacto[tam];
	}

	/**
	 * No recibe nada
	 * @return Devuelve el numero seleccionado del 1 al 6
	 * 
	 */
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
/**
 * 
 * @return devuelve el propietario
 */
	public String getPropietario() {
		return propietario;
	}
/**
 * @return devuelve el propietario y los contactos
 */
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
	
	/**
	 * 
	 * @return devuelve la primeta poscion libre el vector
	 */
	private int buscarPosicion() {
		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i] == null) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 
	 * @param busqueda recibe el nombre o telefono a buscar
	 * @return devuelve la posicion del vector en la que se encuentra la busqueda
	 * o un -1 si no se ha encontrado
	 */
	private int buscarPosicion(String busqueda) {
		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i].equals(busqueda)) {
				return i;
			}
		}
		return -1;
	}
/**
 * Lee el nombre y el telefono del contacto lo guarda en el vector
 *
 */
	public void anadirContacto() {
		Scanner leer = new Scanner(System.in);
		String nombre, telefono;
		int pos;
		
		try {
			System.out.println("Añadiendo un nuevo contacto");
			System.out.println("Dime el nombre del contacto");
			nombre = leer.nextLine();
			System.out.println("Dime el telefono del contacto");
			telefono = leer.next();
			
			Contacto c = new Contacto(nombre, telefono);
			pos = buscarPosicion();
			vAgenda[pos] = c;
			System.out.println("Contacto añadido");
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Tu agenda esta llena");
		} catch (Exception e) {
			System.out.println("El contacto no se ha podido añadir");
		}
		
	}
	/**
	 * Busca un contacto o numero en el vector para borrarlo
	 */

	public void borrarContacto() {
		Scanner leer = new Scanner(System.in);
		String busqueda;
		int pos;
		
		try {
			System.out.println("Borrando contacto");
			System.out.println("Dime el nombre o el telefono del contacto");
			busqueda = leer.nextLine();
			
			pos = buscarPosicion(busqueda);
			vAgenda[pos] = null;
			System.out.println("Contacto Borrado");
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No se ha encontrado el contacto");
		} catch (Exception e) {
			System.out.println("El contacto no se ha podido borrar");
		}
		
	}
	
}
	
		




