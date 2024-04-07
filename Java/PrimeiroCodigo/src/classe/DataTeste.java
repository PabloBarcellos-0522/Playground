package classe;

import java.util.Scanner;

public class DataTeste
{
    public static void main(String[] args)
    {
        Scanner getUserString = new Scanner(System.in);
        
        Data calendario1 = new Data();
        System.out.print("\nCalendario 1: \nDigite o dia:");
        int dia = Integer.parseInt(getUserString.next());
        calendario1.dia = dia;
        System.out.print("Digite o mês:");
        int mes = Integer.parseInt(getUserString.next());
        calendario1.mes = mes;
        System.out.print("Digite o ano:");
        int ano = Integer.parseInt(getUserString.next());
        calendario1.ano = ano;
        
        Data calendario2 = new Data();
        calendario2.dia =6;

        Data calendario3 = new Data(05, 22, 2025);


        System.out.printf(calendario1.getDateFormated(1));
        System.out.printf(calendario2.getDateFormated(2));
        System.out.printf(calendario3.getDateFormated(3));

        String n = Integer.toString(calendario1.dia);
        System.out.println(n);

        getUserString.close();
    }
}
