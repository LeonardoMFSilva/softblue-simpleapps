package br.com.softblue.lambdastream;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = List.of(new Car("BMW", 120000), new Car("Peugeot", 85000), new Car("VW", 70000));

        cars.stream()
                .sorted((c1, c2) -> Double.valueOf(c1.getPrice()).compareTo(c2.getPrice())) //fazendo a comparação entre valores e retornando do mais baixo ao mais alto
                .map(c -> new Car(c.getBrand().toLowerCase(), c.getPrice()))
                .peek(Car::addTax)//permite executar ações na stream, devido a ele não ser void e permitindo executar novas ações
                .forEach(System.out::println);
    }
}
