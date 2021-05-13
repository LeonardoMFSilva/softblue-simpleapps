package br.com.softblue.tictactoe.core;

public class Player {

    private String name;
    private char symbol;
    private Board board;

    public Player(String name, char symbol, Board board) {
        this.name = name;
        this.symbol = symbol;
        this.board = board;
    }

    public char getSymbol() {
        return symbol;
    }

    public Move inputMove(){

    }

    public void play(){

    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }
}
