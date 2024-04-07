package lambdas.Calculo;

@FunctionalInterface  // Não deixa criar mais de um método abstrato para usar um lambdas
public interface Calculo
{
    public double executar(double a, double b);     // método abstrato

    default String top()
    {
        return "Hello my frind!";
    }

    static String loveTest()
    {
        return "I love you";
    }
}
