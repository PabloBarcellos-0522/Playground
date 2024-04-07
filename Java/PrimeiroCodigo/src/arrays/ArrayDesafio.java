package arrays;

import java.util.Scanner;

public class ArrayDesafio
{
    public static void main(String[] args)
    {
        Scanner getUserString = new Scanner(System.in);
        
        System.out.print("Quantas notas voçê quer informar? ");
        int nota = Integer.parseInt(getUserString.nextLine());

        double[] notas = new double[nota];
        for (int i = 0; i < nota; i++)
        {
            System.out.printf("Digite a nota %d: ", i+1);
            notas[i] = Double.parseDouble(getUserString.nextLine());
        }

        double total = 0;
        for (double i : notas)
        {
            total += i;
        }

        System.out.println("\nA média das notas é: " + total / notas.length);
        getUserString.close();
    }
}