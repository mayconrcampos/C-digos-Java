package Atividade;

public class Principal {

    public static void main(String[] args) {
        
        // Instanciando Cliente
        Cliente maycon = new Cliente("Maycon Campos", "03772137997");
        
        System.out.println("Nome : "+maycon.getNome());
        System.out.println("CPF  : "+maycon.getCPF());

        // Instanciando Conta Corrente com Saldo 0 e Limite de 500 reais.
        ContaCorrente conta = new ContaCorrente(11355, 10232559, maycon.getNome(), 0.50);
        conta.getConta();
        conta.depositar();
        conta.depositar();
        conta.sacar();
        conta.sacar();
        conta.sacar();
        conta.sacar();
        conta.sacar();
        conta.sacar();
        conta.sacar();
        conta.sacar();
    



    }
    
}
