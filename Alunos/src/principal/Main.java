/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import composite.Aluno;
import composite.CompositeDemo;
import composite.Turma;

/**
 *
 * @author 781410239
 */
public class Main {
    
    public static void main(String[] args)  {
        
        Aluno a = new Aluno("Yuri", 30);
        Aluno a2 = new Aluno("Angelo", 32);
        Aluno a3 = new Aluno("Leandro", 33);
        Aluno a4 = new Aluno("Alessandro", 34);
        Aluno a5 = new Aluno("Gladmir", 35);
        Aluno a6 = new Aluno("Otavio", 36);
        Aluno p = new Aluno("Patrick (PARABÉNS)", 20);
        Turma novaTurma = new CompositeDemo("2016");
           novaTurma.adcionaAluno(a6);
          novaTurma.adcionaAluno(a2);
           novaTurma.adcionaAluno(a3);
           novaTurma.adcionaAluno(a4);
           novaTurma.adcionaAluno(a5);
           novaTurma.adcionaAluno(a6);
           novaTurma.adcionaAluno(p);
           
           System.out.println("Alunos " + novaTurma.getIdTurma());
           for (Aluno aluno: novaTurma.getListaAluno()){
               System.out.println("Nome: "+aluno.getNome() + ", Matricula: " + aluno.getMatricula()); 
           } 

    }
}
