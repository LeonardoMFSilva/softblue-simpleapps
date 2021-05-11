package br.com.softblue.tictactoe.ui;

import java.util.Scanner;

public class UI {
    public static void printText(String text){
        System.out.println(text);
    }

    public static void printTextWithNoNewLine(String text) {
        System.out.print(text);
    }

    public static void printNewLine(){
        System.out.println();
    } // usado para quebra de linha, usando apenas o sout/sysout

    public static void printGameTitle(){
        printText("==================");
        printText("| Jogo da Velha |");
        printText("==================");
        printNewLine();
    }

    public static String readInput (String text){
        Scanner ler = new Scanner(System.in);
        printTextWithNoNewLine(text + " ");
        return ler.next();
    }
}
