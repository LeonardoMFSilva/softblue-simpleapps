//hash - hashing - espalha os elementos em um determinado conjunto
//no conjunto não há ordenação dos elementos
//linkedhashset garante a iteração seja na ordem de inicialização, hashset não da essa garantia
//Duplicidade em conjuntos não é aceita

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(10);
        numeros.add(22);
        numeros.add(2); // verificação de elemento duplicado

        for (int n : numeros){
            //System.out.println("Hash > " + n);
        }

        Set<Integer> numerosLink = new LinkedHashSet<>();

        numerosLink.add(1);
        numerosLink.add(2);
        numerosLink.add(10);
        numerosLink.add(22);
        numeros.add(2);// verificação de elemento duplicado

        for (int n : numerosLink){
           // System.out.println("LinkedHash > " + n);
        }

        System.out.println(numeros.contains(2) + " - " + numerosLink.contains(2));
        System.out.println(numeros.contains(20) + " - " + numerosLink.contains(20));*/

        Mes m1 = new Mes("Janeiro", 1);
        Mes m2 = new Mes("Fevereiro", 2);
        Mes m3 = new Mes("Março", 3);
        Mes m4 = new Mes("Abril", 4);
        Mes m5 = new Mes("Abril", 4);

        Set<Mes> meses = new HashSet<>();
        meses.add(m1);
        meses.add(m2);
        meses.add(m3);
        meses.add(m4);

        System.out.println(meses);
    }
}
