package caixaEletronico;

import java.lang.Thread;
import bancoDeDados.Actions;
import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
        
        Actions entrar = new Actions();
        Scanner getUserString = new Scanner(System.in);
        String usuario = null;
        int logado = 0;
        boolean token = false;

        boolean confirmacao1 = true;
        while (confirmacao1)
        {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
            String entrada;

            System.out.println("Bem vindo ao banco UVV-ON!!");
            System.out.println("Escolha:  ");
            System.out.print("\n=================+");
            System.out.print("\n[0]: Caixa      ||\n[1]: Registrar  ||\n[2]: Usar Token ||\n[3]: Contato    ||");
            System.out.print("\n=================+\n\n");
            System.out.println(entrar.lista());
            

            entrada = getUserString.next();

            switch (Integer.parseInt(entrada))
            {
                case 0:             // Caixa
                    logado += 1;
                    if (!token)
                    {
                        boolean autentificacao = true;
                        while (autentificacao)
                        {
                            try
                            {
                                System.out.println("qual seu Usuário?");
                                entrada = getUserString.next();
                                usuario = entrada;

                                System.out.println("qual sua Senha?");
                                entrada = getUserString.next();
                                int senha = Integer.parseInt(entrada);
                                token = entrar.LOGAR(usuario, senha);
                            } catch (Exception e) {
                                token = false;
                            }
                            
                            if (token)
                            {
                                autentificacao = false;    
                            }
                            else
                                System.out.println("\n\n==>  Nome de usuario ou senha incorretos\n");
                        }
                    }
                    break;

                case 1:                     // Registrar
                    System.out.print("crie seu Usuário (Letras, Números e Simbolos):");
                    entrada = getUserString.next();
                    usuario = entrada;


                    boolean autentificacao2 = true;
                    while (autentificacao2)
                    {
                        try
                        {
                            System.out.print("crie sua Senha (Apenas números)");
                            entrada = getUserString.next();
                            int senha = Integer.parseInt(entrada.trim());

                            System.out.println(senha);
                            Thread.sleep(2000);

                            autentificacao2 = false;
                            entrar.registrar(usuario, senha);
                        }
                        catch (Exception e) {
                            System.out.println("ERRO, crie o usuário e senha corretamente!");
                            System.out.println(e);
                        }
                    }
                    break;

                case 2:                     // Token
                    System.out.println("\n\n              ATENÇÃO:");
                    System.out.println("O ACESSO POR TOKEN AINDA NÃO DISPONIVEL...");
                    Thread.sleep(6000);
                    break;
            
                default:                    // Contato
                    System.out.println("Em manutenção....");
                    Thread.sleep(3500);
            }



            if (confirmacao1 == false)
            {    
                getUserString.close();
            }

            if (token)
            {
                if (logado == 1)
                    System.out.println("\nLOGADO COM SUCESSO!");

                System.out.println("\n       O que você deseja fazer?");
                System.out.println("0: Sacar | 1: Depositar | 2: Transferir");

                entrada = getUserString.next();
                int choice = Integer.parseInt(entrada);

                if (choice == 0)
                {
                    System.out.println(entrar.catchSaldo(usuario));
                    entrada = getUserString.next();
                }
                else if (choice == 1){
                    System.out.println("Qual valor voçê deseja Depositar?");
                    entrada = getUserString.next();
                    double valor = Double.parseDouble(entrada);

                    if (token)
                        entrar.depositar(usuario, valor);
                }
                else{
                    
                }
            }
        }
    }
}