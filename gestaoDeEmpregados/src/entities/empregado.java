package entities;

public class empregado {
	public String name;
	public double grossSalary;
	public double tax;
	
	public String netSalary() {
		return name + ", " + (grossSalary - tax);
	}
	public void increaseSalary(double x) {
		grossSalary += grossSalary*x/100;
	}
}