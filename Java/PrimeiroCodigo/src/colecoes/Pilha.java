package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha
{
    public static void main(String[] args)
    {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno principe");
        livros.push("As cronicas de narnia");
        livros.push("Don Queixote");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());   // null
    }
}