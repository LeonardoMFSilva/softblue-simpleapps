import java.util.Objects;

public class Mes implements Comparable<Mes>{

    private String nome;
    private int numero;

    public Mes(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }

    @Override
    public int compareTo(Mes o) {
         if (this.numero < o.numero){
             return -1;
         } else if (this.numero > o.numero){
             return 1;
         }
         return 0;
    }
}
