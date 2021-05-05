import java.util.Scanner;

public class Conversion {

    public static void main (String[] args){

        Scanner insert = new Scanner(System.in);
        Scanner select = new Scanner(System.in);
        System.out.printf("Digite a temperatura: ");
        double temp = insert.nextDouble();

        System.out.printf("Qual conversão deseja (1 = F -> C, 2 = C -> F)? ");
        int selected = select.nextInt();

        double r;

        if (selected == 1) {
            r = converterParaCelsius(temp);
        } else if (selected == 2) {
            r = converterParaFahrenheit(temp);
        } else {
            System.out.println("Opção inválida!");
            return;
        }
        System.out.printf("A temperatura convertida é de: " + r);
    }

    public static double converterParaCelsius (double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double converterParaFahrenheit (double celsius) {
        return celsius * 1.8 + 32;
    }

}
