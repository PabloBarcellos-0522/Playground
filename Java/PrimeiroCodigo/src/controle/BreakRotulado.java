package controle;

public class BreakRotulado
{
    public static void main(String[] args)
    {
        // Atenção: metodo complexo para leitura a seguir //
        // escolhe o nome do rótulo para escolher qual laço voce quer quebrar:

        // break
        laço_externo: for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (i == 1)
                    break laço_externo
                ;
                System.out.print(i +""+ j +" ");
            }
            System.out.println("");
        }

        // continue
        laço_externo: for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (j == 1)
                    continue laço_externo
                ;
                System.out.print(i +""+ j +" ");
            }
            System.out.println("");
        }
    }
}