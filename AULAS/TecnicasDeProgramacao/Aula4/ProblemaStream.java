package TecnicasDeProgramacao.Aula4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemaStream {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) * 2);
        }
    }
}
