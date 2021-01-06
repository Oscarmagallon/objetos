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
		 System.out.println("Pulsa 6 para salir");
		 numero=leer.nextInt();
		 switch (numero) {
		case 1: {
			InicializarVectores();
			rellenarVectores();
			break;
		
		}
		case 2:{
			InicializarVectores();
			editarContacto();
			break;
		}
		case 3:{
			InicializarVectores();
			eliminar();
			break;
		}
		case 4:{
			InicializarVectores();
			buscar();
			break;
		}
		case 5:{
			InicializarVectores();
			verTodos();
			break;
		}
	
		}
	} while (numero!=6);
	
	 
	 
	
	 
	 
	 
 
}
 public void editarContacto() {
	 Scanner leer = new Scanner(System.in);
	 String nombre="";
	 int num=0;
	 String eleccion="";
	 System.out.println("Quieres buscar por nombre o por numero");
	 eleccion=leer.next();
	 if( eleccion.equalsIgnoreCase("nombre")) {
		 System.out.println("Que nombre quieres buscar?");
		 nombre=leer.next();
	 }else {
		 System.out.println("Que numero quieres buscar?");
		 num=leer.nextInt();
	 }
	 for (int i = 0 ; i < tam;i++) {
		 if(vNombres[i].equalsIgnoreCase(nombre)|| vNums[i]==num) {
			 System.out.println("Que nombre quieres ponerle?");
			 vNombres[i]=leer.next();
			 System.out.println("Que numero quieres ponerle?");
			 vNums[i]=leer.nextInt();
			 break;
			 
		 }
	 }
 }
 public void verTodos () {
	 for(int i = 0 ; i<tam;i++) {
		 if (!vNombres[i].equals("")|| vNums[i]!=0) {
			 System.out.println(vNombres[i] + vNums[i]);
		 }
	 }
 }
 public void eliminar () {
	 Scanner leer = new Scanner(System.in);
	 String eliminar = "";
	 System.out.println("¿Que contacto quieres eliminar?");
	 eliminar=leer.next();
	 for (int i=0;i<tam;i++) {
		 if(vNombres[i].equalsIgnoreCase(eliminar)) {
			 vNombres[i]="";
			 vNums[i]=0;
		 }
	 }
 }
 public void buscar() {
	 Scanner leer = new Scanner(System.in);
	 String buscar="";
	 System.out.println("Que contacto quieres buscar?");
	 buscar=leer.next();
	 for (int i = 0 ; i<tam;i++) {
		 if(vNombres[i].equalsIgnoreCase(buscar)) {
			 System.out.println("El nombre es "+vNombres[i] +" el numero de telefono es " +vNums[i] );
		 }
	 }
	 
 }
}

