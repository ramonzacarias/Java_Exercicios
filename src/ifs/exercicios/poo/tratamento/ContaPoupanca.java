package ifs.exercicios.poo.tratamento;

public class ContaPoupanca extends Conta{
    private double percRendimento;

    public ContaPoupanca(String agencia, int numConta, double saldo, String senha) {
        super(agencia, numConta, saldo, senha);
    }

    public double getPercRendimento() {
        return percRendimento;
    }

    public void setPercRendimento(double percRendimento) {
        this.percRendimento = percRendimento;
    }

    public void calcularRendimento(){
        double taxa = getSaldo() * percRendimento;
        double total = taxa + getSaldo();
        setSaldo(total);
    }

}
