package Aula6.src.Exemplo;

import Aula6.enus.Semana;

public class Main {
    public static void main(String[] args) {
        System.out.println(diaDaSemana("sabado"));
        System.out.println(diaDaSemanaEnum(Semana.SABADO));
        System.out.println(Semana.TERCA_FEIRA.getName());

    }

    public static int diaDaSemana(String dia) {
        if (dia.equals("domingo")) {
            return 0;
        } else if (dia.equals("segunda")) {
            return 1;
        } else if (dia.equals("terca")) {
            return 2;
        } else if (dia.equals("quarta")) {
            return 3;
        } else if (dia.equals("quinta")) {
            return 4;
        } else if (dia.equals("sexta")) {
            return 5;
        } else if (dia.equals("sabado")) {
            return 6;
        }
        return -1;
    }

    public static int diaDaSemanaEnum(Semana dia) {
        return dia.ordinal();
    }

    public static int diaDaSemanaSwitch(String dia) {
        switch (dia) {
            case ("domingo"):
                return 0;
            case ("segunda"):
                return 1;
            case ("terca"):
                return 2;
            case ("quarta"):
                return 3;
            case ("quinta"):
                return 4;
            case ("sexta"):
                return 5;
            case ("sabado"):
                return 6;
            default:
                return -1;
        }
    }


}
