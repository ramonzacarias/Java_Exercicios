package ifs.POO.SlideInterfaces;

public class Cubo extends Poliedro{

    public Cubo(int qtdVertice, int qtdAresta, int qtdeFace, double lado1, double lado2, double altura) {
        super(qtdVertice, qtdAresta, qtdeFace, lado1, lado2, altura);
    }

    public void Cubo(){
        calculaArea();
        calculaVolume();
    }

    @Override
    public double calculaArea() {
        return 6*Math.pow(getLado1(),2);
    }

    @Override
    public double calculaVolume() {
        return Math.pow(getAltura(),3);
    }

}
