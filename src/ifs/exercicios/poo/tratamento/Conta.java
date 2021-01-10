package ifs.exercicios.poo.tratamento;

import java.util.Scanner;

public class Conta implements Autenticavel{
    Scanner sc = new Scanner(System.in);

    protected String agencia;
    protected int numConta;
    protected double saldo;
    protected String senha;

    public Conta(String agencia, int numConta, double saldo, String senha) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.senha = senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void depositar(double valor) {
        if (valor < 0 ){
            throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
        }else{
            setSaldo(getSaldo()+valor);
        }
    }

    public void sacar(double valor) throws SaldoExcecao{

        System.out.print("Digite sua senha: ");
        String senha = sc.next();
        if (this.autenticar(senha)){
            if (this.getSaldo() < saldo){
                throw new SaldoExcecao("Saldo insuficiente");
            }else{
                setSaldo(getSaldo()-valor);
            }
        }else{
            System.out.println("Não foi possivel realizar o saque!");
        }
    }

    @Override
    public boolean autenticar(String senha) {
        if (this.getSenha().equals(senha)){
            System.out.println("Sucesso!");
            return true;
        }else{
            System.out.println("Senha inválida!");
            return false;
        }
    }
}
