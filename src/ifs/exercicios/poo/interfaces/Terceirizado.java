package ifs.exercicios.poo.interfaces;

public class Terceirizado extends Empregado{
    protected int horasTrabalhadas;

    public Terceirizado(String nome, String sobrenome, int numIdent, int horasTrabalhadas) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double getValorAPagar() {
        //Considerando que as horas semanais sejam 40h (total de 4 semanas). 40h * 4 = 160h de trabalhado mensal
        return getHorasTrabalhadas()*(ControlePagamento.SALARIO/160) ;
    }

    @Override
    public String toString() {
        return String.format("### Terceirizado ###\n"+super.toString()+
                "\nSalário a receber: R$ %.2f\n",getValorAPagar());
    }
}
