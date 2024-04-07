package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz
{
    public static void main(String[] args)
    {
        Scanner getUserString = new Scanner(System.in);
        
        System.out.print("Quantos alunos? ");
        int qtdeAlunos = getUserString.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdenotas = getUserString.nextInt();

        double total = 0;
        double[][] notasDaTurma = new double[qtdeAlunos][qtdenotas];
        for (int A = 0; A < notasDaTurma.length; A++)
        {
            for (int N = 0; N < notasDaTurma.length; N++)
            {
                System.out.printf("Informe a nota %d do aluno %d: ", N + 1, A + 1);
                notasDaTurma[A][N] = Double.parseDouble(getUserString.next());
                total += notasDaTurma[A][N];
            }
        }

        getUserString.close();
        System.out.println("Média: " + (total / (qtdeAlunos * qtdenotas)));

        for (double[] notas : notasDaTurma)
        {
            System.out.println(Arrays.toString(notas));
        }
    }
}