package bancoDeDados;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Userdata
{
    private Map<String, Integer> dados = new HashMap<>();
    private Map<String, Double> conta = new HashMap<>();


                // Dados
    boolean conferirDados(String usuario, int senha)
    {
        if (dados.get(usuario) == senha)
            return true;
        else
            return false;
    }

    void setDados(String usuario, int senha)
    {
        dados.put(usuario, senha);
    }

    public Set<Entry<String, Integer>> lista()
    {
        return dados.entrySet();
    }
    

                    // conta
    double getSaldo(String usuario)
    {
        try 
        {
            return conta.get(usuario);
        } 
        catch (Exception e) {
            return 0;
        }
    }

    void addCash(String usuario, Double valor)
    {
        conta.put(usuario, getSaldo(usuario)+ valor);
    }
}
