package oo.heranca;

public class Jogador
{
    public int life = 100;
    public int x;
    public int y;

    protected Jogador()
    {
        this(0, 0);
    }

    protected Jogador(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente)
    {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1)
        {
            oponente.life -= 10;
            return true;
        }
        else if (deltaX == 1 && deltaY == 0)
        {
            oponente.life -= 10;
            return true;
        }
        else
            return false;
    }

    public boolean andar(Direcao direcao)
    {
        if (x >= 1)
        {
            switch (direcao)
            {
                case LESTE:
                    x++;
                    return true;
                case OESTE:
                    x--;
                    return true;
                default:
                break;
            }
        }
        else if (direcao == Direcao.LESTE) {
            x++;
            return true;
        }
        else if (direcao == Direcao.NORTE) {
            y++;
            return true;
        }

        if (y >= 1)
        {
            switch (direcao)
            {
                case NORTE:
                    y++;
                    return true;
                case SUL:
                    y--;
                    return true;
                default:
                    return false;
            }
        }
        else {
            return false;
        }



        // switch (direcao)
        // {
        //     case NORTE:
        //         y++;
        //         return true;
        //     case SUL:
        //         y--;
        //         return true;
        //     case LESTE:
        //         x++;
        //         return true;
        //     case OESTE:
        //         x--;
        //         return true;
        //     default:
        //         return false;
        // }
    }
}