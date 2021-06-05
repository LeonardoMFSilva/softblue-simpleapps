package br.com.softblue.jogoforca.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {

    private static final String FILE_NAME = "dicionario.txt";
    private List<String> words = new ArrayList<>();

    private void load(){
       try ( Scanner scanner =
                     new Scanner(getClass().getResourceAsStream("/" + FILE_NAME))) {
           while (scanner.hasNextLine()) {
               String word = scanner.nextLine().trim();
           }
       }
    }


}
