public class ClasseCarro {
    private String modelo;
    private Integer qtdPortas;
    private String placa;

    private String motor;
    private Integer veloMAX;

    private Integer velocidade = 0;
    private Boolean ligado = false;

    public ClasseCarro(String modelo, Integer qtdPortas, String placa, String motor) {
        this.modelo = modelo;
        this.qtdPortas = qtdPortas;
        this.placa = placa;

        if(motor == "1.0"){
            this.motor = motor;
            this.veloMAX = 160;
        }else if(motor == "1.4"){
            this.motor = motor;
            this.veloMAX = 180;
        }else if(motor == "1.6"){
            this.motor = motor;
            this.veloMAX = 190;
        }else if(motor == "1.8"){
            this.motor = motor;
            this.veloMAX = 200;
        }else if(motor == "2.0"){
            this.motor = motor;
            this.veloMAX = 220;
        }else{
            System.out.println("Motor "+motor+" inválido. Foi setado como 1.0");
            this.motor = "1.0";
            this.veloMAX = 160;
        }

        getEspecificacoes();

    }
    private void getEspecificacoes() {
        System.out.println("Especificações do carro");
        System.out.println("Modelo:     "+this.modelo);
        System.out.println("Portas:     "+this.qtdPortas);
        System.out.println("Placa :     "+this.placa);
        System.out.println("Motor :     "+this.motor);
        System.out.println("-----------------------");
        System.out.println("Vel MAX Km/h:   "+this.veloMAX);
        
    }

    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
        }
    }

    public void desligar() {
        if(this.ligado){
            if(this.velocidade == 0){
                this.ligado = false;
                System.out.println("Você desligou o carro.");
            }else{
                System.out.println("O carro precisa estar parado para que você possa desliga-lo");
            }
            
        }else{
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar() {
        if(this.ligado){
            if(this.velocidade < this.veloMAX){
                this.velocidade += 10;
                System.out.println("Acelerando a "+this.velocidade+" Km/h");
            }else{
                System.out.println("Você está na velocidade Máxima! "+this.velocidade+" Km/h");
            }
            
        }else{
            System.out.println("Carro desligado, você precisa liga-lo.");
        }
        
    }

    public void desacelerar() {
        if(this.ligado && this.velocidade > 0){
            this.velocidade -= 10;
            System.out.println("Desacelerando carro em 10Km/h");
            System.out.println("Você está na velocidade "+this.velocidade+" Km/h");
        }else{
            System.err.println("O carro já está parado.");
        }
    }

    public void parar() {
        if(this.ligado){
            if(this.velocidade > 0){
                this.velocidade = 0;
                System.out.println("Carro totalmente parado!");
                System.out.println("Velocidade Km/h : "+this.velocidade);
            }else{
                System.out.println("O carro já está parado.");
            } 
        }else{
            System.out.println("O carro já está desligado.");
        }
        
    } 
}

