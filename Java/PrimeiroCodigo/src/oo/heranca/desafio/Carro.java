package oo.heranca.desafio;

public class Carro
{
    public int velocidadeAtual = 0;
    protected final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    protected Carro(int velocidade_maxima)
    {
        this.VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    public boolean acelerar()
    {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA)
        {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {
            velocidadeAtual += getDelta();
        }
        return true;
    }

    public boolean freiar()
    {
        if (velocidadeAtual >= getDelta())
        {
            velocidadeAtual -= getDelta();
            return true;
        }
        else
            return false;
    }

    
    // Getters and Setters
    public int getDelta()
    {
        return delta;
    }

    public void setDelta(int delta)
    {
        this.delta = delta;
    }
}
