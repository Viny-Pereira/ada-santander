package TecnicasDeProgramacao.Aula7.exemplos;

public class ThreadDemonstration2 {
    public static void main(String[] args) {
        System.out.println((int) (Math.random() * 1000));
        String nomeThread = "#Thread";
        MinhaThread minhaThread = new MinhaThread(nomeThread);
        Thread thread = new Thread(minhaThread);
        thread.start();
    }
}
