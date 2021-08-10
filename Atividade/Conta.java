package Atividade;

public abstract class Conta {
    Integer numero;
    Integer agencia;
    String cliente;
    Double saldo;

    public abstract void sacar();
    public abstract void depositar();
}


