package Agenda;

public class Contacto {
	/**
	 * Declaramos variables
	 */
	private String nombre;
	private String telefono;
	
/**
 *  constructor por defecto recibe nombre y telefono
 * @param nombre recibe nombre
 * @param telefono recibe telefono
 */
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

/**
 * 
 * @return devuelve el nombre 
 */
	public String getNombre() {
		return nombre;
	}

/**
 * 
 * @param nombre define el nuevo nombre del contacto
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return telefono
 */

	public String getTelefono() {
		return telefono;
	}

/**
 * 
 * @param telefono define el nuevo telefono
 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

/**
 * @return nombre y telefono del contacto
 */
	@Override
	public String toString() {
		return nombre + " ---- " + telefono;
	}
	
	/**
	 * 
	 * @param busqueda recibe la busqueda
	 * @return verdado o falso
	 */
	public boolean comparar(String busqueda) {
		if (nombre.equalsIgnoreCase(busqueda) || telefono.equalsIgnoreCase(busqueda)) {
			return true;
		}else {
			return false;
		}
	}
}
