package fundamentos;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Conversoes
{
    public static void main(String[] args)
    {
        Integer numero1 = 10000;
        // transforma em String e printa com funçãoes de String
        System.out.println(numero1.toString().substring(0));

        int numero2 = 10000;
        // faz a mesma coisa mas com o int primitivo
        System.out.println(Integer.toString(numero2).substring(0));


        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("Digite o seugundo numero");
        System.out.println(valor1 + valor2);

        Double Nunber1 = Double.parseDouble(valor1);
        Double Nunber2 = Double.parseDouble(valor2);
        Double soma = Nunber1 + Nunber2;
        System.out.println("a soma é: " 
        + BigDecimal.valueOf(soma).setScale(2, RoundingMode.HALF_EVEN));
        
        System.out.println("a média é: " 
        + BigDecimal.valueOf(soma / 2).setScale(2, RoundingMode.HALF_EVEN));

    }    
}
