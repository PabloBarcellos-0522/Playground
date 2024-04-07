package oo.encapsulamento;

public class Pessoa
{
    private int idade;
    private String nome;
    private String sobrenome;


    Pessoa(String nome, String sobrenome, int idade)
    {
        // this.nome = nome;
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }


    public String getNomeCompleto()
    {
        return getNome() + " " + getSobrenome();
    }


    // Nome
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }


    // Sobrenome
    public String getSobrenome()
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome)
    {
        if (sobrenome != "Pedro")
            this.sobrenome = sobrenome;
        else if (getSobrenome() == null)
            setSobrenome("(SOBRENOME NÃO ENCONTRADO)");
    }

    
    // Idade
    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int novaIdade)
    {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120)
            this.idade = novaIdade;
    }


    // Apresentação
    @Override
    public String toString()
    {
        return "Olá meu nome é " + getNome() + " " + getSobrenome()
                            + ", e tenho " + getIdade() + " anos!";
    }
}