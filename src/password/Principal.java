package password;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password p = new Password(5);
		System.out.println(p.getContrasena());
		System.out.println(p.esFuerte());
	}

}
