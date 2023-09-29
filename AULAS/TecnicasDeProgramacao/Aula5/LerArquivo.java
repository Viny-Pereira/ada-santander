package TecnicasDeProgramacao.Aula5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LerArquivo {
    public static void main(String[] args) throws IOException {
        // Caminho do arquivo
        Path path = Paths.get("C:\\Users\\Acer\\Documents\\workspace\\ADA\\AULAS\\TecnicasDeProgramacao\\Aula5\\resource\\employee.csv");
        Stream<String> lines = Files.lines(path);
        List<Funcionario> funcionarios = new ArrayList<>();
        lines.forEach(string -> {
            String[] funcionarioString = string.split(",");

            Funcionario funcionario = new Funcionario();
            funcionario.setId(Integer.parseInt(funcionarioString[0]));
            funcionario.setNome(funcionarioString[1]);
            funcionario.setSexo(funcionarioString[2]);
            funcionario.setDataNascimento(LocalDate.parse(funcionarioString[3]));
            funcionario.setCidade(funcionarioString[4]);
            funcionario.setCargo(funcionarioString[5]);
            funcionario.setDataAdmissao(LocalDate.parse(funcionarioString[6]));
            funcionario.setSalario(Double.parseDouble(funcionarioString[7]));

            funcionarios.add(funcionario);


        });


        System.out.println("Numero de funcionarios: ");

        System.out.println(funcionarios.size());
        System.out.println(funcionarios.stream().count());

        System.out.println("Imprime funcionarios ordernados por id");
        funcionarios.stream().sorted(Comparator.comparing(Funcionario::getId)).forEach(System.out::println);

        /*funcionarios.stream().sorted(Comparator.comparing(funcionario -> funcionario.getId()))
                .forEach(funcionario -> System.out.println(funcionario));*/

        System.out.println("Pegar uma lista dos nomes do funcionario");
        List<String> nomesDosFuncionarios = funcionarios.stream().
                map(Funcionario::getNome).collect(Collectors.toList());
        System.out.println(nomesDosFuncionarios);

        System.out.println("Pegar um conjunto com o nomes do funcionario"); // Usar o Set voce tira as duplicatas
        Set<String> conjuntoFuncionarios = funcionarios.stream().
                map(funcionario -> funcionario.getNome()).collect(Collectors.toSet());
        System.out.println(conjuntoFuncionarios);

        System.out.println("Mapa com o id e o nome do funcionario");
        Map<Integer, String> mapaIdPorNome = funcionarios.stream()
                .collect(Collectors
                        .toMap(funcionario -> funcionario.getId(), funcionario -> funcionario.getNome()));

        System.out.println(mapaIdPorNome);
        System.out.println(mapaIdPorNome.get(27829));

        System.out.println("Nomes de todos os funcionarios em String");
        String nomesFuncionarios = funcionarios.stream()
                .map(funcionario -> funcionario.getNome())
                .collect(Collectors.joining(", "));
        System.out.println(nomesFuncionarios);

        System.out.println("Numero de funcionarios por cargo");
        Map<String, Long> funcionarioPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(funcionario -> funcionario.getCargo(), Collectors.counting()));
        System.out.println(funcionarioPorCargo);

        System.out.println("Soma de salarios de funcionarios por cargo");
        Map<String, Double> somaDeSalariosPorCargo = funcionarios.stream()
                .collect(Collectors
                        .groupingBy(Funcionario::getCargo,
                                Collectors.summingDouble(Funcionario::getSalario)));
        System.out.println(somaDeSalariosPorCargo);

        System.out.println("Agrupamento por id  - nome, salario");
        Map<Integer, Funcionario> mapPersonalizado = funcionarios.stream().
                collect(Collectors.toMap(Funcionario::getId, f -> new Funcionario(f.getNome(), f.getSalario())));


        System.out.println(mapPersonalizado);

    }
}
