package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Foreach
{
    public static void main(String[] args)
    {
        List<String> aprovados = new ArrayList<>();
        aprovados.add("Ana");
        aprovados.add("Bia");
        aprovados.add("Gay");

        System.out.println("\nForma tradicinal:");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #1:");
        
        // aprovados.forEach((nome) -> { System.out.println(nome); });   se tiver só 1 parametro, pode tirar os parenteses "()"
        aprovados.forEach(nome -> System.out.println(nome));

        
        System.out.println("\nLambda #2:");
        aprovados.forEach(nome -> meuImprimir(nome));


        System.out.println("\nMethod Reference #1;");
        aprovados.forEach(System.out::println);
        


        // System.out.println("\nMethod Reference #2:");
        // aprovados.forEach(Foreach::meuImprimir());
    }

    static void meuImprimir(String nome)
        {
            System.out.println("Oi meu nome é " + nome);
        }
}