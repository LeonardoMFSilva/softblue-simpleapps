package br.com.softblue.tictactoe.core;

public class Move {

    private int i;
    private int j;

    public Move(String moveStr) {
        String[] tokens = moveStr.split(",");
        this.i = Integer.parseInt(tokens[i]);
        this.j = Integer.parseInt(tokens[j]);

        //TODO Validar se a estrutura do move está correta.
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }


}
