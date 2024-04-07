package classe;

public class ProdudoTeste
{
    public static void main(String[] args)
    {
        // int a = 1;
        // Scanner getUserString = new Scanner(System.in);
        Produto sabonete = new Produto("Sabonete natura florest 100g");
        sabonete.preco = 100;

        var Shampoo = new Produto();
        Shampoo.nome = "Shampoo extra cremoso 150Ml";
        Shampoo.preco = 150;


        // double precoSabonete = sabonete.preco * (1 - sabonete.desconto);
        // double precoShampoo = Shampoo.preco * (1 - Shampoo.desconto);
        // System.out.println("  " + precoSabonete);
        // System.out.println("+" + precoShampoo);
        // System.out.println("------");
        // System.out.println(" " + (precoSabonete + precoShampoo));

        System.out.println("\nPreços com desconto:\n\n" + sabonete.precoComDesconto());
        System.out.println(Shampoo.precoComDesconto());
    }
}
