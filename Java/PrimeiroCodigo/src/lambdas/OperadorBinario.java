package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario
{
    public static void main(String[] args)
    {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(3.0, 4.0));

        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> ((n1 + n2) / 2) >= 7? "Aprovado": "Recuperação";
        System.out.println(resultado.apply(3.0, 4.0));


        Function<Double, String> conceito =      // Forma melhor!
            m -> m >= 7? "Aprovado": "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.0, 5.0));
    }
}