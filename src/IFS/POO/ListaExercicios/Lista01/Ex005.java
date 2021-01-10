package IFS.POO.ListaExercicios.Lista01;

public class Ex005 {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numeroConta = "123456789";
        contaCorrente.saldo = 300;
        contaCorrente.limite = 500;
        contaCorrente.statusEspecial = true;

        System.out.println("Saldo da conta "+contaCorrente.numeroConta+" = "+contaCorrente.saldo);
    }
}
