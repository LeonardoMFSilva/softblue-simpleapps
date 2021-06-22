package br.com.softblue.reduction;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //int[] array = List.of(3, 2, 5).stream().mapToInt(i -> i.intValue()).toArray(); sem method reference, com lambda
        int[] array = List.of(3, 2, 5).stream().mapToInt(Integer::intValue).toArray(); //com method reference, sem lambda
        System.out.println(multiply(array)); // trazendo array de ints
    }

    private static int multiply(int[] array){
        return Arrays.stream(array).reduce((x, y) -> x * y).orElse(0);
    }
}
