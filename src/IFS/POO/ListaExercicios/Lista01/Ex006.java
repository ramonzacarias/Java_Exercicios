package IFS.POO.ListaExercicios.Lista01;

public class Ex006 {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.nome = "Ramon";
        contato.endereço = "Trav. Do Forúm";
        contato.email = "ramonsantana484@gmai.com";
        contato.numero = "(79)  9 9678-8296";


        System.out.println(contato.nome);
        System.out.println(contato.numero);
    }
}
