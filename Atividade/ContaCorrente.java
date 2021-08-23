package Atividade;

import java.text.NumberFormat;
import java.util.Locale;

public class ContaCorrente extends Conta {
    private Double limite;
    private String cpf;

    public ContaCorrente(Integer numero, Integer agencia, String cliente, String cpf, Double limite){
        if(numero > 0 && agencia > 0){
            Cliente client = new Cliente(cliente, cpf);
            this.numero = numero;
            this.agencia = agencia;
            this.cliente = client.getNome();
            this.cpf = client.getCPF();
            this.saldo = 0.0;
            this.limite = limite;

            System.out.println("Conta Corrente Criada com Saldo inicial "+this.getSaldo() +"\n");

            this.getConta();
        }else{
            System.out.println("ERRO! Números de AG e Número precisam ser Maiores que 0");
        }
    }

    private Double getSaldo(){
        return this.saldo;
    }

    private String getLimite(){
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        return valor.format(this.limite);
    }

    private void getConta() {
        System.out.println("-------- Conta Corrente -------");
        System.out.println("Número          : "+this.numero);
        System.out.println("Agência         : "+this.agencia);
        System.out.println("Cliente         : "+this.cliente);
        System.out.println("CPF             : "+this.cpf);
        System.out.println("---------------------------------------");
        System.out.println("Saldo           : "+this.getSaldo());
        System.out.println("Limite          : -"+this.getLimite());
        System.out.println("\n");
    }

    public void sacar(Double saque) {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        Double taxa = 0.1;
        Double sacando = (this.saldo - saque) - taxa;
        if(sacando >= -this.limite){
            this.saldo -= saque + taxa;
            System.out.println("----------------------------");
            System.out.println("Você sacou o valor de: "+ valor.format(saque));
            System.out.println("Taxa de Saque: R$(0,10)");
            System.out.println("----------------------------");
            this.getConta();
        }else{
            
            System.out.println("----------------------------");
            System.out.println("Valor Saque: "+ valor.format(saque));
            System.out.println("Taxa de Saque: R$(0,10)");
            System.out.println("----------------------------");
            System.out.println("Saldo insuficiente. Saque não efetuado.");
            this.getConta();
        }
    }

    public void depositar(Double deposito) {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        this.saldo += deposito;
        System.out.println("Você depositou: "+  valor.format(deposito));
        this.getConta();
    }
}

