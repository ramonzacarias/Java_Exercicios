package IFS.POO.interfaces;

public class Titulo extends Conta{
    private int pgDia;
    private int pgMes;

    public Titulo(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    public int getPgDia() {
        return pgDia;
    }

    public void setPgDia(int pgDia) {
        this.pgDia = pgDia;
    }

    public int getPgMes() {
        return pgMes;
    }

    public void setPgMes(int pgMes) {
        this.pgMes = pgMes;
    }

    @Override
    public double getValorAPagar() {

        //Verificar se a fatura foi pagar depois da data de vencimento
        double totalAPagar;
        if (getPgDia() > getDia() || getPgMes() >= getMes()){
            totalAPagar = (getValor()*0.10)+getValor(); //acrescenta mais 10% a pagamentos vencidos
        }else {
            totalAPagar = getValor();
        }
        return totalAPagar;
    }

    public String toString(){
        return String.format("### Conta titulo ### \nTotal a pagar: R$ %.2f\n",getValorAPagar());
    }
}
