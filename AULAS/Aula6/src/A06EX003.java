package Aula6.src;

import Aula6.enus.Semana;

import java.util.Scanner;

public class A06EX003 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        Semana diaSemana = Semana.mostrarNomeEnum("sexta-feira");
        System.out.println(diaSemana);
    }

}
