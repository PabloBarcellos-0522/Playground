package classe.Desafio;

public class Pessoa2
{
    String nome;
    int idade;

    Pessoa2(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    String imprimir(MaquinaDeNomes M)
    {
        if (M.funcionando)
        {
            String painel = "O nome " + this.nome + " foi impresso com a idade: " + Integer.toString(this.idade);
            return painel;
        }
        else{
            return "A impressora não está funcionado";
        }
    }
}