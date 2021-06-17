package br.com.softblue.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Leonardo", "Joana", "Ana", "José", "Amanda", "Laila");

        List<String> filteredNames = names.stream()
                .filter(w -> w.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        List<String> filteredNames2 = names.stream()
                .filter(w -> w.startsWith("L"))
                .map(w -> w.toLowerCase())
                .collect(Collectors.toList());
        //filteredNames2.stream().forEach(w -> System.out.println(w)); uma maneira de fazer, porém como forEach é um metodo final, pode ser usado diretamente
        filteredNames2.forEach(w -> System.out.println(w));

      names.stream()
              .filter(w -> w.startsWith("A"))
              .map(w -> w.toLowerCase())
              .forEach(w -> System.out.println(w)); // com o forEach tb é possível fazer sem retonar uma lista, como ele irá percorrer e mostrar todos os elementos especificados



    }
}
