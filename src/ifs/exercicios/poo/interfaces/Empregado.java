package ifs.exercicios.poo.interfaces;

public abstract class Empregado implements Pagavel{

    protected String nome;
    protected String sobrenome;
    protected int numIdent;

    public Empregado(String nome, String sobrenome, int numIdent) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdent = numIdent;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getNumIdent() {
        return numIdent;
    }

    public String toString(){
        return "Nome: "+getNome()+"\nSobrenome: "+getSobrenome()+"\nNúmero de identificação: "+getNumIdent();
    }
}
