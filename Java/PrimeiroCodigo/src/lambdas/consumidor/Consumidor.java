package lambdas.consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import lambdas.Produto;

public class Consumidor
{
    public static void main(String[] args)
    {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("xingue lingue", 500, 0));
        produtos.add(new Produto("null", 0, 0));
        produtos.add(new Produto("Fone", 2, 1.0));
        produtos.add(new Produto("azideia", 900, 0));

        imprimir.accept(produtos.get(0));

        System.out.println("");
        produtos.forEach(imprimir);
        
        System.out.println("");
        produtos.forEach(p -> System.out.println(p.nome));
        
        System.out.println("");
        produtos.forEach(System.out::println);
    }
}