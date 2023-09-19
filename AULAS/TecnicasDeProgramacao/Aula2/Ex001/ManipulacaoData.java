package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ManipulacaoData {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        var outroDia = hoje.plusDays(1);
        var proximaSemana = hoje.plusWeeks(1);
        System.out.println(hoje);
        System.out.println(outroDia);
        System.out.println(proximaSemana);

        LocalDateTime dataHoraAtual = LocalDateTime.now();

        // Diminuindo 1h
        var umaHoraAtras = dataHoraAtual.minusHours(1);
        System.out.println(dataHoraAtual);
        System.out.println(umaHoraAtras);
    }
}

