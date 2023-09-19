package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FormatarDataTime {
    public static void main(String[] args) {
        List<LocalDate> datas = new ArrayList<>();
        datas.add(LocalDate.of(2023, 8, 10));
        datas.add(LocalDate.of(2022, 5, 20));
        datas.add(LocalDate.of(2021, 11, 30));
        List<String> datasFormatadas = formatarData(datas);
        System.out.println(datasFormatadas);
    }

    public static List<String> formatarData(List<LocalDate> datas) {
        List<String> datasFormatas = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (LocalDate data : datas
        ) {
            datasFormatas.add(data.format(formatter));
        }
        return datasFormatas;
    }
}
