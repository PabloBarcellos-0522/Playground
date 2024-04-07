package classe.Desafio;

public class jantar
{
    public static void main(String[] args)
    {

        Pessoa p = new Pessoa("Pablo", 60);

        Comida c = new Comida("Feijão", 0.5);
        Comida c2 = new Comida("Arroz", 1.5);
        Comida c3 = new Comida("Arroz", 1.5);
        Comida c4 = new Comida("Arroz", 1.5);
        Comida c5 = new Comida("Arroz", 1.5);
        Comida c6 = new Comida("Arroz", 1.5);
        Comida c7 = new Comida("Arroz", 1.5);
        Comida c8 = new Comida("Arroz", 1.5);
        Comida c9 = new Comida("Arroz", 1.5);
        Comida c10 = new Comida("Arroz", 1.5);
        Comida c11 = new Comida("Arroz", 1.5);
        Comida c12 = new Comida("Arroz", 1.5);
        
        double initialWeightPeople = p.weight;

        p.Comer(c);
        p.Comer(c2);
        p.Comer(c3);
        p.Comer(c4);
        p.Comer(c5);
        p.Comer(c6);
        p.Comer(c7);
        p.Comer(c8);
        p.Comer(c9);
        p.Comer(c10);
        p.Comer(c12);
        p.Comer(c11);

        System.out.println("");
        System.out.println(p.name);
        System.out.println(initialWeightPeople +" --> "+ p.weight);

        Pessoa.listFoods();

        System.out.println(Pessoa.comidas1);
    }
}