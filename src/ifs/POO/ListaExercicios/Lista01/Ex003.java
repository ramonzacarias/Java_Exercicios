package ifs.POO.ListaExercicios.Lista01;

public class Ex003 {
    public static void main(String[] args) {

        LivroDeLivraria livroDeLivraria = new LivroDeLivraria();

        livroDeLivraria.titulo = "Os filhos de Húrin";
        livroDeLivraria.editora = "HarperCollins";
        livroDeLivraria.autor = "J.R.R.Tolkien";
        livroDeLivraria.quantPaginas = 288;
        livroDeLivraria.anoPublicacao = "17/02/2020";
        livroDeLivraria.preco = 39.90F;

        System.out.println(livroDeLivraria.titulo);
        System.out.println(livroDeLivraria.editora);
        System.out.println(livroDeLivraria.autor);
        System.out.println(livroDeLivraria.anoPublicacao);
        System.out.println(livroDeLivraria.preco);
    }
}
