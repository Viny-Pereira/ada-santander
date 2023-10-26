package TecnicasDeProgramacao.Aula7.exemplos;

public class MinhaTarefa implements Runnable{

    private final String nomeThread;

    public MinhaTarefa(String nomeThread) {

        this.nomeThread = nomeThread;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i<7; i++){
            System.out.println("Nome thread: "+nomeThread);
        }
    }
}
