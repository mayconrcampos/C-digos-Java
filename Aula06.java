import java.util.Scanner;

public class Aula06 {

    public static void main(String[] args) {
        
        System.out.println("Qual sua idade?");

        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();

        if(testeIdade(idade)){
            System.out.println("É de maior");
        }else{
            System.out.println("É de menor");
        }
        
    }
    
    public static boolean testeIdade(int idade){
        if(idade >= 18){
            return true;
        }else{
            return false;
        }
    }
}
