package classe;

// import java.lang.*;
import java.util.*;

public class testes{    
    public static void main(String [] args){
        List<String> nomes = new ArrayList<String>();
        int qtd;
        String n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("insira a quantidade de pessoas. ");
        qtd = scanner.nextInt();

        for(int i = 0; i<qtd;++i){
            System.out.print("insirar o nome do "+Integer.toString(i+1)+"° ");
            n = scanner.next();
            nomes.add(n);

        }

        System.out.println("Lista dos nomes adicionados");
        for(String j: nomes){
            System.out.println(j);
        }

        scanner.close();
    }
}
