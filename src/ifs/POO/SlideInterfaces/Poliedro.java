package ifs.POO.SlideInterfaces;

public abstract class Poliedro implements iFormaGeometrica{

    private int qtdVertice;
    private int qtdAresta;
    private int qtdeFace;
    private double lado1;
    private double lado2;
    private double altura;

    public Poliedro(int qtdVertice, int qtdAresta, int qtdeFace, double lado1, double lado2, double altura) {
        this.qtdVertice = qtdVertice;
        this.qtdAresta = qtdAresta;
        this.qtdeFace = qtdeFace;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public int getQtdVertice() {
        return qtdVertice;
    }

    public void setQtdVertice(int qtdVertice) {
        this.qtdVertice = qtdVertice;
    }

    public int getQtdAresta() {
        return qtdAresta;
    }

    public void setQtdAresta(int qtdAresta) {
        this.qtdAresta = qtdAresta;
    }

    public int getQtdeFace() {
        return qtdeFace;
    }

    public void setQtdeFace(int qtdeFace) {
        this.qtdeFace = qtdeFace;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean ehConvexo(){
        if(qtdVertice - qtdAresta + qtdeFace != 2){
            return false;
        }
        return true;
    }

    //Impressão
    public String toString(){
        String convexo;
        if (ehConvexo()){
            convexo = "O poliedro é convexo";
        }else {
            convexo = "O poliedro não convexo";
        }

        return "Area: "+calculaArea()+"\nVolume: "+calculaVolume()+"\nConvexo: "+convexo;
    }

}
