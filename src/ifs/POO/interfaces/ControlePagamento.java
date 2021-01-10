package ifs.POO.interfaces;

import java.util.ArrayList;
import java.util.Calendar;

public class ControlePagamento {
    public static final double SALARIO = 954.00;
    public static final double HORA = 8.00;

    //ArrayList para armazenas e obter resultados dos valores
    public ArrayList<Pagavel> contasPagaveis = new ArrayList<Pagavel>();
    public ArrayList<Pagavel> empregadosPagaveis = new ArrayList<Pagavel>();

    public void setContasPagaveis(Titulo titulo, Concessionaria concessionaria) {
        this.contasPagaveis.add(titulo);
        this.contasPagaveis.add(concessionaria);
    }

    public void setEmpregadosPagaveis(Assalariado assalariado, AssalariadoComissionado assalariadoComissionado, Terceirizado terceirizado, Comissionado comissionado) {
        this.empregadosPagaveis.add(assalariado);
        this.empregadosPagaveis.add(assalariadoComissionado);
        this.empregadosPagaveis.add(terceirizado);
        this.empregadosPagaveis.add(comissionado);
    }

    Calendar c = Calendar.getInstance();

    public void exibirRelatorio() {
        double somaContas = 0;
        double somaEmpregados = 0;

        //Percorre o ArrayList contasPagaveis e soma seus valores
        for (Pagavel cp : contasPagaveis) {
            if (cp != null) {
                somaContas += cp.getValorAPagar();
            }
        }

        //Percorre o ArrayList empregadosPagaveis e soma seus valores
        for (Pagavel ep : empregadosPagaveis) {
            if (ep != null) {
                somaEmpregados += ep.getValorAPagar();
            }
        }

        c.add(Calendar.MONTH,1);
        System.out.println("### Relatorio Mensal ###");
        System.out.println("Dia "+c.get(Calendar.DAY_OF_MONTH)+", Mês "+c.get(Calendar.MONTH)+", Ano "+c.get(Calendar.YEAR));

        //Exibe o relatorio mensal. O valor total de contas a pagar,
        // O valor total de pagamento aos empregados
        // O valor total da soma entre os dois, custo mensal total da empresa
        System.out.println("--------------------------------------");
        System.out.printf("\nContas a pagar: R$ %.2f",somaContas);
        System.out.printf("\nEmpregados a pagar: R$ %.2f",somaEmpregados);
        System.out.printf("\nValor total mensal a pagar: R$ %.2f",somaContas+somaEmpregados);
        System.out.println("\n--------------------------------------");
    }
}

