package fundamentos;

public class Whappers
{
    public static void main(String[] args)
    {
        // Whappers
        Byte A = 100;
        Short B = 1000;
        Integer C = 10000;
        Long D = 100000000L;

        // Primitivos
        byte a = 100;
        short b = 1000;
        int c = 10000;
        long d = 100000000L;

                            // É possivel modificar
        System.out.println(A.byteValue());
        System.out.println(B.shortValue());
        System.out.println(C.intValue());
        System.out.println(D.longValue());

                            // Não é possivel modificar
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // double
        Double DO = 5.5;
        System.out.println(DO);

        // float (o Float objeto tem que colocar o 'F' no fim)
        Float F = 5.0F;
        System.out.println(F);
        // System.out.println();

        // boolean
        Boolean BO = Boolean.parseBoolean("true");
        System.out.println(BO.toString().toUpperCase());

        // char
        Character CA = 'i';
        System.out.println(Character.toUpperCase(CA));
    }    
}
