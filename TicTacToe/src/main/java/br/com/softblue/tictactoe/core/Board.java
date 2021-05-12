package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.ui.UI;

public class Board {

    public Board(){
        clear();
    }

    char [][] matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    public void clear(){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = ' ';
            }
        }
    }

    public void print(){
        UI.printNewLine();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));

                if (j < matrix[i].length - 1) {
                    UI.printTextWithNoNewLine(" | ");
                }
            }
            UI.printNewLine();

            if (i < matrix.length - 1) {
                UI.printText("---------");
            }
        }

    }

    public boolean isFull(){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                if (matrix[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean play(Player player, Move move){
        int i = move.i;
        int j = move.i;

        matrix[i][j] = player.symbol;
        //TODO Check if the player won
        return false;
    }

}
