package fundamentos;

import java.util.Date;

public class NotacaoPonto 
{
    public static void main(String[] args)
    {
        String greet = "Bom dia X!";
        greet = greet.replace("X", "chupa_pinto")
                     .toUpperCase()
                     .concat("!!!!!");
        System.out.println("\n" + greet);

        Date nowDate = new Date();
        String className = nowDate.getClass().getSimpleName();
        System.out.println(className + ": " + nowDate);
    }
}
