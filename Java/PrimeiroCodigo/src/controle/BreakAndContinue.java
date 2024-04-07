package controle;

public class BreakAndContinue
{
    public static void main(String[] args)
    {
        // break => Quebra o laço ou execução
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
                break;
            System.out.println(i);
        }
        System.out.println("Fim\n\n");

        // continue => Pula a execução para a próxima
        for (int i = 0; i <= 10; i++)
        {
            if (i %2 == 1)
                continue;
            System.out.println(i);
        }
    }
}
