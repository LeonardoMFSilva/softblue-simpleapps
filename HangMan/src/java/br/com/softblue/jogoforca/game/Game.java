package br.com.softblue.jogoforca.game;

import br.com.softblue.jogoforca.core.Config;
import br.com.softblue.jogoforca.core.Dictionary;
import br.com.softblue.jogoforca.core.InvalidCharacterException;
import br.com.softblue.jogoforca.core.Word;
import br.com.softblue.jogoforca.ui.UI;

import java.util.HashSet;
import java.util.Set;

public class Game {

    public void start(String[] args){

        UI.print("Bem vindo ao jogo da Forca!");

        Dictionary dictionary = Dictionary.getInstance();
        UI.print("Dicionário usado: " + dictionary.getName());
        Word word = dictionary.nextWord();

        UI.print("A palavra tem " + word.size() + " letras");

        Set<Character> usdeChar = new HashSet<>();
        int errorCount = 0;
        if (args.length > 0){
            Config.setMaxErrors(args[0]);
        }
        int maxErrors = Integer.parseInt(Config.get("maxErrors"));
        UI.print("Você pode errar no máximo " + maxErrors + " vez(es)");

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

                    if (errorCount < maxErrors){
                        UI.print("Você errou ): Ainda possui " + (maxErrors - errorCount) + " tentativa(s)");
                    }
                }

                UI.printNewLine();

                if (word.discovered()){
                    UI.print("Parabéns, você se livrou da forca e ganhou o jogo! A palavra correta é: " + word.getOriginalWord());
                    UI.print("Fim de jogo!");
                    break;
                }

                if (errorCount == maxErrors){
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
