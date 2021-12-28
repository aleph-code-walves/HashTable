package Generics;

import java.util.*;
import java.util.function.Predicate;

public class n_reference<C extends Number,V>{
    private final Set<Hash<C,V>> itens = new HashSet<>();

    public void adicionar(C chave, V valor){
        if (chave == null) return;

        Hash<C,V> novopar = new Hash<C,V>(chave, valor); // Cria a nova chave para ser adicionada

        if (itens.contains(novopar)){
            itens.remove(novopar); // se já tiver remove a contida
        }
        itens.add(novopar); // adiciona
    }

    public V getvalor(C chave){
        if (chave == null) return null;
        Predicate<Hash> verifica = par -> chave.equals(par.getChave()); // Paramêtro de Filtragem

        Optional<Hash<C,V>> parOptional = itens.stream().filter(verifica).findFirst();
        return parOptional.isPresent() ? parOptional.get().getValor() : null;
    }
}

