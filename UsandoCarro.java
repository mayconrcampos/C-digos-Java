//package ClasseCarro;

public class UsandoCarro {
    
    public static void main(String[] args) {

        // instanciando objeto
        ClasseCarro meucarro = new ClasseCarro("Vectra", 4, "MBO-7740", "2.0");

        meucarro.ligar();
        meucarro.acelerar();
        meucarro.acelerar();
        meucarro.parar();
        
        for(Integer i = 0; i < 25; i++){
            meucarro.acelerar();
        }

        meucarro.desligar();
        meucarro.parar();
        meucarro.desligar();
        meucarro.acelerar();

        
    }
}
