package fundamentos.Operadores;

public class Ternario
{
    public static void main(String[] args)
    {
        double media = 7.6;
        String recoveryResult = media >= 5.0 & true & true? "Em recuperação" : "Reprovado";
        String result = media >= 7.0? "Aprovado" : recoveryResult;
        System.out.println("o aluno está: " + result);
        boolean Resultado = result.equals("Aprovado") ? true: false;

        double nota = 9.0;
        boolean goodBehavior = true;
        boolean notaDeCorte = nota >= 7.5;
        String temDesconto = goodBehavior & notaDeCorte & Resultado ? "Sim." : "Não.";
        System.out.println("o aluno tem desconto? " + temDesconto);
    }    
}
