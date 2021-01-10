package ifs.exercicios.poo.herenca;

public class Museu {
    public static void main(String[] args) {
        //Artistas e impressao individual de suas informações

        Artista artista1 = new Artista("123456","Carlos Santos","Brasileira");
        artista1.imprimir();

        Artista artista2 = new Artista("9368","Juan Leal","Francês");
        artista2.imprimir();

        //Obras e impressão individual de sua informações

        Obra obra1 = new Obra("3265","05/11/2019", "Orientação a Objeto","23*23","A óleo");
        obra1.setAutor(artista1);
        artista1.setObras(obra1);
        obra1.imprimir();

        Obra obra2 = new Escultura("987","15/11/2018","Java", "30*30","Entalhe","Madeira");
        obra2.setAutor(artista1);
        artista1.setObras(obra2);
        obra2.imprimir();

        Obra obra3 = new Pintura ("45","12/03/2020","Leões", "20*20","Aquarela","Aquarela liquida");
        obra3.setAutor(artista2);
        artista2.setObras(obra3);
        obra3.imprimir();

        //Impressão de um artista e suas obras
        obra2.imprimir(artista1);
        obra3.imprimir(artista2);

    }
}
