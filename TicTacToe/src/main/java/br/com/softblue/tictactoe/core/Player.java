package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.ui.UI;

public class Player {

    private String name;
    private char symbol;
    private Board board;

    public Player(String name, char symbol, Board board) {
        this.name = name;
        this.symbol = symbol;
        this.board = board;
    }

    private Move inputMove(){
        String moveStr = UI.readInput("Jogador '" + name + "' =>");
        return new Move(moveStr);
    }

    public void play(){
        Move move = inputMove();
        board.play(this, move);
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }
}
