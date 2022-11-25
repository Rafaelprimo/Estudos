package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stream.Collectors;

import entidades.funcionario;

public class execucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de funionários:");
		int n = sc.nextInt();
		List<funcionario> listaDeFuncionarios = new ArrayList<>();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite o ID, nome e salário do funcionário:");
			Integer id = sc.nextInt();
			
			sc.nextLine();
			String nome = sc.nextLine();
			double salario = sc.nextDouble();
			
			funcionario emp = new funcionario(id, nome, salario);
			listaDeFuncionarios.add(emp);
		}
		
			System.out.println("Digite o ID e percentual de aumento salarial para o funcionário:");
			int idDoFuncionarioComAumento = sc.nextInt();
			
			funcionario algumaOcorrencia = listaDeFuncionarios.stream().filter(x -> x.getId() == idDoFuncionarioComAumento).findFirst().orElse(null);
			if (algumaOcorrencia == null) {
				System.out.println("ID incorreto.");
			}
			else {
				double aumento = sc.nextDouble();
				algumaOcorrencia.aumentoSalarial(aumento);

				for (int i= 0; i<n; i++) {
					System.out.println(listaDeFuncionarios.get(i).toString());
				}
			}
		
		
			
			
		sc.close();
	}

}
