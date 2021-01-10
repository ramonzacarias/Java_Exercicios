package IFS.POO.herenca;

import java.util.ArrayList;

public class Artista {

    private String registro;
    private String nome;
    private String nacionalidade;
    private ArrayList<Obra> obras;

    public Artista(String registro, String nome, String nacionalidade) {
        this.registro = registro;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        obras = new ArrayList<>();
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(Obra obras) {
        this.obras.add(obras);
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void imprimir(){
        System.out.println("\nDados do Artista:");
        System.out.println("=================");
        System.out.println("\nRegistro: "+getRegistro()+
                "\nNome: "+getNome()+
                "\nNacionalidade: "+getNacionalidade()
        );
    }
}
