package ejerciciosObjetos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		Persona p = new Persona("", "73105117-C", 18, 'H', 45,82);
		System.out.println(p);
		Persona p2 =new Persona();
		
		if(p.equals(p2)){
			System.out.println("Son la misma persona");
			
		}else {
			System.out.println("No son la misma persona");
		}
	}
 
}
