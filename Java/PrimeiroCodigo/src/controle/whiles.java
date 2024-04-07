package controle;

import java.util.Scanner;

public class whiles
{
    public static void main(String[] args)
    {
        Scanner getUserString = new Scanner(System.in);
        String teste = "";
    
        while (!teste.equals("sair"))
            teste = getUserString.next().toLowerCase()
        ;
            
            
        int nunber = 1;
        while (nunber <= 10) 
        {
            System.out.println(nunber);
            nunber++;
        }
        
        
        
        // do {} while (...);                 (É executado pelo menos 1 vez)
        
        do 
        {
            System.out.println("Fale as pavavras magicas...");
            System.out.print("Digite:");
            teste = getUserString.nextLine().toLowerCase();
        } while (!teste.equals("por favor"));
        
        System.out.println("Obrigado!");
        getUserString.close();
    }
}
