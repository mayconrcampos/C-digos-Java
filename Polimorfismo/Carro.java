package Polimorfismo;

public class Carro extends Veiculo{
    private Integer numeroPortas;
    
    public void setNumeroPortas(int portas){
        this.numeroPortas = portas;
    } 

    public int getNumeroPortas() {
        return this.numeroPortas;
    }

    public void andarFrente() {
        // andar frente
        System.out.println("Andando pra frente igual um Carro");
    }

    public void buzinar() {
        System.out.println("Buzinando!! Bi Bi que nem um Carro");
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        System.out.print("Ano do Carro : ");
        return this.ano;
    }

    public void estacionarVeiculo() {
        System.out.println("Iniciando estacionamento do Carro.");
        this.andarFrente();
        this.andarFrente();
        this.buzinar();
        System.out.println("Finalizando o processo de estacionamento do Carro.");
    }

}
