package IFS.POO.herenca;

public class Pintura extends Obra{

    private String tipoTinta;

    public Pintura(String codigo, String dataAquisicao, String titulo, String dimensoes, String tecnica, String tipoTinta) {
        super(codigo, dataAquisicao, titulo, dimensoes, tecnica);
        this.tipoTinta = tipoTinta;
    }

    public String getTipoTinta() {
        return tipoTinta;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de tinta: "+getTipoTinta());
    }
}
