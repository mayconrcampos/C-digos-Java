package Polimorfismo;

public class Aviao extends Veiculo implements Voo {
    

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno(){
        System.out.print("Ano do Avião : ");
        return this.ano;
    }

    public void voar() {
        System.out.println("Avião Avoando!");
    }

    public void andarFrente() {
        System.out.println("Voando pra Frente que nem um Avião!");
    }

    public void buzinar() {
        System.out.println("Buzinando!! Bi Bi igual um avião");
    }

    public void estacionarVeiculo() {
        System.out.println("Iniciando estacionamento do Avião.");
        this.andarFrente();
        this.andarFrente();
        this.buzinar();
        System.out.println("Finalizando o processo de estacionamento do Avião.");
    }
}
