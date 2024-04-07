package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1
{
    public static void main(String[] args)
    {
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (s, n) -> n + s;

        // int total = numbs.stream()
        //             .reduce(soma)
        //             .get();

        int total = numbs.stream()
                    .reduce(0, soma);

        System.out.println(total);
    }
}