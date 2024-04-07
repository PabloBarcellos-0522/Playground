package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista
{
    public static void main(String[] args)
    {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Gabi"));
        lista.add(new Usuario("Manuela"));
        lista.add(new Usuario("Gean"));
        lista.add(new Usuario("Bob"));

        System.out.println(lista.get(3));        // acessar pelo indice

        lista.remove(0);                         // retorna o valor excluido
        lista.remove(new Usuario("Gean"));        // retorna verdadeiro ou falso
        lista.contains(new Usuario("Manuela"));   // apenas mostra se tem ou não um valor

        for (Usuario U : lista)
        {
            System.out.println(U);    
        }
    }
}