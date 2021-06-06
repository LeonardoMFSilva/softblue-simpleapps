package br.com.softblue.jogoforca.game;

import br.com.softblue.jogoforca.core.Dictionary;
import br.com.softblue.jogoforca.core.InvalidCharacterException;
import br.com.softblue.jogoforca.core.Word;
import br.com.softblue.jogoforca.ui.UI;

import java.util.HashSet;
import java.util.Set;

public class Game {

    private static final int MAX_ERROR = 5;

    public void start(){

        UI.print("Bem vindo ao jogo da Forca!");

        Dictionary dictionary = Dictionary.getInstance();
        Word word = dictionary.nextWord();

        UI.print("A palavra tem " + word.size() + " letras");

        Set<Character> usdeChar = new HashSet<>();
        int errorCount = 0;

        while (true){
            UI.print(word);
            UI.printNewLine();

            char c;
            try {
                c = UI.readChar("Digite uma letra");
                if (usdeChar.contains(c)){
                    throw new InvalidCharacterException("Esta letra já foi utilizada");
                }
                usdeChar.add(c);

                if (word.hasChar(c)){
                    UI.print("Você acertou uma letra!");
                } else {
                    errorCount++;

                    if (errorCount < MAX_ERROR){
                        UI.print("Você errou ): Ainda possui " + (MAX_ERROR - errorCount) + " tentativa(s)");
                    }
                }

                UI.printNewLine();

                if (word.discovered()){
                    UI.print("Parabéns, você se livrou da forca e ganhou o jogo! A palavra correta é: " + word.getOriginalWord());
                    UI.print("Fim de jogo!");
                    break;
                }

                if (errorCount == MAX_ERROR){
                    UI.print("Você esgotou susas tentativas e foi para a forca ):! A palavra correta era: " + word.getOriginalWord());
                    UI.print("Fim de jogo!");
                    break;
                }

            } catch (InvalidCharacterException e){
                UI.print("Erro: " + e.getMessage());
                UI.printNewLine();
            }
        }
    }

}
