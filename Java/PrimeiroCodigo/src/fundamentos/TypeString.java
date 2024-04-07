package fundamentos;

public class TypeString
{
    public static void main(String[] args)
    {
        System.out.println("Olá pessoal".charAt(0));
        String GREET = "Bom dia";

        System.out.println(GREET.concat("!!!"));
        System.out.println(GREET.toUpperCase().startsWith("BOM"));
        System.out.println(GREET.toLowerCase().startsWith("bom"));
        System.out.println(GREET.length());
        System.out.println(GREET.equals("Bom dia"));
        System.out.println(GREET.equalsIgnoreCase("bom dia"));
        System.out.println(GREET.substring(4, 7));
        System.out.println("");

        // System.out.println(GREET + "Arthur" + "você tem" + 12_000 + "reais");      ----> Código confuso
        System.out.printf("%s %s, você tem %d Reais!\n", GREET, "Arthur", 12_000);
    }
}