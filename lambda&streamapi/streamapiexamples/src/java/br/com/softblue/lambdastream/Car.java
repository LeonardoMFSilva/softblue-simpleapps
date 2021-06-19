package br.com.softblue.lambdastream;

public class Car {

    private String brand;
    private double price;

    public Car(final String brand, final double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void addTax(){
        price = price += price * 0.1;
    }

    @Override
    public String toString(){
        return "Carro [brand: " + brand + ", price: " + price + "]";
    }
}
