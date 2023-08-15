package OOP.AULA6.src.EXEMPLO.impl;

public class StringArrayLista extends  ArrayLista{
    private void add(String str){
        super.add(str);
    }
    @Override
    public String get(int idx){
        return (String) super.get(idx);
    }
}
