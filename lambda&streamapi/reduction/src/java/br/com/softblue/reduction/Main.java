package br.com.softblue.reduction;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //int[] array = List.of(3, 2, 5).stream().mapToInt(i -> i.intValue()).toArray(); sem method reference, com lambda
        int[] array = List.of(3, 2, 5, 2, 9).stream().mapToInt(Integer::intValue).toArray(); //com method reference, sem lambda
        System.out.println(multiply(array)); // reduzindo array de ints, trazendo ao maior valor multiplicado.
        System.out.println(max(array));//traznedo maior numero
    }

    private static int multiply(int[] array){
        return Arrays.stream(array).reduce((x, y) -> x * y).orElse(0);
    }

    private static int max(int[] array){
        return Arrays.stream(array).reduce((x, y) -> x > y ? x : y).orElse(0); //if ternario
       /* return Arrays.stream(array).reduce((x, y) -> {
            if(x > y){
                return x;
            }
            return y;
        } */ //if normal
        //return Arrays.stream(array).reduce((x, y) -> Math.max(x, y)).orElse(0); Math.max
        //return Arrays.stream(array).reduce(Math::max).orElse(0); Math.max method reference
    }
}
