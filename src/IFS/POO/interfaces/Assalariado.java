package IFS.POO.interfaces;

import java.util.ArrayList;

public class Assalariado extends Empregado{
    protected ArrayList<Integer> horasSemanais = new ArrayList<Integer>();

    public Assalariado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    public void setHorasSemanais(Integer horasSemanais) {
        this.horasSemanais.add(horasSemanais);
    }

    @Override
    public double getValorAPagar() {
        //Percorre o array para descobrir a quantidade de horas extras em cada semana,
        // armazemar em um somador que, depois é multiplicado pelo valor da hora extra;
        int horasExtras = 0;
        for (int i = 0; i < horasSemanais.size(); i++){
            if (horasSemanais.get(i) > 40){
                horasExtras += horasSemanais.get(i) - 40;
            }
        }
        return (horasExtras * ControlePagamento.HORA)+ControlePagamento.SALARIO; //Retorna o valor total a receber(Salario base + horas extras semanais)
    }

    public String toString(){
        return String.format("### Assalariado ###\n"+super.toString()+
                "\nSalário a receber: R$ %.2f\n",getValorAPagar());
    }
}
