package Atividade;

public class Principal {

    public static void main(String[] args) {
        
        // Instanciando conta corrente com meu nome e 50 centavos de limite
        ContaCorrente conta = new ContaCorrente(11355, 10232559, "Maycon R. Campos", "03321112356", 0.50);
        conta.sacar();
        conta.depositar();
        conta.depositar();
        
        // Instanciando Conta poupança com cliente minha esposa
        ContaPoupanca contaPoupanca = new ContaPoupanca(1211, 154, "Ariana C. Dionel", "02211144455");
        contaPoupanca.sacar();
        contaPoupanca.depositar();
        contaPoupanca.depositar();
        
    }
    
}
