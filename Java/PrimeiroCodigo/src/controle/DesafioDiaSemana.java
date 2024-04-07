package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioDiaSemana 
{
    public static void main(String[] args)
    {
        
        // domingo = 1
        // segunda = 2
        // terça = 3


        String diaDaSemanaEscolhido = JOptionPane.showInputDialog("\nDigite o dia da semana").toLowerCase();

        if (diaDaSemanaEscolhido.equals("domingo"))
            System.out.println(1);
        else if (diaDaSemanaEscolhido.equals("segunda"))
            System.out.println(2);
        else if (diaDaSemanaEscolhido.equals("terça"))
            System.out.println(3);
        else if (diaDaSemanaEscolhido.equals("quarta"))
            System.out.println(4);
        else if (diaDaSemanaEscolhido.equals("quinta"))
            System.out.println(5);
        else if (diaDaSemanaEscolhido.equals("sexta"))
            System.out.println(6);
        else if (diaDaSemanaEscolhido.equals("sabado"))
            System.out.println(7);


        Scanner getScanner = new Scanner(System.in);

        String diaDaSemana = getScanner.nextLine().toLowerCase();

        int numero= diaDaSemana.equals("domingo")? 1 :
                    diaDaSemana.equals("segunda")? 2 :
                    diaDaSemana.equals("terça") || diaDaSemana.equals("terca")?   3 :
                    diaDaSemana.equals("quarta")?  4 :
                    diaDaSemana.equals("quinta")?  5 :
                    diaDaSemana.equals("sexta")?   6 :
                    diaDaSemana.equals("sábado") || diaDaSemana.equals("sabado")?  7 : 0;
        if (numero == 0)
            System.out.println("Não entendi tente novamente...");
        else 
            System.out.println(numero);
        

        getScanner.close();
    }
}
