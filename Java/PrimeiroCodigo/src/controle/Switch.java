package controle;

import java.io.IOException;
import java.util.Scanner;

public class Switch
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        // if (bool...)
        // while (bool...)
        // for (;bool...;)
        // switch (valor puro)



        // switch "sem" o break
        String faixa = "preta";
        
        switch (faixa.toLowerCase())
        {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heaian Godan");
            case "verde":
                System.out.println("Sei o Heaian Yodan");
            case "laranja":
                System.out.println("Sei o Heaian Sandan");
            case "vermelha":
                System.out.println("Sei o Heaian Nidan");
            case "amarela":
                System.out.println("Sei o Heaian shodan");
                break
            ;
        
            default:
                System.out.println("Não sei de nada");
        }
        System.out.println("\n\n");


        int idade = 5;
        switch (idade)
        {
            case 5:
                System.out.println("Sabe programar");
            case 4:
                System.out.println("Sabe fazer o ENEM");
            case 3:
                System.out.println("Sabe falar");
            case 2:
                System.out.println("Sabe andar");
            case 1:
                System.out.println("Sabe respirar");
        }




        // switch com break

        Scanner getUserString = new Scanner(System.in);
        String conceito = "";
        System.out.print("Digite a nota: ");
        int nota = Integer.parseInt(getUserString.next());
        
        
        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8, 7:
                conceito = "B";
                break;
            case 6, 5:
                conceito = "C";
                break;
            case 4, 3:
                conceito = "D";
                break;
            case 2, 1, 0:
                conceito = "E";
                break;
            default:
                conceito = "invalído";
        }
        System.out.println("\n\nO conceito digitado é " + conceito);


        getUserString.close();
    }
}
