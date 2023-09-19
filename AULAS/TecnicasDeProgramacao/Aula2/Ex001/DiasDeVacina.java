package TecnicasDeProgramacao.Aula2.Ex001;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiasDeVacina {
    public static void main(String[] args) {
        diasDeVacinacao(LocalDate.of(2023, 2, 1));
    }

    public static void diasDeVacinacao(LocalDate dataPrimeiraDose) {
        var dataSegundaDose = dataPrimeiraDose.plusMonths(1);
        var dataTerceiraDose = dataPrimeiraDose.plusMonths(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataCorrigida = dataPrimeiraDose.format(formatter);
        System.out.println("Primeira Dose: " + dataPrimeiraDose);
        System.out.println("Segunda Dose: " + dataSegundaDose);
        System.out.println("Terceira Dose: " + dataTerceiraDose);
        System.out.println("Data corrigida: "+dataCorrigida);
    }
}
