package fundamentos;

import java.io.IOException;
import java.util.Scanner;

public class DesafioCalculadora
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
        Scanner entScanner = new Scanner(System.in);

        boolean condicao = true;
        while (condicao)
        {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
            System.out.print("\n\nBem vindo a calculadora!\n--->  Informe o 1° numero: ");
            double digitOne = entScanner.nextDouble();

            System.out.print("--->  Informe o 2° numero: ");
            double digitTwo = entScanner.nextDouble();

            System.out.println("qual operação você deseja fazer? ( + , - , x , / , % )");
            String opcao = entScanner.next().toLowerCase();
            
            double result = 
                opcao.equals("+")? digitOne + digitTwo : 
                opcao.equals("-")? digitOne - digitTwo :
                opcao.equals("x") | opcao.equals("*")? digitOne * digitTwo : 
                opcao.equals("/")? digitOne / digitTwo :
                opcao.equals("%")? digitOne % digitTwo : 0;
            System.out.println("\no resultado é: " + result);
                
            System.out.println("\n\ndeseja continuar? (S/N)");
            condicao = entScanner.nextLine().toLowerCase().equals("s")? true : false;

        }
        
        entScanner.close();
    }    
}
