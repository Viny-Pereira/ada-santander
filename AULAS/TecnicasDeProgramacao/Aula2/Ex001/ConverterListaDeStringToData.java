package TecnicasDeProgramacao.Aula2.Ex001;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ConverterListaDeStringToData {
    public static void main(String[] args) {
        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");
        List<LocalDate> datasFormatadas = converterToLocalDate(datasStrings);
        System.out.println(datasFormatadas);
    }

    public static List<LocalDate> converterToLocalDate(List<String> datasString) {
        List<LocalDate> datas = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (String data : datasString) {
            LocalDate dataConvertida = LocalDate.parse(data, formatter);
            datas.add(dataConvertida);
        }
        return datas;
    }
}
