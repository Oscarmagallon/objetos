package Agenda;

import java.util.Scanner;

public class Agenda {
private int tam = 20;
 private int vNums[]= new int [tam];
 private String vNombres[]= new String [tam];
 private int numero=0;

 

 public Agenda() {
	this.tam = 20;
	this.vNums = new int [tam];
	this.vNombres = new String [tam];
	this.numero=0;

}
 public void InicializarVectores () {
	 for(int i = 0 ;i<tam;i++) {
		 vNombres[i]="";
		 vNums[i]=0;
		 }
 }
 public void rellenarVectores () {
	 Scanner leer = new Scanner(System.in);
	 for (int i = 0; i < tam;i++) {
		 if (vNombres[i].equals("") && vNums[i]==0) {
			 System.out.println("Dime que nombre quieres añadir");
			 vNombres[i]=leer.next();
			 System.out.println("Dime su numero");
			 vNums[i]=leer.nextInt();
			 break;
		 }
	 }
 }
 public void pintarMenu() {
	 do {
		 Scanner leer=new Scanner(System.in);
		 System.out.println("Pulsa 1 para añadir");
		 System.out.println("Pulsa 2 para editar");
		 System.out.println("Pulsa 3 para eliminar");
		 System.out.println("Pulsa 4 para buscar");
		 System.out.println("Pulsa 5 para mostrar los contactos");
		 System.out.println("Pulsa 6 para eliminar");
		 numero=leer.nextInt();
		 switch (numero) {
		case 1: {
			InicializarVectores();
			rellenarVectores();
		
		}
		
		}
	} while (numero!=6);
	
	 
	 
	
	 
	 
	 
 
}
}

