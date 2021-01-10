package IFS.POO.SlideInterfaces;

public class mainGeometria {
    public static void main(String[] args) {

        Poliedro cubo1 = new Cubo(8,12,6,3,3,3);

        System.out.println("### CUBO ###");
        System.out.println(cubo1+"\n");


        Poliedro pr = new ParalelepipedoRetangulo(8,12,6,6,2,3);

        System.out.println("### Paralelepidedo Retangulo ###");
        System.out.println(pr+"\n");


        Cilindro cilindro = new Cilindro(2,6);

        System.out.println("### Cilindro ###");
        System.out.println(cilindro);
    }
}
