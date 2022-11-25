package bizusDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class instanciacaoDeDataHora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Referência para extrair a data-hora de String.
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		//ofpattern significa a partir de um padrão.
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		/* instancia o ano, mês e dia de agora na variável d01*/
		System.out.println("d01: " + d01);		
		
		LocalDateTime d02 = LocalDateTime.now();
		/* instancia o ano, mês, dia e hora de agora na variável d02*/
		System.out.println("d02: " + d02);
		
		Instant d03 = Instant.now();
		/* instancia o ano, mês, dia e hora de agora na variável d03
		 * utilizando a hora do fuso 0 e me dizendo o fuso "Z" ao final*/

		System.out.println("d03: " + d03);

		LocalDate d04 = LocalDate.parse("2022-07-20");
		/* instancia a data citada na variável d04*/
		System.out.println("d04: " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		/* instancia a data citada com hora na variável d05*/
		System.out.println("d05: " + d05);
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		/* instancia a data citada com hora na variável d06, porém,
		 * neste caso, considerando o fuso "Z"*/
		System.out.println("d06: " + d06);
		
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		/* instancia a data citada com hora na variável d06, porém,
		 * neste caso, considerando o fuso de -3 em relação ao GMT*/
		System.out.println("d07: " + d07);
		/* Este caso gera mais dúvida, mas o horário que esta sendo
		 * considerado é o do fuso -3, mas o instanciado é o do fuso "Z"*/
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		/* instancia a data citada na variável d08 no formato especificado
		 * pela variável fmt1, convertendo-o ao formato padrão*/
		System.out.println("d08: " + d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		/* instancia a data citada com hora na variável d05 no formato especificado
		 * pela variável fmt1, convertendo-o ao formato padrão*/
		System.out.println("d09: " + d09);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		// leu o ano, mês e dia que foi digitado.
		System.out.println("d10: " + d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		// leu o ano, mês, dia, hora e minuto.
		System.out.println("d11: " + d11);

		
		sc.close();
	}

}
