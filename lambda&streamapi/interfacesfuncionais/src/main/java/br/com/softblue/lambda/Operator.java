package br.com.softblue.lambda;

@FunctionalInterface //impede que mais de um metodo não implementado seja criado.
public interface Operator {

    int execute (int x, int y);

    default void say(){
        System.out.println("Interfaces funcionais podem ter mais de um método, porém, só podem ter um método não implementado");
    }
}
