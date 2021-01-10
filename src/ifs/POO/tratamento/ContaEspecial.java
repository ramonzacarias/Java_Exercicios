package ifs.POO.tratamento;

public class ContaEspecial extends Conta{
    private double limite;
    private double juros;

    public ContaEspecial(String agencia, int numConta, double saldo, String senha, double limite, double juros) {
        super(agencia, numConta, saldo, senha);
        this.limite = limite;
        this.juros = juros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void debitarJuros(){
        double debito = getSaldo() - juros;
        setSaldo(debito);
    }
}
