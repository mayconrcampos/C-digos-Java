//package ClasseCarro;

public class UsandoCarro {
    
    public static void main(String[] args) {

        // instanciando objeto
        ClasseCarro obj = new ClasseCarro();

        obj.modelo = "Ka";
        obj.placa = "MBO9988";
        obj.qtdPortas = 2;

        System.out.println(obj.modelo);
        System.out.println(obj.placa);
        System.out.println(obj.qtdPortas);
        obj.acelerar();
        obj.parar();
    }
}
