import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaMercado = new ArrayList<>();
                                // new LinkedList<>() - não é usado array, os elementos são distribuidos na memoria

        //adicionando itens
        listaMercado.add("macarrão");
        listaMercado.add("feijão");
        listaMercado.add("ovo");
        listaMercado.add("sal");

        //ordenando itens (ordem alfabetica)
        Collections.sort(listaMercado);

        System.out.println(listaMercado);

        //iterando sobre os itens
        for (String item : listaMercado){
            System.out.println("Item: " + item);
        }

        for(int i = 0; i < listaMercado.size(); i++){
            String item = listaMercado.get(i);
            System.out.println("Item => " + item);
        }

        //removendo itens
        listaMercado.remove(0);
        System.out.println(listaMercado);
        listaMercado.remove("ovo");
        System.out.println(listaMercado);

        //checando e buscando itens
        System.out.println(listaMercado.contains("sal"));
        System.out.println(listaMercado.contains("farinha"));

        int posSal = listaMercado.indexOf("sal");
        System.out.println("Posição do sal: " + posSal);

        int posFarinha = listaMercado.indexOf("farinha");
        System.out.println("Posição do sal: " + posFarinha);


    }
}
