package oo.abstrato;

public abstract class Mamifero extends Animal
{
    @Override
    public final String mover()
    {
        return "Com as patas";
    }

    public abstract String mamar();
}
