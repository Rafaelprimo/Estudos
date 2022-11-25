package entidades;

public class Circulo {
	public double raio;
	
	public double valorDaCircunferência() {
		return 2*3.1415*raio;
	}
	public double volumeDaEsfera() {
		return (4*3.1415*Math.pow(raio, 3))/3;
	}
}