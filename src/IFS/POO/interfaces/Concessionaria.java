package IFS.POO.interfaces;

public class Concessionaria extends Conta{

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar() {
        return this.valor;
    }

    public String toString(){
        return String.format("### Conta concessionaria ### \nTotal a pagar: R$ %.2f\n",getValorAPagar());
    }
}
