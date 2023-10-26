package TecnicasDeProgramacao.Aula7.exemplos;

public class MinhaThread extends Thread{

    public MinhaThread(String name){
        super.setName(name);
    }
    @Override
    public void run() {
        System.out.println("Hello: "+super.getName());
    }
}
