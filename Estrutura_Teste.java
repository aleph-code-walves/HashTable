package Generics;

public class Estrutura_Teste {
    public static void main(String[] args) {
        n_reference<Integer,String> result = new n_reference<>();

        result.adicionar(3,"Aleph");
        result.adicionar(2,"Will");
        result.adicionar(1,"Enrico");
        result.adicionar(4,"Pedro");

        System.out.println(result.getvalor(3));

    }
}
