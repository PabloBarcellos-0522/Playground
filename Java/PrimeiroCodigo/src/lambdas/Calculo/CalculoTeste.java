package lambdas.Calculo;

public class CalculoTeste
{
    public static void main(String[] args)
    {
        // Calculo soma = new Somar();
        // Calculo multiplicacao = new Multiplicar();

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2, 3));
        
        calculo = new Multiplicar();
        System.out.println(calculo.executar(2, 3));
    }
}