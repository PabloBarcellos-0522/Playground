package oo.composicao.desafio;

public class ClienteTeste
{
    public static void main(String[] args)
    {

        Produto p1 = new Produto("Sabão", 18.99);
        Produto p2 = new Produto("Notebook", 1800.99);
        Produto p3 = new Produto("Protetor Solar", 150);


        Compra c1 = new Compra();
        Compra c2 = new Compra("Cadeira", 59.99, 1);

        c1.adicionarProduto(p1, 3);
        c1.adicionarProduto(p2, 1);
        c1.adicionarProduto(p3, 2);

        c2.adicionarProduto(p1, 3);
        c2.adicionarProduto(p2, 1);
        c2.adicionarProduto(p3, 2);

        Cliente C = new Cliente("Pablo", c1);

        C.adicionarCompra(c2);

        System.out.println(C.nome);
        System.out.println(C.getValorTotal());

        System.out.println(c1.Produtos);
        System.out.println(c2.Produtos);
    }
}