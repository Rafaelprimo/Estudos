package bizusDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculoComDataHora {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		/* eu não posso alterar DataHora, logo, eu instancio -7 dias
		 * de d04 na variável declarada*/
		
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusHours(3);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		/* retirou 7 dias de d06*/
		 
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDateTime = " + pastWeekLocalDateTime);

		System.out.println("pastWeekInstant = " + pastWeekInstant);

		// Vou fazer a duração agora
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		
		System.out.println("t1 em horas: " + t1.toHours());
		
		
		/* Para fazer o do LocalDate, tenho que converter para LocalDateTime*/
		
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		/* Quer dizer à 0 hora em 0 minutos*/
		/* atTime(0, 0) = atStartOfDay()*/
		
		System.out.println("t2 em dias: " + t2.toDays());

		// Com o tipo Instant		
		Duration t3 = Duration.between(pastWeekInstant, d06);

		System.out.println("t3 em dias: " + t3.toDays());

		// Agora invertido.
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t4 em dias: " + t4.toDays());
		// me da um número negativo em dias.
		
	}

}
