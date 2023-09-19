package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringEData {
    public static void main(String[] args) {
        String dataString = "2023-02-10";
        String dataHoraString = "2023-02-10 12:10:40";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        try {
            LocalDate localDate = LocalDate.parse(dataString, formatter);
            LocalDateTime localDateTime = LocalDateTime.parse(dataHoraString, dateTimeFormatter);
            System.out.println(localDate);
            System.out.println(localDateTime);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getCause());
        }
    }
}
