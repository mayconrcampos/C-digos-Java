package MAPA;

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

        Integer opcao = Read.readInt();

        while(opcao < 0){
            System.out.println("Número inválido. Digite novamente.");
            opcao = Read.readInt();
        }

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
                Cadastro cadastro = new Cadastro();
                cadastro.relatorios();
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
        System.out.println("Opção: 1, 2, 3, 4 ou 0 pra Retornar ao Menu Principal.");

        //Scanner scan = new Scanner(System.in);
        Integer opcao = Read.readInt();

        while(opcao < 0){
            System.out.println("Número inválido. Digite novamente.");
            opcao = Read.readInt();
        }
        
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
                Menu.alteracaoProduto();
                break;
            case 3:
                System.out.println("3. Consulta");
                Menu.consultaProduto();
                break;
            case 4:
                System.out.println("4. Exclusão");
                Menu.exclusaoProduto();
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
        cadastro.cadastraProduto(1, 0);
    }

    public static void alteracaoProduto() {
        System.out.println("TELA 1.1.2 --- Empresa de Importação de Produtos LTDA -----");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ Sistema de Controle de Estoque ---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("ALTERAÇÃO DE PRODUTOS -------------------------------------");
        
        
        
        System.out.println("Digite o nome do produto pra alterar.");
        String produto = Read.readString();

        while(produto.compareTo("") == 0 || produto.compareTo("erro") == 0){
            System.out.println("Erro ao ler Produto. Digite novamente.");
            produto = Read.readString();
        }

        Cadastro cadastro = new Cadastro();
        cadastro.alteraProduto(produto);

    }

    public static void consultaProduto() {
        System.out.println("TELA 1.1.3 --- Empresa de Importação de Produtos LTDA -----");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ Sistema de Controle de Estoque ---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("CONSULTA DE PRODUTOS --------------------------------------");
        
        Cadastro cadastro = new Cadastro();
        
        System.out.println("Digite o nome do produto para ver seus dados.");
        
        String produto = Read.readString();

        while(produto.compareTo("") == 0 || produto.compareTo("erro") == 0){
            System.out.println("Erro ao ler Produto. Digite novamente.");
            produto = Read.readString();
        }

        cadastro.consultaProduto(produto);
    }

    public static void exclusaoProduto() {
        System.out.println("TELA 1.1.4 --- Empresa de Importação de Produtos LTDA -----");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ Sistema de Controle de Estoque ---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("EXCLUSÃO DE PRODUTOS --------------------------------------");
        
        Cadastro cadastro = new Cadastro();
        
        System.out.println("Digite o nome do produto para excluir.");
        
        String produto = Read.readString();

        while(produto.compareTo("") == 0 || produto.compareTo("erro") == 0){
            System.out.println("Erro ao ler Produto. Digite novamente.");
            produto = Read.readString();
        }

        cadastro.excluirProduto(produto);
    }

    public static void Movimentacao() {
        System.out.println("TELA 1.2 ----- Empresa de Importação de Produtos LTDA -----");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ Sistema de Controle de Estoque ---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("MOVIMENTAÇÃO DE PRODUTOS ----------------------------------");
        System.out.println("1. Entrada.");
        System.out.println("2. Saída.");
        System.out.println("0. Retornar.");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Opção: 1, 2 ou 0 pra Retornar ao 1.1 Cadastro de Produtos.");

        Integer opcao = Read.readInt();

        while(opcao < 0){
            System.out.println("Opção numérica inválida. Digite novamente.");
            opcao = Read.readInt();
        }

        switch (opcao) {
            case 0:
                System.out.println("0. Você retornou ao Menu Cadastro de Produtos.");
                Menu.menuCadastroDeProdutos();
                break;

            case 1:
                break;
            
            case 2:
                break;

            default:
                System.out.println("Opção inválida!\n");
                Menu.Movimentacao();
                break;
        }
    }            
}
