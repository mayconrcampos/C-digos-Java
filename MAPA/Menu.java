package MAPA;

import java.util.Scanner;

public class Menu {
    
    public static void menuPrincipal(){
        System.out.println("TELA 1.0 ----- Empresa de Importação de Produtos LTDA -----");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ Sistema de Controle de Estoque ---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("MENU PRINCIPAL -----------------");
        System.out.println("1. Cadastro de Produtos.");
        System.out.println("2. Movimentação.");
        System.out.println("3. Reajuste de Preços.");
        System.out.println("4. Relatórios.");
        System.out.println("0. Finalizar.");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Opção: 1, 2, 3, 4 ou 0 pra Sair.");

        Scanner scan = new Scanner(System.in);
        Integer opcao = scan.nextInt();

        switch(opcao){
            case 0:
                System.out.println("0. Você finalizou o programa.");
                break;
            case 1:
                System.out.println("1. Cadastro de Produtos");
                Menu.menuCadastroDeProdutos();
                break;
            case 2:
                System.out.println("2. Movimentação");
                break;
            case 3:
                System.out.println("3. Reajuste de Preços");
                break;
            case 4:
                System.out.println("4. Relatórios");
                break;
            default:
                System.out.println("Opção Inválida!\n\n\n\n");
                Menu.menuPrincipal();

                
        }
    }

    public static void menuCadastroDeProdutos() {
        System.out.println("TELA 1.1 ----- Empresa de Importação de Produtos LTDA -----");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ Sistema de Controle de Estoque ---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("CADASTRO DE PRODUTOS --------------------------------------");
        System.out.println("1. Inclusão.");
        System.out.println("2. Alteração.");
        System.out.println("3. Consulta.");
        System.out.println("4. Exclusão.");
        System.out.println("0. Retornar.");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Opção: 1, 2, 3, 4 ou 0 pra Sair.");

        Scanner scan = new Scanner(System.in);
        Integer opcao = scan.nextInt();

        switch(opcao){
            case 0:
                System.out.println("Retornar ao Menu Principal.\n\n\n\n");
                Menu.menuPrincipal();
                break;
            case 1:
                System.out.println("1. Inclusão");
                Menu.inclusaoProduto();
                break;
            case 2:
                System.out.println("2. Alteração");
                break;
            case 3:
                System.out.println("3. Consulta");
                break;
            case 4:
                System.out.println("4. Exclusão");
                break;
            default:
                System.out.println("Opção Inválida!");
                Menu.menuCadastroDeProdutos();
                
        }
    }

    public static void inclusaoProduto() {
        System.out.println("TELA 1.1.1 --- Empresa de Importação de Produtos LTDA -----");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ Sistema de Controle de Estoque ---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("INCLUSÃO DE PRODUTOS --------------------------------------");
        
        Cadastro cadastro = new Cadastro();
        cadastro.cadastraProduto();
    }

    public static void alteracaoProduto() {
        System.out.println("TELA 1.1.2 --- Empresa de Importação de Produtos LTDA -----");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ Sistema de Controle de Estoque ---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("ALTERAÇÃO DE PRODUTOS -------------------------------------");
        
        Cadastro cadastro = new Cadastro();
        
        Scanner scan = new Scanner(System.in);
        String produto = scan.nextLine();

        cadastro.alteraProduto(produto);

    }

    public static void consultaProduto() {
        
    }

    public static void exclusaoProduto() {
        
    }

            
}
