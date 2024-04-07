package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter
{
    public static void main(String[] args)
    {
        ProdutoForDeafioFilter p1 = new ProdutoForDeafioFilter("Bolsinha", "1", 30.0);
        ProdutoForDeafioFilter p2 = new ProdutoForDeafioFilter("Bolsa", "2", 250.0);
        ProdutoForDeafioFilter p3 = new ProdutoForDeafioFilter("Caneta", "3", 3.0);
        ProdutoForDeafioFilter p4 = new ProdutoForDeafioFilter("Caderneta", "4", 10.0);
        ProdutoForDeafioFilter p5 = new ProdutoForDeafioFilter("Fone", "5", 70.0);
        ProdutoForDeafioFilter p6 = new ProdutoForDeafioFilter("Caixinha", "6", 20.0);
        ProdutoForDeafioFilter p7 = new ProdutoForDeafioFilter("Lápis", "7", 3.0);
        ProdutoForDeafioFilter p8 = new ProdutoForDeafioFilter("Borracha", "8", 5.0);
        ProdutoForDeafioFilter p9 = new ProdutoForDeafioFilter("Chaveiro", "9", 16.0);
        ProdutoForDeafioFilter p10 = new ProdutoForDeafioFilter("Pinto de borracha", "10", 999.0);

        List<ProdutoForDeafioFilter> Produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

        Predicate<ProdutoForDeafioFilter> barato = p -> p.preco <= 15;
        Predicate<ProdutoForDeafioFilter> comecaCom = p -> p.nome.startsWith("C");
        Function<ProdutoForDeafioFilter, String> saida = 
            p -> "O produto: \"" + p.nome + "\" é barato e começa com a letra 'C'";

        Produtos.stream()
            .filter(barato)
            .filter(comecaCom)
            .map(saida)
            .forEach(System.out::println);
    }
}