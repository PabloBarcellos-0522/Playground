package classe;

public class Data
{
    int dia;
    int mes;
    int ano;
    
    String getDateFormated(int x)
    {
        return String.format("\n\nCalendario %d: \n%d/%d/%d", x, dia, mes, ano);
    }

    Data()
    {
        // dia = 1;
        // mes = 1;
        // ano = 1980;
        this(1, 1, 1980);
    }

    Data(int dia, int chosenMonth, int chosenYear)
    {
        this.dia = dia;
        mes = chosenMonth;
        ano = chosenYear;
    }
}
