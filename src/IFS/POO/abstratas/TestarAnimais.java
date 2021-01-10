package IFS.POO.abstratas;

public class TestarAnimais {
    public static void main(String[] args) {

        Mamifero camelo = new Mamifero("Camelo",150,4,"Amarelo","Terra",(float)2.0,"Vegetal");
        camelo.imprimir();

        Peixe tubarao = new Peixe("Tubarão",300,0,"Cinzento","Mar",(float)1.5,"Barbatanas e cauda");
        tubarao.imprimir();

        Mamifero urso = new Mamifero("Urso-do-canadá",180,4,"Vermelho","Terra",(float)0.5,"Mel");
        urso.imprimir();
    }
}
