package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.ui.UI;

public class Game {

    private Board board = new Board();
    private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
    private int currentPlayerIndex = 0;

    public void play(){
        UI.printGameTitle();

        for (int i = 0; i < players.length; i++) {
           players[i] = createPlayer(i);

        }
    }

    private Player createPlayer(int index){
        String name = UI.readInput("Jogador" + (index + 1 ) + "=>");
        char symbol = Constants.SYMBOL_PLAYERS[index];
        Player player = new Player(name, symbol, board);
        UI.printText("O jogador " + name + " vai usar o símbolo " + symbol);

        return player;
    }

    private Player nextPlayer (){
        // Duas forma de fazer, a primeira com o if

        /* currentPlayerIndex++; // necessário para a saber qual jogador é o atual
          if (currentPlayerIndex >= players.length){
              currentPlayerIndex = 0;
          }

          return players[currentPlayerIndex];*/

        // A segunda com o índice circular:
        // Dividindo o valor atual pelo tamanho total do Array ou indice
        // E Pegando o resto da divisão
        // quando ele se dividir por si mesmo (ou pelo tamanho total dele)
        // ele irá retonar ao indice 0.
        // EX: Indice de 3...
        // 0/3 resto = 0 (primeiro indice)
        // 1/3 resto = 1 (segundo indice)
        // 2/3 resto = 2 (terceiro indice)
        // 3/3 resto = 0 (primeiro indice)
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
        return players[currentPlayerIndex];
    }
}
