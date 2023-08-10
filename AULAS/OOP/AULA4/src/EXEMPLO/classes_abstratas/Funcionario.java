package OOP.AULA4.src.EXEMPLO.classes_abstratas;

public abstract class Funcionario {
    private String nome;
    private String matricula;
    protected double salario;


    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Matrícula: "+matricula);
        System.out.println("Salario: "+salario);
    }

}

