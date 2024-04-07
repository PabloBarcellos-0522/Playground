package classe.Desafio;

import java.util.concurrent.ThreadLocalRandom;

public class MaquinaDeNomes
{
    boolean funcionando;

    MaquinaDeNomes()
    {
        funcionando = ThreadLocalRandom.current().nextInt(2) == 1? true : false;
    }

    MaquinaDeNomes(int x)
    {
        funcionando = ThreadLocalRandom.current().nextInt(x) == 1? true : false;
    }
}