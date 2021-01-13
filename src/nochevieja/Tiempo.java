package nochevieja;

public class Tiempo {
	private int horas;
	private int minutos;
	private final int MINUTOS_TOTAL_DIA = 1440;
	
	//Dato con formato XX:XX
	public Tiempo(String dato) {
		String hora, minutos;
		hora=dato.substring(0, 2);
		minutos=dato.substring(3);
		this.horas = Integer.parseInt(hora);
		this.minutos=Integer.parseInt(minutos);
	}
	public int minutosDiferencia() {
		int minutosTotales = horas * 60 +minutos;
		return MINUTOS_TOTAL_DIA - minutosTotales;
	}
}
