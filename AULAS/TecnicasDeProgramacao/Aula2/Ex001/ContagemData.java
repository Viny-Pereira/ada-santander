package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ContagemData {
    public static void main (String [] args){
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = LocalDate.of(2023, Month.SEPTEMBER, 12 );
    // Contagem de dias entre datas;
        long diasEntre = ChronoUnit.DAYS.between(hoje, ontem);
        System.out.println(diasEntre);
    }

}
