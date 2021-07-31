import java.util.Scanner;

/**
 * swtchCase
 */
public class swtchCase {

    public static void main(String[] args){
        //switche();
        //usandoIF();
        //usandoFOR();
        //usandoWHILE();
        usandoDOWHILE();
    }

    public static void switche(){
        System.out.println("Digite sua opção");
        System.out.println("1. Comprar");
        System.out.println("2. Vender");
        System.out.println("3. Listar");
        System.out.println("4. Sair");

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1: 
                System.out.println("1. Você acessou Comprar");
                break;
            case 2:
                System.out.println("2. Você acessou Vender");
                break;
            case 3:
                System.out.println("3. Você acessou Listar");
                break;
            case 4:
                System.out.println("4. Você saiu.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static void usandoIF() {
        System.out.println("Digite sua opção");
        System.out.println("1. Comprar");
        System.out.println("2. Vender");
        System.out.println("3. Listar");
        System.out.println("4. Sair");

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        if(opcao == 1){
            System.out.println("1. Você acessou Comprar");
        }else if(opcao == 2){
            System.out.println("2. Você acessou Vender");
        }else if(opcao == 3){
            System.out.println("3. Você acessou Listar");
        }else if(opcao == 4){
            System.out.println("4. Você Saiu do Programa");
        }else{
            System.out.println("Opção Inválida!");
        }
    }
    public static void usandoFOR() {
        for(int i = 1; i <= 10; i++){
            System.out.println("Tabuada de "+i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i+" x "+j+" = "+ j*i);
            }
        }
    }

    public static void usandoWHILE() {
        int conta = 0;
        while(conta <= 10){
            System.out.println(conta+" x 2 = "+ conta * 2);
            conta++;
        }
    }

    public void usandoDOWHILE() {
        int valor = 1;

        do{
            System.out.println("O número é : "+ valor++);

        }while(valor < 20);
    }
}

