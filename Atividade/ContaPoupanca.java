package Atividade;

import java.text.NumberFormat;
import java.util.Locale;

public class ContaPoupanca extends Conta {
    private String cpf;
    

    public ContaPoupanca(Integer numero, Integer agencia, String cliente, String cpf){
        Cliente client = new Cliente(cliente, cpf);

        if(numero > 0 && agencia > 0){
            this.numero = numero;
            this.agencia = agencia;
            this.cliente = client.getNome();
            this.cpf = client.getCPF();
            this.saldo = 0.0;

            this.getConta();
        }else{
            System.out.println("ERRO! Número de AG e Número precisa ser Maior que 0.");
        }
    }

    private String getSaldo(){
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);
    
        return valor.format(this.saldo);
    }

    public void getConta() {

        System.out.println("-------- Conta Poupança ------");
        System.out.println("Número          : "+this.numero);
        System.out.println("Agência         : "+this.agencia);
        System.out.println("Cliente         : "+this.cliente);
        System.out.println("CPF             : "+this.cpf);
        System.out.println("---------------------------------------");
        System.out.println("Saldo           : "+this.getSaldo());
        System.out.println("\n");
    }

    public void sacar(Double saque) {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        Double sacando = this.saldo - saque;
        if(sacando >= 0){
            this.saldo -= saque;
            System.out.println("----------------------------");
            System.out.println("Você sacou o valor de: "+valor.format(saque));
            System.out.println("----------------------------");
            this.getConta();
        }else{
            System.out.println("----------------------------");
            System.out.println("Saldo insuficiente. Saque não efetuado.");
            System.out.println("Valor Saque: "+valor.format(saque));
            System.out.println("----------------------------");
            this.getConta();
        }
    }

    public void depositar(Double deposito) {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        this.saldo += deposito;
        System.out.println("Você depositou: "+ valor.format(deposito));
        this.getConta();
    }
}
