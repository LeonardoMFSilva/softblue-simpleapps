package br.com.softblue.lambda;

public class Main {

    public static void main(String[] args) {
        Operator operator = (x, y) -> x * y; //smepre tente a forma mais simples de implementar a lambda
        System.out.println(operator.execute(5, 2));

        Operator op = (x, y) -> {
            int r = x + y;
            return r;
        }; // outra forma de fazer, normalmente utilizada em metodos mais complexos
        System.out.println(op.execute(5, 2));
    }
}
