package oo.composicao;

// import java.util.ArrayList;
import java.util.HashSet;
// import java.util.List;
import java.util.Set;

public class Curso
{
    final String nome;
    // final List<Aluno> alunos = new ArrayList<>();
    Set<Aluno> alunos = new HashSet<>();

    Curso(String nome)
    {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno)
    {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

}