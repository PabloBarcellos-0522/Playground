package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario
{
    public static void main(String[] args)
    {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDois
                        .andThen(vezesDois)     // 1
                        .andThen(aoQuadrado)    // 2
                        .apply(0);            // 3
        System.out.println(resultado1);

        // invertido (mesmo resultado)
        int resultado2 = aoQuadrado             // 3
                        .compose(vezesDois)     // 2
                        .compose(maisDois)      // 1
                        .apply(0);
        System.out.println(resultado2);
    }
}