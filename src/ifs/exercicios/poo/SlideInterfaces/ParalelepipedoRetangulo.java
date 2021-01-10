package ifs.exercicios.poo.SlideInterfaces;

public class ParalelepipedoRetangulo extends Poliedro{


    public ParalelepipedoRetangulo(int qtdVertice, int qtdAresta, int qtdeFace, double lado1, double lado2, double altura) {
        super(qtdVertice, qtdAresta, qtdeFace, lado1, lado2, altura);
    }

    public void ParalelepipedoRetangulo(){
        calculaArea();
        calculaVolume();
    }

    @Override
    public double calculaArea() {
        return 2*(getLado1()*getLado2()+getLado1()*getAltura()+getLado2()*getAltura());
    }

    @Override
    public double calculaVolume() {
        return getLado1()*getLado2()*getAltura();
    }
}
