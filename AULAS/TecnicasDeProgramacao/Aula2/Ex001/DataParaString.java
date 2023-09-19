package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataParaString {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalTime agora = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println(hoje.format(formatter));
        System.out.println(agora.format(dateTimeFormatter));
    }
}
