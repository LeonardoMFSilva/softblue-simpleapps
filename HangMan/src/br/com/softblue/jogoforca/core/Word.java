package br.com.softblue.jogoforca.core;

public class Word {

    private static final char SECRET_CHAR = '_';

    private String originalWord;

    public Word(String originalWord) {
        this.originalWord = originalWord;
    }

    public int size(){
        return originalWord.length();
    }

    public boolean hasChar(char c){
        if (originalWord.indexOf(c)> -1){
            return true;
        }

        return false;
    }

    public String getOriginalWord() {
        return originalWord;
    }
}
