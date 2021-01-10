package ifs.POO.ListaExercicios.Lista01;

public class Ex002 {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "Os filhos de Húrin";
        livro.editora = "HarperCollins";
        livro.autor = "J.R.R.Tolkien";
        livro.quantPaginas = 288;
        livro.anoPublicacao = "17/02/2020";

        System.out.println(livro.titulo);
        System.out.println(livro.editora);
        System.out.println(livro.autor);
        System.out.println(livro.anoPublicacao);
    }
}
