package controle;

import java.util.Scanner;

public class DesafioWhile
{
    public static void main(String[] args)
    {
        System.out.println("Bem vindo a calculadora de notas!");
        Scanner getUserString = new Scanner(System.in);
        double nota = 0;
        double sumNotes = 0;
        int numberNotes = 0;
        
        while (nota != -1)
        {
            System.out.printf("Nota do %s° aluno  (-1 / sair): ", numberNotes +1);
            nota = Double.parseDouble(getUserString.next());
            if (nota >= 0 && nota <= 10)
            {
                sumNotes += nota;
                numberNotes++;
            }
            else if (nota != -1){
                System.out.println("Digite um valor válido\n\n");
            }
            
        }

        System.out.println(sumNotes / numberNotes);

        getUserString.close();
    }
}
