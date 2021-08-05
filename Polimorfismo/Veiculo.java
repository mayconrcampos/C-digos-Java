package Polimorfismo;

public abstract class Veiculo {
    protected Integer ano;

    public abstract void andarFrente();

    public abstract void buzinar();

    public abstract void setAno(int ano);

    public abstract int getAno();

    public abstract void estacionarVeiculo();
}
