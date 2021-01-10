package Lista.poo.Lista01;

import java.util.Date;

public class Ex004 {
    public static void main(String[] args) {
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();

        livroBiblioteca.titulo = "Os filhos de Húrin";
        livroBiblioteca.editora = "HarperCollins";
        livroBiblioteca.autor = "J.R.R.Tolkien";
        livroBiblioteca.quantPaginas = 288;
        livroBiblioteca.anoPublicacao = "17/02/2020";

        livroBiblioteca.emprestado = true;
        livroBiblioteca.dataEmprestimo = new Date();
        livroBiblioteca.emprest = "Ramon";

        System.out.println(livroBiblioteca.titulo);
        System.out.println(livroBiblioteca.autor);

        System.out.println(livroBiblioteca.dataEmprestimo);
        System.out.println(livroBiblioteca.emprest);
    }
}
