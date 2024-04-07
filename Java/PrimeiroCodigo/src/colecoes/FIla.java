package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FIla
{
    public static void main(String[] args)
    {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Rafela");
        fila.offer("Gui");

        System.out.println(fila.peek());      // retorna falso se estiver vazia
        System.out.println(fila.element());   // Lança uma exeção se estiver vazia
        System.out.println(fila.poll());      // retorna e remove o elemento
        System.out.println(fila.remove());
    }
}