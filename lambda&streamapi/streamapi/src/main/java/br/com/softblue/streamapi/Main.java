package br.com.softblue.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Leonardo", "Joana", "Antonia", "José", "Amanda", "Laila");

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

        //Reference Methods - referencia o método chamado para simplificar. Usa-se Method References em duas situações:
        //1 - Quando o parametro recebido estiver sendo passado (não quando está sendo definido)_como parametro
        //2 - Quando usar o paramentro recebido como parametro para chamar um metodo (que irá utilizar o parametro)
        names.stream()
                .filter(w -> w.startsWith("L")) //definição do parametro
                .map(String::toLowerCase) // paramentro sendo passado com Method Reference
                .forEach(System.out::println); // parametro usado e recebido sendo chamado para o metodo
    }
}
