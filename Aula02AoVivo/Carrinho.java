package Aula02AoVivo;

public class Carrinho {
    protected String modelo;
    protected String placa;
    protected Integer portas;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo.toUpperCase();
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPortas(Integer portas) {
        if(portas > 0 && portas < 5){
            this.portas = portas;
        }else{
            System.out.println("Número inválido de portas. Foi setado automaticamente para 2 portas.");
            this.portas = 2;
        }
        
    }

    public Integer getPortas() {
        return this.portas;
    }

    public void getCarro() {
        System.out.println("----- Dados do Carro -------");
        System.out.println("Modelo  :"+this.getModelo());
        System.out.println("Placa   :"+this.getPlaca());
        System.out.println("Portas  :"+this.getPortas());
        System.err.println("----------------------------");
    }

    
    
}
