package gestaoDeEmpregados;

import java.util.Locale;
import java.util.Scanner;

import entities.empregado;

public class gestaoPrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome, o salário bruto e o imposto que o funcionário deve pagar");
		empregado a = new empregado();
		a.name = sc.nextLine();
		a.grossSalary = sc.nextDouble();
		a.tax = sc.nextDouble();
		
		System.out.println(a.netSalary());
		System.out.println("Digite a porcentagem de aumento salarial para o " + a.name);
		double aumento = sc.nextDouble();
		a.increaseSalary(aumento);
		System.out.println(a.netSalary());				
	}
}
