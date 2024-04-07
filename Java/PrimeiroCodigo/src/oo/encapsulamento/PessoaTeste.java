package oo.encapsulamento;

public class PessoaTeste
{
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa("João", "Pedro", -30);
        System.out.println(p1);  // toString
        p1.setIdade(30);  // setIdade

        System.out.println(p1.getIdade());  // getIdade
    }
}