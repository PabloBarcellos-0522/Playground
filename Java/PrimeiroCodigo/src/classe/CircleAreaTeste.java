package classe;

public class CircleAreaTeste
{
    public static void main(String[] args)
    {
        CircleArea a1 = new CircleArea(10);
        // a1.pi = 10;
        
        CircleArea a2 = new CircleArea(5);
        // a2.pi = 5;

        CircleArea.pi = 3.1415;

        System.out.println(a1.area());
        System.out.println(a2.area());

        System.out.println(CircleArea.area(5));
    }
}
