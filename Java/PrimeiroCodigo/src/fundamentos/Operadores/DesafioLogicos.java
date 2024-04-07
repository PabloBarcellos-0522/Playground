package fundamentos.Operadores;

import java.io.IOException;

public class DesafioLogicos
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        
        // Trabalho na terça (v | F)
        // Trabalho na quinta (v | F)
        boolean toWork1 = false;
        boolean toWork2 = false;

        boolean buyTv50 = toWork1 && toWork2;
        boolean buyTv32 = toWork1 ^ toWork2;
        boolean iceCream = toWork1 | toWork2;

        System.out.println("comprou TV 50\" ? " + buyTv50);
        System.out.println("comprou TV 32\" ? " + buyTv32);
        System.out.println("comprou sorvete ? " + iceCream);
        System.out.println("Ficou saldavel ?  " + !iceCream);


        if (iceCream)
        {
            if (buyTv50)
            {
                System.out.println("\ncompraram a tv50 e tomaram sorvete");
            }
            else{
                System.out.println("\ncompraram a tv32 e tomaram sorvete");
            }
        }
        else{
            System.out.println("\npassaram fome, não compraram tv e ficaram saldaveis");
        }
    }
}
