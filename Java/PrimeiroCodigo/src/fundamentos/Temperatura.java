package fundamentos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Temperatura
{
    public static void main(String[] args) 
    {
        // Calcular F para Celcios
        final int Ajuste = 32;
        final double Fator = 5/9.0;
        double Fahrenheit = 52;
        double Resultado = (Fahrenheit - Ajuste) * Fator;
        
        BigDecimal shortDecimal = new BigDecimal(Resultado).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("\n\nO resultado é " + shortDecimal.doubleValue() + "°C");

        String Result = String
        .format("\n\nO resultado é %.2f °C\n", Resultado);

        System.out.println(Result.replace(",", "."));;
    }
}
