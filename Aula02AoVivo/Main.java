package Aula02AoVivo;

public class Main {
    
    public static void main(String[] args) {
        
        Carrinho carro = new Carrinho();
        carro.setModelo("Ford Ka");
        carro.setPlaca("MIE7740");
        carro.setPortas(2);
        carro.getCarro();

        Carrinho carro1 = new Carrinho();
        carro1.setModelo("Ford Fusion");
        carro1.setPlaca("MOO1123");
        carro1.setPortas(0);
        carro1.getCarro();

    }
}
