package arrays;

public class Array
{
    public static void main(String[] args)
    {
        double[] notasAlunosA = new double[3];
        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 9;

        double[] notasAlunosB = { 6.9, 8.9, 5.5, 10 };


        double totalAlunoA = 0;
        for (double i : notasAlunosA)
        {
            totalAlunoA += i;
            System.out.println(i);
        }
        System.out.println(totalAlunoA / notasAlunosA.length);


        System.out.println("\n\n");
        double totalAlunoB = 0;

        for (double i : notasAlunosB)
        {
            totalAlunoB += i;
            System.out.println(i);
        }
        System.out.println(totalAlunoB / notasAlunosB.length);
    }
}