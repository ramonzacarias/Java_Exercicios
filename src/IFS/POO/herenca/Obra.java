package IFS.POO.herenca;

public class Obra {

    protected String codigo;
    protected String dataAquisicao;
    protected String titulo;
    protected String dimensoes;
    protected String tecnica;
    protected Artista autor;

    public Obra(String codigo, String dataAquisicao, String titulo, String dimensoes, String tecnica) {
        this.codigo = codigo;
        this.dataAquisicao = dataAquisicao;
        this.titulo = titulo;
        this.dimensoes = dimensoes;
        this.tecnica = tecnica;
    }

    public Artista getAutor(Artista autor) {
        return autor;
    }

    public void setAutor(Artista autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void imprimir(){

        System.out.println("\nInformações sobre a obra:");
        System.out.println("=========================");
        System.out.println("\nCodigo: "+getCodigo()+
                "\nData de Aquisição: "+getDataAquisicao()+
                "\nTitulo: "+getTitulo()+
                "\nDimensões: "+getDimensoes()+
                "\nTecnica: "+getTecnica() +
                "\nAutor: "+ getAutor(autor).getNome()
        );
    }

    public void imprimir(Artista a){

        System.out.println("\n#### Artistas e suas Obras ####");
        if (a != null){
            System.out.println("Artista: "+a.getNome());
            for (Obra obras : a.getObras()) {
                System.out.println("\ncodigo: " + obras.getCodigo() +
                        "\nData de aquisição: " + obras.getDataAquisicao()+
                        "\nTitulo: " + obras.getTitulo()
                );
            }
        }
    }
}
