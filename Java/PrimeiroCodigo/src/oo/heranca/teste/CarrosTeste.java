package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarrosTeste
{
    public static void main(String[] args)
    {
        Ferrari ferrari = new Ferrari();
        Carro civic = new Civic();
        

        ferrari.acelerar();
        civic.acelerar();

        System.out.println(ferrari.velocidadeAtual);
        System.out.println(civic.velocidadeAtual);

        ferrari.freiar();
        ferrari.freiar();
        ferrari.freiar();

        civic.freiar();
    }
}