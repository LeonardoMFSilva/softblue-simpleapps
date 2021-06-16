import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 4, 1, 3));

      /*  NumberComparator comparator = new NumberComparator();
        numbers.sort(comparator);
        System.out.println(numbers);*/ //uma forma de fazer a ordenação inversa usando uma classe (NumberComparator) para auxiliar.

        /*Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        };
        numbers.sort(comparator);
        System.out.println(numbers);*/ //outra forma de fazer utilizando uma classe anonima (Comparator), implementando uma interface (Comparator)

        /*Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2); //uma forma de utilizar a expressão lambda, ainda com Comparator
        numbers.sort(comparator);
        System.out.println(numbers);*/

        numbers.sort((o1, o2) -> -o1.compareTo(o2)); // forma mais simples de utilizar a lambda, programação funcional
        System.out.println(numbers);
    }
}
