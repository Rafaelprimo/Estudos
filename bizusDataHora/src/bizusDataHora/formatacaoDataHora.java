package bizusDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class formatacaoDataHora {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		/* o DateFormatter do fmt3 tira do padrão e põe da forma que eu especifiquei,
		 *  com fuso do computador do usuário*/
		 
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		/* dessa forma, ele pega o padrão ISO 8601 e transforma
		 * para o modelo que eu quero, que é o do fmt1*/

		System.out.println("d05 = " + d05.format(fmt2));
		/* dessa forma, ele pega o padrão ISO 8601 e transforma
		 * para o modelo que eu quero, que é o do fmt2*/
		
		System.out.println("d06 = " + fmt3.format(d06));
		/* o instant não tem o formato igual ao d05*/
		
		
		
		
	}

}
