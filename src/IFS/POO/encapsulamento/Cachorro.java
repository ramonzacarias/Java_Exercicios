package IFS.POO.encapsulamento;

public class Cachorro {

    private String nome;
    private String raca;
    private char sexo;
    private String cor;
    private int idade;
    private double tamanho;
    private double peso;
    private int filhotes = 0;
    private Vacina[] vacinas = new Vacina[6];

    public Cachorro(String nome, String raca, char sexo, String cor){
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
    }

    public Cachorro(String nome, String raca, char sexo, String cor, double tamanho){
        this(nome,raca,sexo,cor);
        this.tamanho = tamanho;
    }

    //metodos getters e setteres.
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCor() {
        return cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getFilhotes() {
        return filhotes;
    }

    //metodos
    public void correr(){
        System.out.println("O cachorro começou a correr!");
    }

    public void latir(){
        System.out.println("O cachorro está latindo!");
    }

    public void cavar(){
        System.out.println("O cachorro começou a cavar!");
    }

    public void comer(double quantidade){
        peso += (quantidade*0.1);
    }

    public void crescer(double tamanho){
        this.tamanho = tamanho;
    }

    public void terFilhotes(int quantidade){
        if (getSexo() == 'f' || getSexo() == 'F'){
            filhotes += quantidade;
        }else{
            System.out.println("O cachorro não pode ter filhotes.");
        }
    }

    public void vacinar(Vacina v){
        for (int i = 0; i < vacinas.length; i++) {
            if(vacinas[i] == null){
                vacinas[i] = v;
                break;
            }
        }
    }

    public void imprimir(){
        System.out.println("\n### Dados do cachorro ###");
        System.out.println("Nome: "+ getNome() +"\nRaça: "+ getRaca() +"\nSexo: "+ getSexo() +
                "\nCor: "+ getCor() +"\nIdade: "+getIdade()+" anos"+"\nTamanho: "+getTamanho()+" cm"+
                "\nPeso: "+getPeso()+" Kg"+"\nFilhotes: "+getFilhotes()+"\nHistorico de vacinas: ");

        for (Vacina vacina : vacinas) {
            if (vacina != null) {
                System.out.println("Nome da vacina: " + vacina.getNome() +
                        "\nData de aplicação: " + vacina.getDataAplicacao());
            }
        }
        System.out.println();
    }
}
