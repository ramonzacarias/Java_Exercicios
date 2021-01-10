package ifs.POO.interfaces;

public class SistemaPagamentoTeste{

    public static void main(String []args) {

        //Funcionario Assalariado
        Assalariado funcioAssalariado = new Assalariado("Joana","d´Arc",1431);

        //Set das horas que o funcionario teve na semana. Considerando um mês de 4 semanas.
        funcioAssalariado.setHorasSemanais(40);
        funcioAssalariado.setHorasSemanais(42);
        funcioAssalariado.setHorasSemanais(43);
        funcioAssalariado.setHorasSemanais(40);
        System.out.println(funcioAssalariado);

        Terceirizado funcioTerceirizado = new Terceirizado("Marco","Aurélio",121,180);
        System.out.println(funcioTerceirizado);

        //Funcionario Comissionado
        Comissionado funcioComissionado = new Comissionado("Carlos","Magno",814,22792);
        System.out.println(funcioComissionado);

        //Funcionario Assalariado Comissionado
        AssalariadoComissionado funcioAssalariadoComis = new AssalariadoComissionado("Alfredo","de Wessex",849,899);
        System.out.println(funcioAssalariadoComis);

        //Contas Titulos
        Titulo contaTitulo = new Titulo(5,5,512); //Dia e mês de vencimento e o valor da fatura
        contaTitulo.setPgDia(6); //Dia pagamento
        contaTitulo.setPgMes(5); //Mês pagamento
        System.out.println(contaTitulo);

        //Conta Concessionaria
        Concessionaria contaConcess = new Concessionaria(3,5,612); //Dia e mês de vencimento e o valor da fatura
        System.out.println(contaConcess);

        //Instanciando controlePagamento
        ControlePagamento controlePagamento = new ControlePagamento();

        //Set para o ArrayList(de empregados e contas)
        controlePagamento.setEmpregadosPagaveis(funcioAssalariado,funcioAssalariadoComis,funcioTerceirizado,funcioComissionado);
        controlePagamento.setContasPagaveis(contaTitulo,contaConcess);

        controlePagamento.exibirRelatorio();

    }
}
