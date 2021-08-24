/**
 * hello-world
 */
public class helloworld {
    public static void main(String[] args) {
        System.out.println("Olá Mundo em Java.");

        try {
            Runtime.getRuntime().exec("clear");

        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela.");
        }
    }   
}
