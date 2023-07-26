package Aula6.enus;

public enum Semana {
    DOMINGO("domingo", 1),
    SEGUNDA_FEIRA("segunda-feira", 2),
    TERCA_FEIRA("terca-feira", 3),
    QUARTA_FEIRA("quarta-feira",4 ),
    QUINTA_FEIRA("quinta-feira", 5),
    SEXTA_FEIRA("sexta-feira",6),
    SABADO("sabado", 7);
    final String name;
    final int dia;

/*    Semana(String name) {
        this.name = name;
    }*/
    Semana(String name, int dia) {
        this.name = name;
        this.dia = dia;
    }

    public String getName() {
        return name;
    }

    public int getDia(){
        return dia;
    }

    public static Semana mostrarNomeEnum(String diaDaSemana){
        for (Semana diaSemana : Semana.values()){
            if(diaSemana.getName().equalsIgnoreCase(diaDaSemana)){
                return diaSemana;
            }
        }
        throw new IllegalArgumentException("Dia da semana inválido!!");
    }

}
