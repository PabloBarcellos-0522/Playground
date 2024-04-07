package bancoDeDados;

public class Actions extends Userdata
{
    public boolean LOGAR(String usuario, int senha)
    {
        return super.conferirDados(usuario, senha);
    }

    public void registrar(String usuario, int senha)
    {
        super.setDados(usuario, senha);
    }
    

    public void foda()
    {
        super.setDados("oi", 123);
    }


    public double catchSaldo(String usuario)
    {
        return getSaldo(usuario);
    }

    public void depositar(String usuario, Double valor)
    {
        addCash(usuario, valor);
    }
}