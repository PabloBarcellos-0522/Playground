package oo.composicao;

import java.util.ArrayList;

public class Compra
{
    String cliente;
    ArrayList<Item> items = new ArrayList<>();

    void adicinarItem(Item item)
    {
        items.add(item);
        item.compra = this;
    }

    void adicinarItem(String name, int amount, double price)
    {
        adicinarItem(new Item(name, amount, price));
    }

    double getValorTotal()
    {
        double total = 0;

        for (Item item : items)
            total += item.preco * item.quantidade;
        return total;
    }
}