package LogicaProgramacao.src.Aula5.src;

public class CheckedExceptions {

    public static void main(String[] arg){
        lerClasses("Test");

    }
    public static void lerClasses(String name){
        try{
            Class.forName(name);
        } catch (ClassNotFoundException e){
            System.out.printf("Classe %s não encontrada", name);
        }
    }
}
