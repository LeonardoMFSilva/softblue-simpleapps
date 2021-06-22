package br.com.softblue.concat;

import java.util.stream.Collectors;

//convertendo as letras em numeros
public class Main {
    public static void main(String[] args) {
        String str = "ACBAZ";
        String strs = "LEO";

        String result = str.chars()
                .map(i -> i - 64) // -64 devido as letras serem contandas como números no padrão ASCII, com o A começando em 65
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("-"));//joining tb tem alem do delimitador o prefixo e sufixo
        System.out.println(result);

        String results = strs.chars()
                .map(i -> i - 64) // -64 devido as letras serem contandas como números no padrão ASCII, com o A começando em 65
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("-", "> ", " <")); //joining com delimitador, prefixo e sufixo
        System.out.println(results);
    }
}
