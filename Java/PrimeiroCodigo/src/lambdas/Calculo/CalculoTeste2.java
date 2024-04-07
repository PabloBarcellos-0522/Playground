package lambdas.Calculo;

public class CalculoTeste2
{
    public static void main(String[] args)
    {
        // Calculo soma = (double x, double y) -> {
        //     return x + y;
        // };

        Calculo soma = (double x, double y) -> {return x + y;};  // várias sentenças (blocos de código)

        soma = (x, y) -> x + y; // apenas uma sentença com retorno automático

        Calculo multiplicar = (double a, double b) -> a * b;

        System.out.println(soma.executar(2, 3));
        System.out.println(multiplicar.executar(2, 3));
    }
}