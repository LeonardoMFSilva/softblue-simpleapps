package com.br.softblue.optional;

import java.util.Map;
import java.util.Optional;

public class Main {

    private static final Map<String, Integer> PEOPLE = Map.of("pedro", 15, "mara", 20, "paulo", 25, "jorge", 10);

    public static void main(String[] args) {

        Optional<Integer> opt = get("marcelo");
        int  idade = opt.orElse(0); //orElse retornar o valor inserido no (), caso o valor passado no get(linha 12), não seja um valor existente
        System.out.println(idade);

        Optional<Integer> opt2 = get("marcelo");
        //int idade2 = opt2.orElseThrow(); // joga uma exceção caso não o valor inserido não exista
        //System.out.println(idade2);
        opt2.ifPresent(i -> System.out.println("A idade encontrada é: " + i));
        opt2.ifPresentOrElse(i -> System.out.println("A idade encontrada é: " + i), () -> System.out.println("Nenhuma idade encontrada"));

        Optional<Integer> opt3 = get("julia");
        //int idade3 = opt3.orElseThrow(() -> new IllegalArgumentException()); // como orElseThrow é uma Interface Funcional, é possível usar uma lambda com parametros vazios (), como não há parametros nessa Interface(orElseThrow)
        int idade3 = opt3.orElseThrow(IllegalArgumentException::new); // tb pode ser substituido por uma method reference
        System.out.println(idade3);

    }

    private static Optional<Integer> get(String name){
        return Optional.ofNullable(PEOPLE.get(name));
    }
}
