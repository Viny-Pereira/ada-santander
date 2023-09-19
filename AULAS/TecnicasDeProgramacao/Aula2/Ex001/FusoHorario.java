package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class FusoHorario {
    public static void main(String[] args) {
        /*
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }*/

        System.out.println(ZoneId.getAvailableZoneIds().size());

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);

        ZonedDateTime dataHoraAtualComFusoHario = ZonedDateTime.now();
        System.out.println(dataHoraAtualComFusoHario);
        ZonedDateTime dataHoraParis = dataHoraAtualComFusoHario.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println(dataHoraParis);

    }
}
