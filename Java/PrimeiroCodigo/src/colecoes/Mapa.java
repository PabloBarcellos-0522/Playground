package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa
{
    public static void main(String[] args)
    {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Rebeca");

        System.out.println(usuarios.get(1));
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Rafaela"));

        for (int chave : usuarios.keySet())
        {
            System.out.println(chave);
        }

        for (String string : usuarios.values())
        {
            System.out.println(string);
        }

        for (Entry<Integer, String> registro: usuarios.entrySet())
        {
            System.out.print(registro.getKey() + "==> ");
            System.out.println(registro.getValue());
        }
    }
}