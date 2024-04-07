package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfAndElse 
{
    public static void main(String[] args) 
    {

        // If
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7)
            System.out.println("Aprovado!");
        
        if (media < 7 && media >= 4.5)
            System.out.println("Recuperação");

        if (media < 4.5 && media >= 0)
            System.out.println("Reprovado!");

        entrada.close();


        // Else
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero: "));

        if (valor % 2 == 0)
            System.out.printf("O valor %s é Par", valor);
        else if (valor % 2 == 1)
            System.out.printf("O valor %s é Impar", valor);
        else
            System.out.printf("O valor %s é Inválido", valor);

    }
}
