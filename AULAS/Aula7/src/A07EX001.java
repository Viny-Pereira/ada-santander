package Aula7.src;

import Aula7.enums.Semana;

import java.util.Scanner;

public class A07EX001 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        Semana diaSemana = Semana.mostrarNomeEnum("sab");
        System.out.println(diaSemana);
    }

}
