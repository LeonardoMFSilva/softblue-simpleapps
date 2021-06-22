package br.com.softblue.closurelambda;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int mult = 3; // escopo do nível acima - enclosing scope | essas variaveis precisam ser imutáveis (inserir o final, não obrigatório)
                    // para a lambda poder acessa-las;
        AtomicInteger count = new AtomicInteger(); // é possível mudar o valor apenas se tratando de um objeto, mas não é recomendado, devido a poder causar futuros probelmas na aplicação

        IntStream.range(1, 21)
                .map(i -> i * mult) //closure -> capacidade de uma expressão lambda acessar variaveis que estão no enclosing scope, o escopo do nível acima.
                .forEach(System.out::println);

        //mult = 2; não irá funcionar, devido estar sendo chamada pela lambda


        IntStream.range(1,22)
                .map(j -> {
                    count.incrementAndGet();
                    return j * mult; })
                .forEach(System.out::println);
        System.out.println("Valor de count: " +count); // aqui está sendo alterado o objeto AtomicInteger, sendo assim aceito (mas não recomendado) a alteração de valores.

    }
}
