package ifs.POO.ListaExercicios.escola;

import java.util.Date;

public class Aluno extends Pessoa{

    private Date dataNascimento;
    private Turma turma;

    public void realizarAvaliacao(){

    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
