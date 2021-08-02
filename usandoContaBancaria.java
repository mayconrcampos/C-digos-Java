public class usandoContaBancaria {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Inter SA", "0001-9", "1023255-9", "Maycon R. Campos");

        minhaConta.getDados();
        minhaConta.depositar(1000.00);
        minhaConta.setLimite(500.00);
        minhaConta.sacar(1050.00);
        minhaConta.sacar(440.00);
        minhaConta.sacar(10.00);
        minhaConta.depositar(2500.00);
        
    }
}
