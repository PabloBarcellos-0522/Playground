package classe.Desafio;

import java.util.ArrayList;

public class Pessoa
{
    static ArrayList<String> comidas = new ArrayList<>();
    static String comidas1 = "\nLista de comidas:";
    String name;
    double weight;

    Pessoa(String name, double weight)
    {
        this.name = name;
        this.weight = weight;
    }

    double Comer(Comida comida)
    {
        this.weight += comida.weight;
        comidas.add(comida.name);
        return this.weight;
    }


    static String listFoods()
    {
        for (String e: comidas)
        {
            comidas1 += "\n" + e;
        }
        return comidas1;
    }
}