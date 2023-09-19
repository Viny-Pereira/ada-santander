package TecnicasDeProgramacao.Aula1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class EX002 {
    public static void main(String[] args) {
        LocalDate dataFutura = LocalDate.of(2023, Month.DECEMBER, 2);
        LocalDate dataAtual = LocalDate.now();
        System.out.println(" A Data futura é depois é depois da data Atual: " + dataFutura.isAfter(dataAtual));
        System.out.println("A data atual é anterior a data futura: " + dataAtual.isBefore(dataFutura));

        LocalDateTime dataHoraFutrua;
    }

}
