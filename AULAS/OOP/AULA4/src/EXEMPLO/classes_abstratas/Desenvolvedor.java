package OOP.AULA4.src.EXEMPLO.classes_abstratas;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }
    @Override
    public double calcularBonus(){
        return this.salario*0.1;
    }
}
