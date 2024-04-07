package fundamentos;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DesafioConversao
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
        Scanner entrada = new Scanner(System.in);

        new ProcessBuilder("clear").inheritIO().start().waitFor();
        System.out.print("digite o primeiro salario: ");
        String stringSalario_mes1 = entrada.nextLine().replace(',', '.');

        System.out.print("digite o segundo salario: ");
        String stringSalario_mes2 = entrada.nextLine().replace(',', '.');

        System.out.print("digite o terceiro salario: ");
        String stringSalario_mes3 = entrada.nextLine().replace(',', '.');


        double doubleSalario_mes1 = Double.parseDouble(stringSalario_mes1);
        double doubleSalario_mes2 = Double.parseDouble(stringSalario_mes2);
        double doubleSalario_mes3 = Double.parseDouble(stringSalario_mes3);

        double media = (doubleSalario_mes1 + doubleSalario_mes2 + doubleSalario_mes3)/3;
        System.out.println("a média do seu salário é: " 
        + BigDecimal.valueOf(media).setScale(2, RoundingMode.HALF_EVEN));

        entrada.close();
    }    
}
