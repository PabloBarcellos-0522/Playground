package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicado
{
    public static void main(String[] args)
    {
        Predicate<Produto> isCaro = 
            prod ->  (prod.preco * (1 - prod.desconto)) >= 750;
    
        Produto a = new Produto("Celular", 760, 0.1);
        System.out.println(isCaro.test(a));




        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("xingue lingue", 500, 0));
        produtos.add(new Produto("null", 0, 0));
        produtos.add(new Produto("Fone", 2, 1.0));
        produtos.add(new Produto("azideia", 900, 0));

        // produtos.forEach(produtinho -> {
        //     if (isCaro.test(produtinho))
        //         System.out.println(produtinho.nome);
        // });

        for (Produto produtinho : produtos) {
            if (isCaro.test(produtinho)) 
                System.out.println(produtinho.nome);
        }
    }
}