package lambdas;

public class Produto {
    final public String nome;
    final double preco;
    final double desconto;


    public Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    

    @Override
    public String toString() {
        return nome;
    }

}
