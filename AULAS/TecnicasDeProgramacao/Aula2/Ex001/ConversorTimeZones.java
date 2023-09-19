package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConversorTimeZones {
    public static void main(String[] args) {
        verTimeZones(ZonedDateTime.now());
    }

    public static void verTimeZones(ZonedDateTime time) {
        var dataNewYork = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        var dataParis = time.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        var dataTokyo = time.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");

        System.out.println("SUA LOCALIZAÇÂO: " + time.format(formatter));
        System.out.println("NEW YORK: " + dataNewYork.format(formatter));
        System.out.println("PARIS: " + dataParis.format(formatter));
        System.out.println("TOKYO: " + dataTokyo.format(formatter));
    }
}
