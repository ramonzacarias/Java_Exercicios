package IFS.POO.ListaExercicios.escolapoo;

import IFS.POO.ListaExercicios.escola.Turma;
import IFS.POO.ListaExercicios.escola.Aluno;

import java.util.Date;

public class AssociacaoParaUm {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSigla("1A");
        turma1.setAno(1);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Thiago");
        aluno1.setDataNascimento(new Date());
        aluno1.setMatricula(123);
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Carlos");
        aluno2.setDataNascimento(new Date());
        aluno2.setMatricula(321);
        aluno2.setTurma(turma1);
        turma1.adicionarAluno(aluno2);

        System.out.println("Alunos:");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getTurma().getSigla());

        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getTurma().getSigla());

        System.out.println("Alunos da turma:");
        for (int i = 0; i < turma1.quantidadeAlunos(); i++) {
            System.out.println(turma1.getAluno(i).getNome());
        }
    }
}
