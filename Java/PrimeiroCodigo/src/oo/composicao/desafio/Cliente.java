package oo.composicao.desafio;

import java.util.HashMap;

public class Cliente
{
    String nome;

    final HashMap<Double, Compra> compras = new HashMap<>();

    Cliente(String nome, Compra c)
    {
        this.nome = nome;
        adicionarCompra(c);
    }

    Cliente(String nome)
    {
        this.nome = nome;
    }


    void adicionarCompra(Compra c)
    {
        double vTotal = 0;
        for (double valor : c.Produtos.keySet())
        {
            vTotal += valor;
        }
        compras.put(vTotal, c);
        c.Cliente = this;
    }

    double getValorTotal()
    {
        double resultado = 0;
        for (double valores : compras.keySet())
        {
            resultado += valores;
        }
        return resultado;
    }


    @Override
    public String toString()
    {
        return nome;
    }
}