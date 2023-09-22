package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ContagemData {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = LocalDate.of(2023, Month.SEPTEMBER, 17);

        long dias = ChronoUnit.DAYS.between(ontem, hoje);

        System.out.println(dias);

        LocalDateTime onteHora = LocalDateTime.of(2023, Month.SEPTEMBER, 17, 19, 00, 00);
        LocalDateTime dataHoraHoje = LocalDateTime.now();

        long diasEntreOntemEHoje = ChronoUnit.DAYS.between(onteHora, dataHoraHoje);

        System.out.println("Dias entre ontem e hoje: " + diasEntreOntemEHoje);
    }

}
