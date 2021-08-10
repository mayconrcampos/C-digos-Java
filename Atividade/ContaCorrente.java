package Atividade;

public class ContaCorrente extends Conta {
    private Double limite;

    public ContaCorrente(Integer numero, Integer agencia, String cliente, Double limite){
        if(numero > 0 && agencia > 0){
            this.numero = numero;
            this.agencia = agencia;
            this.cliente = cliente;
            this.saldo = 0.0;
            this.limite = limite;
        }else{
            System.out.println("ERRO! Números de AG e Número precisa ser Maior que 0");
        }
    }

    private double getSaldo(){
        return this.saldo;
    }

    private void getConta() {
        System.out.println("-------- Conta Corrente -------");
        System.out.println("Número          : "+this.numero);
        System.out.println("Agência         : "+this.agencia);
        System.out.println("Cliente         : "+this.cliente);
        System.out.println("---------------------------------------");
        System.out.println("Saldo  (R$)     : "+this.getSaldo());
        System.out.println("Limite (R$)     : "+this.limite);
        System.out.println("\n\n\n");

    }

    public void sacar() {
        Double sacando = this.saldo - 0.1;
        if(sacando >= -this.limite){
            this.saldo -= 0.1;
            System.out.println("Você sacou o valor de (R$): "+0.1);
            this.getConta();
        }else{
            System.out.println("Saldo insuficiente.");
            System.out.println("Valor Saque (R$): "+0.1);
            this.getConta();
        }
    }

    public void depositar() {
        this.saldo += 0.1;
        System.out.println("Você depositou (R$): "+  0.1);
        this.getConta();
    }
    
}
