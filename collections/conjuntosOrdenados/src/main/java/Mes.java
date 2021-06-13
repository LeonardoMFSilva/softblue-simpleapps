import java.util.Objects;

public class Mes {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mes mes = (Mes) o;
        return numero == mes.numero && nome.equals(mes.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}
