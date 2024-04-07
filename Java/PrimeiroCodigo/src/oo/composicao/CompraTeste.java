package oo.composicao;

public class CompraTeste
{
    public static void main(String[] args)
    {
        Compra c1 = new Compra();
        c1.cliente = "joão pedro";

        c1.adicinarItem(new Item("caneta", 20, 7.45));
        c1.adicinarItem(new Item("boracha", 12, 3.89));
        c1.adicinarItem("caderno", 3, 18.79);

        System.out.println(c1.items.size());
        System.out.println(c1.getValorTotal());
    }
}