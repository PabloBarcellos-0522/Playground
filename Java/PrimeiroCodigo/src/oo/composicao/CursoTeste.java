package oo.composicao;

public class CursoTeste
{
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno("joão");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web Completo");
        Curso curso3 = new Curso("React Completo");

        aluno1.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso1);
        curso1.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno3);

        System.out.println(curso1.alunos);
        System.out.println(curso2.alunos);
        System.out.println(curso3.alunos);
    }
}