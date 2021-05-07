public class Fatorial {

    public static void main (String [] args){

        int resposta = fatorial(10); //insere o numero a ser fatorado
        System.out.println("O fatorial é " + resposta);
    }

    public static int fatorial(int n) { //começo da recursão, com o valor de 'n' sendo único para cada execução
        if (n == 0){ // fatorial de 0 é 1, e os fatorias serão feitos em empilhamento de métodos Os valores de 'n' não irão se misturar
            return 1; // aqui o método acaba assim que 'n' for igual a 0.

        }

        return n * fatorial(n - 1); // continua a recursividade, e essa chamada irá chamar ela na linha 11 novamente, até o 'n' ser igual a 0
    }
}
