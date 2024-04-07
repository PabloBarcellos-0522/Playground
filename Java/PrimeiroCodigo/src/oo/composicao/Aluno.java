package oo.composicao;

// import java.util.ArrayList;
import java.util.HashSet;
// import java.util.List;
import java.util.Set;

public class Aluno
{
    final String nome;
    // final List<Curso> cursos = new ArrayList<>();
    Set<Curso> cursos = new HashSet<>();

    Aluno(String nome)
    {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso)
    {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    @Override
    public String toString() {
        return nome;
    }
}