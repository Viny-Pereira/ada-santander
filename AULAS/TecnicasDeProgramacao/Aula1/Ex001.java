package TecnicasDeProgramacao.Aula1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Ex001 {
    public static void main(String[] args) {
        // pega a data do dia atual
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        //imprime a hora atual
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);
        // imprime a data e a hora atual
        LocalDateTime diaHora = LocalDateTime.now();
        System.out.println(diaHora);

        // data personalisada
        LocalDate dataPassada = LocalDate.of(2023, 9, 1);
        System.out.println(dataPassada);
        LocalDate dataPassadoOP2 = LocalDate.of(2023, Month.SEPTEMBER, 1);
        LocalDate anoDia = LocalDate.ofYearDay(2023, 50);
        System.out.println(anoDia);

        LocalTime horaMinuto = LocalTime.of(20, 30);
        System.out.println(horaMinuto);
        LocalTime horaMinutoSegundo = LocalTime.of(20, 30, 10);
        System.out.println(horaMinutoSegundo);

        LocalDateTime anoMesHoraMinuto = LocalDateTime.of(2023, Month.SEPTEMBER, 15, 20, 30, 10);
        System.out.println(anoMesHoraMinuto);

        LocalDateTime dataHoraPersonalizada = LocalDateTime.of(hoje, horaMinutoSegundo);
        System.out.println(dataHoraPersonalizada);
    }
}
