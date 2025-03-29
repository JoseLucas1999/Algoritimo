package estudos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAndTimeEstudos {

    //Obter a data e hora atual
    public static void ObterDataHora() {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        System.out.println("Data atual: " + dataAtual);
        System.out.println("Hora atual: " + horaAtual);
        System.out.println("Data e hora atual: " + dataHoraAtual);
    }

    //Formatar data e hora (DateTimeFormatter)
    public static void FormatarDataHora() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dataFormatada = agora.format(formatter);
        System.out.println("Data formatada: " + dataFormatada);
        // Saída: 28/03/2025 14:30:45
    }

    //Adicionar ou remover dias, meses, anos, horas
    public static void AdicionarRemover() {
        LocalDate data = LocalDate.now().plusDays(5); // Adiciona 5 dias
        LocalTime hora = LocalTime.now().minusHours(2); // Remove 2 horas
        LocalDateTime dataHora = LocalDateTime.now().plusMonths(3); // Adiciona 3 meses

        System.out.println("Nova data: " + data);
        System.out.println("Nova hora: " + hora);
        System.out.println("Nova data e hora: " + dataHora);
    }

    //Calcular diferença entre datas (Duration e Period)
    public static void CalcularDatas() {
        LocalDate data1 = LocalDate.of(2025, 3, 1);
        LocalDate data2 = LocalDate.of(2025, 3, 28);

        long diasEntre = ChronoUnit.DAYS.between(data1, data2);
        System.out.println("Diferença em dias: " + diasEntre);
        //Saída: 27 (diferença de dias entre 1º de março e 28 de março)
    }

    //Instant
    public static void usingInstant() {
        Instant instanteAtual = Instant.now();
        ZonedDateTime fusoBrasil = instanteAtual.atZone(ZoneId.of("America/Sao_Paulo"));

        System.out.println("Hora UTC: " + instanteAtual);
        System.out.println("Hora Brasil: " + fusoBrasil);
    }

}

/*
Use java.time (Java 8+), pois é mais moderno e eficiente.
LocalDate → Somente data (YYYY-MM-DD).
LocalTime → Somente hora (HH:MM:SS).
LocalDateTime → Data e hora juntas.
Duration e Period ajudam a calcular diferenças.
ZonedDateTime para fuso horário.
*/