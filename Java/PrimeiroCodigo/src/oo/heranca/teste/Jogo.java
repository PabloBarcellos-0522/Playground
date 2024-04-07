package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo
{
    public static void main(String[] args)
    {
        Jogador mostro = new Monstro();
        mostro.x = 10;
        mostro.y = 10;
        
        Jogador heroi = new Heroi(10, 11);
 

        System.out.println("Mostro tem ==>" + mostro.life);
        System.out.println("heroi tem ==>" + heroi.life);
        
        mostro.atacar(heroi);
        heroi.atacar(mostro);
        mostro.atacar(heroi);
        heroi.atacar(mostro);
        mostro.andar(Direcao.NORTE);
        heroi.atacar(mostro);
        mostro.atacar(heroi);
        heroi.atacar(mostro);
        
        System.out.println("Mostro tem ==>" + mostro.life);
        System.out.println("heroi tem ==>" + heroi.life);
    }
}