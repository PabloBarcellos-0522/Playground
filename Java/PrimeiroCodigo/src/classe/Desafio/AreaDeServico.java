package classe.Desafio;

public class AreaDeServico
{
    public static void main(String[] args)
    {
        Pessoa2 p = new Pessoa2("joão", 18);
        MaquinaDeNomes m = new MaquinaDeNomes(10);

        System.out.println(p.imprimir(m));
    }
}