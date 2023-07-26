package Aula7.enums;

public enum Semana {
    DOMINGO(new String[]{"domingo, d, dm"}, 1),
    SEGUNDA_FEIRA(new String[] {"segunda-feira", "segunda", "seg", "s"}, 2),
    TERCA_FEIRA(new String[] {"terca-feira", "terca", "ter", "t"}, 3),
    QUARTA_FEIRA(new String[] {"quarta-feira", "quarta", "qua"},4 ),
    QUINTA_FEIRA(new String[]{"quinta-feira", "quinta", "quint", "qui"}, 5),
    SEXTA_FEIRA(new String[]{"sexta-feira", "sexta", "sex"},6),
    SABADO(new String[]{"sabado", "sab"}, 7);
    final String[] keywords;
    final int dia;

/*    Semana(String name) {
        this.name = name;
    }*/
    Semana(String[] keywords, int dia) {
        this.keywords = keywords;
        this.dia = dia;
    }

    public String[] getNomeDia() {
        return keywords;
    }

    public int getDia(){
        return dia;
    }

    public static Semana mostrarNomeEnum(String diaString){
        for (Semana nomePadrao : Semana.values()){
            for (String diaSemana : nomePadrao.getNomeDia()){
                if(diaSemana.equalsIgnoreCase(diaString)){
                    return nomePadrao;
                }
            }
        }
        throw new IllegalArgumentException("Dia da semana inválido!!");
    }
}
