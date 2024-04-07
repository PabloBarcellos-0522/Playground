package classe;

public class Equals
{
    public static void main(String[] args)
    {
        Usuario u1 = new Usuario();
        u1.nome = "xamuel";
        u1.email = "xamuelfiladamãe@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "xamuel";
        u2.email = "xamuelfiladamãe@gmail.com";

        System.out.println(u1 == u2);       // false
        System.out.println(u1.equals(u2));  // true se fizer o código em Usuário
    }
}