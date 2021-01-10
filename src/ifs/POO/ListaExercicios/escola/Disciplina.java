package ifs.POO.ListaExercicios.escola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    private ArrayList<Turma> turmas;
    private ArrayList<Professor> professores;

    public Disciplina(){
        professores = new ArrayList<Professor>();
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    public void removerProfessor(Professor professor){
        professores.remove(professor);
    }

    public int quantidadeProfessores(){
        return professores.size();
    }

    public Professor getProfessor(int posicao){
        return professores.get(posicao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
