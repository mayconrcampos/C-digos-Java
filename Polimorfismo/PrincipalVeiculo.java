package Polimorfismo;

public class PrincipalVeiculo {
    

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        
        carro.setAno(2020);
        System.out.println(carro.getAno());
        carro.andarFrente();
        carro.buzinar();
        carro.estacionarVeiculo();

        Veiculo aviao = new Aviao();
        aviao.setAno(2020);
        System.out.println(aviao.getAno());
        aviao.andarFrente();
        aviao.buzinar();
        aviao.estacionarVeiculo();
         
    } 
}
