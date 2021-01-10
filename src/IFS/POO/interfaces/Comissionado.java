package IFS.POO.interfaces;

public class Comissionado extends Empregado{
    protected double totalVendas; //valor total de vendas realizadas pelo comissionado

    public Comissionado(String nome, String sobrenome, int numIdent, int totalVendas) {
        super(nome, sobrenome, numIdent);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    @Override
    public double getValorAPagar() {
        // Valor a receber, 6% sobre as vendas efetuadas pelo empregado
        return  getTotalVendas()*0.06;
    }

    public String toString(){
        return String.format("### Comissionado ###\n"+super.toString()+
                "\nSalário a Receber: R$ %.2f\n",getValorAPagar());
    }
}
