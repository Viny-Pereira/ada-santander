package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataParaString {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalTime agora = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        DateTimeFormatter dateTimeEstenso = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
        DateTimeFormatter dateTimeEstensoIngles = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", Locale.US);


        System.out.println(hoje.format(formatter));
        System.out.println(agora.format(dateTimeFormatter));
        System.out.println(hoje.format(dateTimeEstenso));
        System.out.println(hoje.format(dateTimeEstensoIngles));
    }
}
