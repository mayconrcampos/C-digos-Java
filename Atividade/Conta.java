package Atividade;

public abstract class Conta {
    Integer numero;
    Integer agencia;
    String cliente;
    Double saldo;

    public abstract void sacar(Double saque);
    public abstract void depositar(Double deposito);
}


