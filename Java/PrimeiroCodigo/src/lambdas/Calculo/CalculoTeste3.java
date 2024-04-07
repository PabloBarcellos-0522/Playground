package lambdas.Calculo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class CalculoTeste3
{
    public static void main(String[] args)
    {
        BinaryOperator<Integer> soma = (x, y) -> {return x + y;};  // várias sentenças (blocos de código)
        System.out.println(soma.apply(2, 3));

        BinaryOperator<Double> divisao = (x, y) -> x / y;
        System.out.println(divisao.apply(50.0, 10.0));


        BiFunction<Double, Double, String> somaEmTexto = (x, y) -> {
            double a = x + y;
            return String.format("%s", a);
        };

        System.out.println(somaEmTexto.apply(4.0, 5.0));
    }
}