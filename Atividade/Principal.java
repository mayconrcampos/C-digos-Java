package Atividade;

public class Principal {

    public static void main(String[] args) {
        
        // Instanciando conta corrente com meu nome e 50 centavos de limite
        ContaCorrente conta = new ContaCorrente(11355, 10232559, "Maycon R. Campos", "03321112356", 200.00);
        conta.sacar(10.00);         // Saque pequeno, conta negativa, cobrança de 0.10 centavos de taxa.
        conta.sacar(200.00);        // Saque acima do limite, não permitido.
        conta.depositar(100.00);    // Depósito cem reais.
        conta.depositar(150.00);    // depósito cento e cinquenta reais.
        
        // Instanciando Conta poupança com cliente minha esposa
        ContaPoupanca contaPoupanca = new ContaPoupanca(1211, 154, "Ariana C. Dionel", "02211144455");
        contaPoupanca.sacar(50.00);         // Saque cinquenta reais, não permitido.
        contaPoupanca.depositar(150.00);    // Depósito cento e cinquenta reais.
        contaPoupanca.depositar(125.00);    // Depósito cento e vinte e cinco reais.
        
    }
    
}
