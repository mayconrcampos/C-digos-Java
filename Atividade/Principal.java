package Atividade;

public class Principal {

    public static void main(String[] args) {
        
        // Instanciando Cliente Maycon
        Cliente maycon = new Cliente("Maycon R. Campos", "12345678997");
        
        System.out.println("Nome : "+maycon.getNome());
        System.out.println("CPF  : "+maycon.getCPF());

        // Instanciando Conta Corrente com Saldo 0 e Limite de 0,50 centavos.
        ContaCorrente conta = new ContaCorrente(11355, 10232559, maycon.getNome(), 0.50);
        conta.sacar();
        conta.depositar();
        conta.depositar();
        
        // Instanciando cliente minha esposa
        Cliente Ariana = new Cliente("Ariana D. Campos", "33222144565");
        ContaPoupanca contaPoupanca = new ContaPoupanca(1211, 154, Ariana.getNome());
        contaPoupanca.sacar();
        contaPoupanca.depositar();
        contaPoupanca.depositar();
        
    }
    
}
