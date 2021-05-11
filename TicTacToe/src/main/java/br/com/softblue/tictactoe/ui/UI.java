package br.com.softblue.tictactoe.ui;

import java.util.Scanner;

public class UI {
    public void printText(String text){
        System.out.println(text);
    }

    public void printTextWithNoNewLine(String text) {
        System.out.print(text);
    }

    public void printNewLine(){
        System.out.println();
    } // usado para quebra de linha, usando apenas o sout/sysout

    public void printGameTitle(){
        printText("============");
        printText("| Jogo da Velha |");
        printText("============");
        printNewLine();
    }

    String readInput (String text){
        Scanner ler = new Scanner(System.in);
        printTextWithNoNewLine(text + " ");
        return ler.next();
    }
}
