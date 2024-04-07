package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio
{
    public static void main(String[] args)
    {
        Produto p = new Produto("Ipad", 3235.89, 0.13);

        Function<Produto, Double> precoComDesconto = 
            m -> m.preco * (1 - m.desconto);
        UnaryOperator<Double> imposto =
            m -> m >= 2500? m * 1.085: m;
        UnaryOperator<Double> frete =
            m -> m >= 3000? m + 100: m + 50;
        DecimalFormat fmt = new DecimalFormat("0.00");
        UnaryOperator<Double> arredondar =
            m -> Double.parseDouble(fmt.format(m).replace(',', '.'));
        Function<Double, String> precoFinal = 
            m -> ("Preço Final: R$" + m).replace('.', ',');

        System.out.println(precoComDesconto
                        .andThen(imposto)
                        .andThen(frete)
                        .andThen(arredondar)
                        .andThen(precoFinal)
                        .apply(p));
    }
}