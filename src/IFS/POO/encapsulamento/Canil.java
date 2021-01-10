package IFS.POO.encapsulamento;

public class Canil {
    public static void main(String[] args) {

        Vacina v1 = new Vacina("v8",123,"10/12/2020");

        Vacina v2 = new Vacina("v10",456,"15/12/2020");

        Vacina v3 = new Vacina("Anti-rábica",569,"22/12/2020");

        Cachorro dog1 = new Cachorro("Ice club","São-bernardo",'m',"Vermelho e Branco");
        dog1.setIdade(6);
        dog1.setPeso(69);
        dog1.setTamanho(73);

        dog1.comer(2);
        dog1.crescer(75);
        dog1.vacinar(v1);
        v1.aplicar("08/12/2020");

        dog1.imprimir();

        dog1.latir();
        dog1.cavar();
        dog1.correr();

        Cachorro dog2 = new Cachorro("Ravena","Pinscher",'f',"Marrom-avermelhado",25);
        dog2.setIdade(9);
        dog2.setPeso(4);
        dog2.terFilhotes(2);
        dog2.comer(5);

        dog2.vacinar(v2);
        v2.aplicar("09/10/2020");

        dog2.imprimir();
        dog2.latir();
        dog2.cavar();
        dog2.correr();

        v3.imprimir();
    }
}
