package OOP2.aula001.src.oo;

public class EstudanteDeJava extends Pessoa implements Estudante{
    @Override
    public void estudar() {
        System.out.println("Estudar segunda quarta e sexta");
    }
}
