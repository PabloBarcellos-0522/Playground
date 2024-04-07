package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado
{
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args)
    {
        HashSet conjunto = new HashSet();

        conjunto.add(1.4);
        conjunto.add(true);
        conjunto.add("asd");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size());


        Set numeros = new HashSet();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        System.out.println(numeros);

        // conjunto.addAll(numeros);
        conjunto.retainAll(numeros);
        System.out.println(conjunto);

    }
}