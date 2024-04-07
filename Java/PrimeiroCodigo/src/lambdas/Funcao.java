package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Funcao
{
    public static void main(String[] args)
    {
        Function<Integer, String> parOrImpar = 
            numero -> numero%2 == 0? "Par": "Impar";

        System.out.println(parOrImpar.apply(6));
        
        UnaryOperator<String> oResultadoE =
            valor -> "O resultado é " + valor;


        Function<String, String> empolgado =
            valor -> valor + "!!!";
            
        String resultadoFinal = parOrImpar
            .andThen(oResultadoE)
            .andThen(empolgado)
            .apply(33);

        System.out.println(resultadoFinal);
    }
}