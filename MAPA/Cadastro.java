package MAPA;

import java.util.Scanner;

public class Cadastro {
    
    // Método Cadastra Produtos

    public void cadastraProduto(Integer flag) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o nome do produto: ");
            String nome = scan.nextLine();

            while(nome.compareTo("") == 0){
                System.out.println("Digite o nome do produto: ");
                nome = scan.nextLine();
            }
            
            Integer existe = 0;
            for(Integer index = 0; index < ListaProdutos.produtos.size(); index++){
                String string1 = nome.toUpperCase();
                String string2 = ListaProdutos.produtos.get(index).getNome();
                
                int compara = string1.compareTo(string2);
                if(compara == 0){
                    existe++;
                    break;
                }
            }

            if(existe > 0){
                System.out.println("ERRO ao inserir. Produto já existe.");
                this.cadastraProduto(1);

            }else{
                System.out.println("Digite o valor (R$): ");
                Double valor = scan.nextDouble();
        
                while(valor == 0) {
                    System.out.println("Digite o valor (R$): ");
                    valor = scan.nextDouble();
                }
                
                System.out.println("Digite a Unidade: UNI, metro, Par, Cento, Mil :");
                String unidade = scan.nextLine();
                while(unidade == "" || unidade == null){
                    System.out.println("Digite a Unidade: UNI, metro, Par, Cento, Mil :");
                    unidade = scan.nextLine();
                }
                
                scan.nextLine();
                System.out.println("Digite quantidade em estoque: ");
                Integer estoque = scan.nextInt();
                while(estoque < 1 || estoque != estoque.intValue()) {
                    System.out.println("Digite quantidade em estoque: ");
                    estoque = scan.nextInt();
                }
                
                scan.nextLine();

                if(flag == 1){
                    System.out.println("Confirma Inclusão? S/N :");
                }else if(flag == 0){
                    System.out.println("Confirma Alteração? S/N :");
                }
                
                char opcao = scan.nextLine().charAt(0);
                
                opcao = Character.toUpperCase(opcao);
                switch(opcao){
                    case 'S':
                        ListaProdutos.setCadastro(new Produto(nome, valor, unidade, estoque));

                        if(flag == 1){
                            System.out.println("Produto inserido com sucesso.");
                            
                            //System.out.println(this.produtos.get(0).getNome());
                            this.relatorios();

                            scan.nextLine();

                            
                            System.out.println("Repetir operação? S/N :");
                            Character repetir = scan.next().charAt(0);
                            repetir = Character.toUpperCase(repetir);

                            if(repetir == 'S'){
                                System.out.println("Cadastrar novo Produto.\n\n");
                                this.cadastraProduto(1);
                                break;
                            }else if(repetir == 'N'){
                                System.out.println("Opção N selecionada. Voltando ao menu 1.1\n\n");
                                Menu.menuCadastroDeProdutos();
                                break;
                            }else{
                                System.out.println("Opção Inválida! Retornando ao Menu 1.1.1\n\n");
                                Menu.inclusaoProduto(); 
                                break;
                            }
                        }else if(flag == 0){
                            System.err.println("Item Alterado com sucesso\n");
                            Menu.menuCadastroDeProdutos();
                        }
                        

                    case 'N':
                        System.out.println("Opção N selecionada. Voltando ao menu 1.1\n\n");
                        Menu.menuCadastroDeProdutos();
                        break;
                    default:
                        System.out.println("Opção inválida! Retornando ao menu 1.1\n\n");
                        Menu.menuCadastroDeProdutos();

                }

            }
    }

    // Método Altera Produto

    public void alteraProduto(String nome) {
        Scanner scan = new Scanner(System.in);
        Integer conta = 0;
        Integer compara, indice;
        
        for(Integer index = 0; index < ListaProdutos.produtos.size(); index++){
            String string1 = nome.toUpperCase();
            String string2 = ListaProdutos.produtos.get(index).getNome();
            
            compara = string1.compareTo(string2);
            if(compara == 0){
                conta++;
                indice = index;
                System.out.println("Nome:   "+ListaProdutos.produtos.get(index).getNome()+"    Valor (R$):     "+ListaProdutos.produtos.get(index).getValor()+"   Unidade:    "+ListaProdutos.produtos.get(index).getUnidade()+"     Qtde Estoque:   "+ListaProdutos.produtos.get(index).getQtdeEstoque()+"\n");

                if(conta > 0){
                    System.out.println("Produto encontrado.\n");
                    
                    System.out.println("Deseja editar produto? S/N");
                    
                    char opcao = scan.nextLine().charAt(0);
                    
                    opcao = Character.toUpperCase(opcao);
                    switch (opcao) {
                        case 'S':
                            ListaProdutos.produtos.remove(ListaProdutos.produtos.get(indice));
                            //this.relatorios();    
                            System.out.println("Favor preencher os campos para a alteração do produto.\n\n");
                            this.cadastraProduto(0);
                            break;
                        case 'N':
                            System.out.println("Você escolheu N. Voltando a tela 1.1\n\n");
                            Menu.menuCadastroDeProdutos();
                            break;
                        default:
                            System.out.println("Opção inválida.\n\n");
                            Menu.menuCadastroDeProdutos();
                            break;
                    }
                }else{
                    System.out.println("Produto Não encontrado.\n");
                    Menu.alteracaoProduto();
                }
            }
        }
        
    }


    // Consulta de Produtos

    public void consultaProduto(String nome) {
        Scanner scan = new Scanner(System.in);
        Integer conta = 0;
        Integer compara, indice;
        
        for(Integer index = 0; index < ListaProdutos.produtos.size(); index++){
            String string1 = nome.toUpperCase();
            String string2 = ListaProdutos.produtos.get(index).getNome();
            
            compara = string1.compareTo(string2);
            if(compara == 0){
                conta++;
                System.out.println("Nome:   "+ListaProdutos.produtos.get(index).getNome()+"    Valor (R$):     "+ListaProdutos.produtos.get(index).getValor()+"   Unidade:    "+ListaProdutos.produtos.get(index).getUnidade()+"     Qtde Estoque:   "+ListaProdutos.produtos.get(index).getQtdeEstoque()+"\n");
            }
        }

            if(conta > 0){
                System.out.println("Produto encontrado.\n");
               

                System.out.println("Deseja fazer nova consulta? S/N :");
                char opcao = scan.nextLine().charAt(0);
                
                opcao = Character.toUpperCase(opcao);

                switch (opcao) {
                    case 'S':
                        System.err.println("Você escolheu S. Retornando ao menu 1.1.3");
                        Menu.consultaProduto();
                        break;
                    case 'N':
                        System.out.println("Você escolheu N. Retornando ao menu 1.1");
                        Menu.menuCadastroDeProdutos();
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        Menu.menuCadastroDeProdutos();
                        break;
                }
            }else{
                System.out.println("Produto não encontrado.\n\n");
                System.out.println("Deseja fazer nova consulta? S/N :");
                char opcao = scan.nextLine().charAt(0);
                
                opcao = Character.toUpperCase(opcao);

                switch (opcao) {
                    case 'S':
                        System.err.println("Você escolheu S. Retornando ao menu 1.1.3");
                        Menu.consultaProduto();
                        break;
                    case 'N':
                        System.out.println("Você escolheu N. Retornando ao menu 1.1");
                        Menu.menuCadastroDeProdutos();
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        Menu.menuCadastroDeProdutos();
                        break;
                }
            }
    }

    // Método que gera relatórios e lista todos os produtos cadastrados.

    public void relatorios() {
        System.out.println(" ------------ Relatório de Estoque ------------------ ");
        Integer total = 0;
        for(Integer i = 0; i < ListaProdutos.produtos.size(); i++) {
            total++;
            String nome = ListaProdutos.produtos.get(i).getNome();
            Double valor = ListaProdutos.produtos.get(i).getValor();
            String unidade = ListaProdutos.produtos.get(i).getUnidade();
            Integer qtde = ListaProdutos.produtos.get(i).getQtdeEstoque();

            System.out.println("Nome:   "+nome+"    Valor (R$):     "+valor+"   Unidade:    "+unidade+"     Qtde Estoque:   "+qtde+"\n");
            
        }
        System.out.println("Total de Produtos cadastrados                  :"+total);
    }

    // Método para excluir um produto da lista de Produtos

    public void excluirProduto(String nome) {
        Scanner scan = new Scanner(System.in);
        for(Integer index = 0; index < ListaProdutos.produtos.size(); index++){
            String string1 = nome.toUpperCase();
            String string2 = ListaProdutos.produtos.get(index).getNome();
            
            int compara = string1.compareTo(string2);
            if(compara == 0){
                String nome1 = ListaProdutos.produtos.get(index).getNome();
                Double valor = ListaProdutos.produtos.get(index).getValor();
                String unidade = ListaProdutos.produtos.get(index).getUnidade();
                Integer qtde = ListaProdutos.produtos.get(index).getQtdeEstoque();

                System.out.println("Produto encontrado.\n");
                System.out.println("Nome:   "+nome1+"    Valor (R$):     "+valor+"   Unidade:    "+unidade+"     Qtde Estoque:   "+qtde+"");

                System.out.println("Deseja excluir este produto? S/N");
                
                char opcao = scan.nextLine().charAt(0);
                
                opcao = Character.toUpperCase(opcao);

                switch (opcao) {
                    case 'S':
                        ListaProdutos.produtos.remove(ListaProdutos.produtos.get(index));
                        System.out.println("Produto excluído com sucesso.\n\n");

                        this.relatorios();

                        Menu.menuCadastroDeProdutos();
                        break;
                    case 'N':
                        System.out.println("Você escolheu N. Voltando a tela 1.1\n\n");
                        Menu.menuCadastroDeProdutos();
                        break;

                    default:
                        System.out.println("Opção inválida.\n\n");
                        Menu.menuCadastroDeProdutos();
                        break;
                }
            }
        }      
    }
}
