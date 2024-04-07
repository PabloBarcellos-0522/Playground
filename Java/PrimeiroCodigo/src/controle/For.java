package controle;

public class For
{
    public static void main(String[] args)
    {
              // Variavel  // Até quando repetir  // Atualizar varialvel
        for (int contador = 1;    contador <= 10;      contador++)
            System.out.printf("--> %s\n", contador);

        // Laço infinito
        for (;true;)
        {
            System.out.println("oi");
            break;
        }

        // Mini desafio
        for(int count = 10; count >= 0; count -= 2)
        {
            System.out.println("Contador = " + count);
        }
    }
}
