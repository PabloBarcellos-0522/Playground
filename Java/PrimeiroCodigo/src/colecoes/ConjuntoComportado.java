package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado
{
    public static void main(String[] args)
    {
        // Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Pedro");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");

        for (String nome : listaAprovados)
        {
            System.out.println(nome);    
        }


        SortedSet<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for (int nome : nums)
        {
            System.out.println(nome);    
        }
    }
}