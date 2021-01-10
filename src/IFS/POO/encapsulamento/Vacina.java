package IFS.POO.encapsulamento;

public class Vacina {

    public String nome;
    public int lote;
    public String dataVencimento;
    public String dataAplicacao;

    public Vacina(String nome, int lote, String dataVencimento){
        this.nome = nome;
        this.lote = lote;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    public int getLote() {
        return lote;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void aplicar(String dataAplicacao){
        this.dataAplicacao = dataAplicacao;
    }

    public void imprimir(){
        if (getDataAplicacao() == null){
            System.out.println("\nVacina disponível:");
            System.out.println("Nome: "+getNome()+"\nData de vencimento: "+getDataVencimento());
        }
    }
}
