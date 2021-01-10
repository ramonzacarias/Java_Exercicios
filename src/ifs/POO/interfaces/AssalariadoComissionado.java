package ifs.POO.interfaces;

public class AssalariadoComissionado extends Comissionado{

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, int vendas) {
        super(nome, sobrenome, numIdent, vendas);
    }

    @Override
    public double getValorAPagar() {
        //Receber salario base + 6% do valor das vendas + 10% do salario base(Recompensa)
        return super.getValorAPagar()+ControlePagamento.SALARIO+(ControlePagamento.SALARIO*0.10);
    }

    public String toString(){
        return String.format(super.toString().replace("### Comissionado ###",
                "### Assalariado Comissionado ###")
                +"Comissão sobre as vendas: R$ %.2f \nBonificação de 10%%: R$ %.2f\n",954+
                super.getValorAPagar(), ControlePagamento.SALARIO*0.10);
    }
}
