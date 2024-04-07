package oo.composicao.desafio;

import java.util.HashMap;

public class Compra
{
    Cliente Cliente = null;
    double vTotal;
    final HashMap<Double, Produto> Produtos = new HashMap<>();
    
    Compra(String nome, double preco, int quantidade)
    {
        Produto produto1 = new Produto(nome, preco);
        Produtos.put(produto1.preco * quantidade, produto1);
        this.vTotal += preco * quantidade;
    }
    
    Compra() {}

    
    void adicionarProduto(Produto p, int quantidade)
    {
        Produtos.put(p.preco * quantidade, p);
        this.vTotal += p.preco * quantidade;
    }

}