package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo
{
    private boolean turbo;
    private boolean ar;

    public Ferrari()
    {
        super(315);
        // super.setDelta(15);
    }


            // Implements
    // Esportivo
    @Override
    public void ligarTurbo()
    {
        // setDelta(35);
        turbo = true;
    }

    @Override
    public void desligarTurbo()
    {
        // setDelta(15);
        turbo = false;
    }


    // Luxo
    @Override
    public void ligarAr()
    {
        ar = true;
    }

    @Override
    public void desligarAr()
    {
        ar = false;
    }


    @Override
    public int getDelta()
    {
        if (turbo && !ar)
            return 35;
        else if (turbo && ar)
            return 30;
        else if (!turbo && !ar)
            return 20;
        else
            return 15;
    }
}