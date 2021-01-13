package nochevieja;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dato;
		Scanner leer = new Scanner(System.in);
		Tiempo vEntrada[] = new Tiempo[10];
		int cont=0, aux=0;
		
		do {
			dato=leer.next();
			vEntrada[cont]=new Tiempo (dato);
			cont++;
		}while(!dato.equalsIgnoreCase("00:00"));
		for(Tiempo t:vEntrada) {
			if(t!=null) {
				System.out.println(minutosDiferencia());
			}else {
				break;
			}
		}
	}

}
