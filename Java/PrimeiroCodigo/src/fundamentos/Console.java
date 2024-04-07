package fundamentos;

import java.util.Scanner;

public class Console
{
    public static void main(String[] args)
    {
        //print na mesma linha
        System.out.print("\nBom");
        System.out.print(" dia!\n");

        // print com format e também na mesma linha
        System.out.printf("MEGASENA: %s %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6, 7);

        // abro o Scanner para pegar a entrada do usuario e imprimi-la
        Scanner entrada =  new Scanner(System.in);
        System.out.print("\nDigite seu nome: ");    
        String chosenName = entrada.nextLine();
        System.out.println(chosenName);
    
        // // tem que fechar o Scanner
        entrada.close();
    }
}
