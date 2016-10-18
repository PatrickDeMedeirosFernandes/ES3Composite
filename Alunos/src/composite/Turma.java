package composite;

import java.util.ArrayList;

public abstract class Turma {

    public String idTurma;
    public ArrayList<Aluno> listaAlunos;

    public Turma(String id) {
        idTurma = id;
        listaAlunos = new ArrayList<>();
    }

    public void adcionaAluno(Aluno alunoNovo) {

    }

    public void removeAluno(Aluno alunoRemovido)  {

    }

    public ArrayList<Aluno> getListaAluno()  {
        return null;
    }

    public String getIdTurma()  {
        return null;

    }
}
