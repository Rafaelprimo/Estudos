package bizusDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class converterDataHoraGlobalLocalObterDadosDataHoraLocal {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		/* vai converter a data hora d06 em LocalDate,
		 * utilizando o fuso da minha máquina*/
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		/* vai converter a data hora d06 em LocalDate,
		 * utilizando o fuso de Portugal*/
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

		System.out.println("d04 = " + d04.getDayOfMonth() + d04.getMonthValue() + d04.getYear());
		/* pega o dia, mês e ano de LocalDate*/
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);

		System.out.println("d05 = " + d05.getDayOfMonth() + d05.getMonthValue() + d05.getYear() + d05.getHour() + ":" + d05.getMinute() + ":" + d05.getSecond());
		/* pega o dia, mês, ano, hora, minuto e segundo do LocalDateTime*/
		
		
	}

}