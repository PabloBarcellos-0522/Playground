package classe;

public class CircleArea
{
    double raio;
    static double pi = 3.14;

    CircleArea(double raioInicial)
    {
        // pi = 3.14;
        raio = raioInicial;
    }

    double area()
    {
        return pi * Math.pow(raio, 2);
    }

    static double area(double raio)
    {
        return pi * Math.pow(raio, 2); 
    }
}
