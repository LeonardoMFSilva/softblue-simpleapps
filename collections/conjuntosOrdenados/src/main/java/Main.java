import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Character> alfabeto = new TreeSet<>(); //ele orderna e não permite repetidos
        alfabeto.add('F');
        alfabeto.add('D');
        alfabeto.add('B');
        alfabeto.add('D');
        alfabeto.add('A');
        alfabeto.add('E');
        alfabeto.add('C');

        System.out.println(alfabeto);

        Mes m1 = new Mes("Janeiro", 1);
        Mes m2 = new Mes("Abril", 4);
        Mes m3 = new Mes("Fevereiro", 2);
        Mes m4 = new Mes("Março", 3);

        Set<Mes> meses = new TreeSet<>();
        meses.add(m1);
        meses.add(m2);
        meses.add(m3);
        meses.add(m4);

        System.out.println(meses); // sem a implementação da Interface Comparable, não roda, pois a classe Tree precisa dessa interface para determinar a ordem dos elementos


        Set<Character> alfabetoInv = new TreeSet<>(new InverseComparator()); //ele orderna e não permite repetidos
        alfabetoInv.add('F');
        alfabetoInv.add('D');
        alfabetoInv.add('B');
        alfabetoInv.add('D');
        alfabetoInv.add('A');
        alfabetoInv.add('E');
        alfabetoInv.add('C');

        System.out.println(alfabetoInv);
    }
}
