package fundamentos.Operadores;

public class DesafioAritimedico
{
    public static void main(String[] args)
    {
        int calc1 = (int) Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        int calc2 = (int) Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
        int result = (int) (Math.pow((calc1 - calc2), 3) / Math.pow(10, 3));

        System.out.println("o resultado da equação é: " + result);
    }    
}
