package Atividade;

import java.text.NumberFormat;
import java.util.Locale;

public class ContaCorrente extends Conta {
    private Double limite;
    private String cpf;

    public ContaCorrente(Integer numero, Integer agencia, String cliente, String cpf, Double limite){
        Cliente client = new Cliente(cliente, cpf);

        if(numero > 0 && agencia > 0){
            this.numero = numero;
            this.agencia = agencia;
            this.cliente = client.getNome();
            this.cpf = client.getCPF();
            this.saldo = 0.0;
            this.limite = limite;

            this.getConta();
        }else{
            System.out.println("ERRO! Números de AG e Número precisa ser Maior que 0");
        }
    }

    private String getSaldo(){
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        return valor.format(this.saldo);
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

    public void sacar() {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        Double sacando = this.saldo - 0.1;
        if(sacando >= -this.limite){
            this.saldo -= 0.1;
            System.out.println("Você sacou o valor de: "+ valor.format(0.1));
            this.getConta();
        }else{
            System.out.println("Saldo insuficiente.");
            System.out.println("Valor Saque: "+ valor.format(0.1));
            this.getConta();
        }
    }

    public void depositar() {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        this.saldo += 0.1;
        System.out.println("Você depositou: "+  valor.format(0.1));
        this.getConta();
    }
    
}
