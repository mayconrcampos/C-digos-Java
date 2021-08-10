
/**
 * ContaBancaria
 */
public class ContaBancaria {

    private String banco;
    private String ag;
    private String cc;
    private String nomeCliente;
    private Double saldo = 0.00;
    private Double limite = 0.00;

    public ContaBancaria(String banco, String ag, String cc, String nomeCliente){
        this.banco = banco;
        this.ag = ag;
        this.cc = cc;
        this.nomeCliente = nomeCliente;

    }

    public void getDados() {
        System.out.println("Banco   : "+this.banco);
        System.out.println("AG      : "+this.ag);
        System.out.println("C/C     : "+this.cc);
        System.out.println("Cliente : "+this.nomeCliente);
        System.out.println("---------------------------");
        System.out.println("Saldo (R$)  :   "+this.saldo);
        System.out.println("---------------------------");
        System.out.println("limite (R$) :   "+this.limite);
        System.out.println("\n");
    }

    public void setLimite(double limite) {
        this.limite = limite;
        this.getDados();
    }

    public void depositar(Double deposito) {
        this.saldo += deposito;
        System.out.println("Você depositou (R$): "+deposito);
        this.getDados();
    }

    public void sacar(Double saque) {
        Double sacando = this.saldo - saque;
        if(sacando >= -this.limite){
            this.saldo -= saque;
            System.out.println("Você sacou o valor de (R$): "+saque);
            this.getDados();
        }else{
            System.out.println("Saldo insuficiente.");
            System.out.println("Valor Saque (R$): "+saque);
            this.getDados();
        }
    }
}