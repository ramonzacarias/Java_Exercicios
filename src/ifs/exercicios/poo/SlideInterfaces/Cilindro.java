package ifs.exercicios.poo.SlideInterfaces;

public class Cilindro implements iFormaGeometrica{

    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Cilindro(){
        calculaArea();
        calculaVolume();
    }

    @Override
    public double calculaArea() {
        return 2*3.14*raio*(altura+raio);
    }

    @Override
    public double calculaVolume() {
        return 3.14*Math.pow(raio,2)*altura;
    }

    public String toString(){
        return "Area: "+calculaArea()+"\nVolume: "+calculaVolume();
    }
}
