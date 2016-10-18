/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import composite.Aluno;
import composite.Turma;
import java.util.ArrayList;

/**
 *
 * @author 781410239
 */
public class CompositeDemo extends Turma {
    public CompositeDemo(String id) {
        super(id);
    }
    @Override
    public void adcionaAluno(Aluno alunoNovo) {
        listaAlunos.add(alunoNovo);
    }

    @Override
    public void removeAluno(Aluno alunoRemovido) {
        listaAlunos.remove(alunoRemovido);
    }

    @Override
    public ArrayList<Aluno> getListaAluno() {
        return listaAlunos;
    }

    @Override
    public String getIdTurma() {
        return idTurma;
    }

}
