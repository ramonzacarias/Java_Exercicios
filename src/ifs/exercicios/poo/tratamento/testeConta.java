package ifs.exercicios.poo.tratamento;

public class testeConta {
    public static void main(String[] args) throws SaldoExcecao{

        ContaPoupanca con1 = new ContaPoupanca("123",369,500,"789456");
        con1.depositar(50);
        System.out.println("Conta poupança:");
        System.out.println("Saldo: "+con1.getSaldo());
        con1.sacar(25);
        System.out.println("Saldo: "+con1.getSaldo());

        ContaEspecial con2 = new ContaEspecial("465",321,600,"123456",800,3);
        System.out.println("\nConta Especial:");
        con2.depositar(100);
        System.out.println("Saldo: "+con2.getSaldo());
        con2.sacar(80);
        System.out.println("Saldo "+con2.getSaldo());
        con2.debitarJuros();
        System.out.println("Saldo: "+con2.getSaldo());
    }
}
