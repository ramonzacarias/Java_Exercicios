package IFS.POO.ListaExercicios.escola;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private String formacaoAcademica;
    private double salario;

    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;


    public Professor(){
        disciplinas = new ArrayList<Disciplina>();
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public int quantidadeDisciplinas(){
        return disciplinas.size();
    }

    public Disciplina getDisciplinas(int posicao){
        return disciplinas.get(posicao);
    }

    public void aplicarAvaliacao(){

    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
