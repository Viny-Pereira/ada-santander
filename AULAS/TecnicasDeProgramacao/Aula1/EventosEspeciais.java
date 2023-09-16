package TecnicasDeProgramacao.Aula1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class EventosEspeciais {
    public static LocalDate diaMeuNascimento() {
        return LocalDate.of(2002, 2, 11);
    }

    public static LocalTime horaAlmoco() {
        return LocalTime.of(12, 30);
    }

    public static LocalDateTime entradaNaFaculdade() {
        return LocalDateTime.of(2023, Month.FEBRUARY, 1, 12, 30, 0);
    }


}
