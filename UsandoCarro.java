//package ClasseCarro;

public class UsandoCarro {
    
    public static void main(String[] args) {

        // instanciando objeto
        ClasseCarro meucarro = new ClasseCarro("Vectra", 4, "MBO-7740", "2.0");

        meucarro.ligar();
        
        for(Integer i = 0; i < 8; i++){
            meucarro.acelerar();
        }
        for(Integer i = 0; i < 8; i++){
            meucarro.desacelerar();
        }

        meucarro.desligar();
        meucarro.parar();
        meucarro.desligar();
        meucarro.acelerar();

        
    }
}

