package MAPA;


//import jdk.internal.module.SystemModuleFinders;

public class Cadastro {
    
    // Método Cadastra Produtos

    public void cadastraProduto(Integer flag, Integer indice) {

            System.out.println((flag == 1) ? "Digite o nome do produto" : "");
            String nome = (flag == 1) ? Read.readString() : ListaProdutos.produtos.get(indice).getNome();


            while(nome.compareTo("erro") == 0 || nome.compareTo("") == 0){
                System.out.println("Digite o nome do produto: ");
                nome = Read.readString();
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

            if(existe > 0 && flag == 1){
                System.out.println("ERRO ao inserir. Produto já existe.\n\n");
                Menu.menuCadastroDeProdutos();

            }else{
                System.out.println("Digite o valor (R$): ");
                Double valor = Read.readDouble();
        
                while(valor == 0.0) {
                    System.out.println("Digite o valor (R$): ");
                    valor = Read.readDouble();
                }
                
                System.out.println("Digite a Unidade: UNI, metro, Par, Cento, Mil :");
                String unidade = Read.readString();

                while(unidade.compareTo("erro") == 0 || unidade.compareTo("") == 0){
                    System.out.println("Digite a Unidade: UNI, metro, Par, Cento, Mil :");
                    unidade = Read.readString();
                }
                
                System.out.println("Digite quantidade em estoque: ");
                Integer estoque = Read.readInt();

                while(estoque < 0) {
                    System.out.println("Digite quantidade em estoque: ");
                    estoque = Read.readInt();
                }
                
                if(flag == 1){
                    System.out.println("Confirma Inclusão? S/N :");
                }else if(flag == 0){
                    System.out.println("Confirma Alteração? S/N :");
                }
                
                String opcao = Read.readString();
                
                switch(opcao){
                    case "s":
                    case "S":
                        ListaProdutos.setCadastro(new Produto(nome, valor, unidade, estoque));

                        if(flag == 1){
                            System.out.println("Produto inserido com sucesso.");
                            
                            //System.out.println(this.produtos.get(0).getNome());
                            //this.relatorios();

                            System.out.println("Repetir operação? S/N :");
                            String repetir = Read.readString();

                            if(repetir.compareTo("S") == 0  || repetir.compareTo("") == 0){
                                System.out.println("Cadastrar novo Produto.\n\n");
                                this.cadastraProduto(1, 0);
                                break;
                            }else if(repetir.compareTo("n") == 0 || repetir.compareTo("N") == 0){
                                System.out.println("Opção N selecionada. Voltando ao menu 1.1\n\n");
                                Menu.menuCadastroDeProdutos();
                                break;
                            }else{
                                System.out.println("Opção Inválida! Retornando ao Menu 1.1.1\n\n");
                                Menu.inclusaoProduto(); 
                                break;
                            }
                        }else if(flag == 0){
                            System.out.println("Item Alterado com sucesso\n");
                            
                            ListaProdutos.produtos.get(indice).setQtdeEstoque(estoque);
                            ListaProdutos.produtos.get(indice).setUnidade(unidade);
                            ListaProdutos.produtos.get(indice).setValor(valor);
                            ListaProdutos.produtos.remove(ListaProdutos.produtos.get(indice));
                            Menu.menuCadastroDeProdutos();
                        }
                        
                    case "n":
                    case "N":
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

                this.confirmaAlteracao(indice, conta);
            }
        }

            if(conta == 0){
                System.out.println("Produto não encontrado.\n");
            }
        
    }

    public void confirmaAlteracao(Integer indice, Integer conta) {
        if(conta > 0){
            System.out.println("Produto encontrado.\n");
            
            System.out.println("Deseja editar produto? S/N");
            
            String opcao = Read.readString();

            while(opcao.compareTo("") == 0 || opcao.compareTo("erro") == 0){
                System.out.println("Erro ao ler teclado. Digite novamente sua opção.");
                opcao = Read.readString();
            }
            
            switch (opcao) {
                case "s":
                case "S":
                    System.out.println("Favor preencher os campos para a alteração do produto.\n\n");
                    // flag 0 - edicao | 1 - inserção
                    this.cadastraProduto(0, indice);
                    break;
                case "n":
                case "N":
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


    // Consulta de Produtos

    public void consultaProduto(String nome) {
        Integer conta = 0;
        Integer compara;
        
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
                String opcao = Read.readString();

                while(opcao.compareTo("") == 0 || opcao.compareTo("erro") == 0){
                    System.out.println("Erro ao ler teclado. Digite novamente sua opção.");
                    opcao = Read.readString();
                }

                switch (opcao) {
                    case "s":
                    case "S":
                        System.out.println("Você escolheu S. Retornando ao menu 1.1.3");
                        Menu.consultaProduto();
                        break;
                    case "n":
                    case "N":
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
                String opcao = Read.readString();

                while(opcao.compareTo("") == 0 || opcao.compareTo("erro") == 0){
                    System.out.println("Erro ao ler teclado. Digite novamente sua opção.");
                    opcao = Read.readString();
                }

                switch (opcao) {
                    case "s":
                    case "S":
                        System.out.println("Você escolheu S. Retornando ao menu 1.1.3");
                        Menu.consultaProduto();
                        break;
                    case "n":
                    case "N":
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
        System.out.println(" --------------------------------------- Relatório de Estoque -------------------------------------- ");
        Integer total = 0;
        for(Integer i = 0; i < ListaProdutos.produtos.size(); i++) {
            total++;
            String nome = ListaProdutos.produtos.get(i).getNome();
            Double valor = ListaProdutos.produtos.get(i).getValor();
            String unidade = ListaProdutos.produtos.get(i).getUnidade();
            Integer qtde = ListaProdutos.produtos.get(i).getQtdeEstoque();

            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Nome:   "+nome+"    Valor (R$):     "+valor+"   Unidade:    "+unidade+"     Qtde Estoque:   "+qtde+"");
        }
        if(total > 0){
            System.out.println("Total de Produtos cadastrados - "+total+".");
            Menu.menuPrincipal();
        }else{
            System.out.println("Nenhum produto cadastrado.");
            Menu.menuPrincipal();
        }   
    }

    // Método para excluir um produto da lista de Produtos

    public void excluirProduto(String nome) {
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
                
                String opcao = Read.readString();

                while(opcao.compareTo("") == 0 || opcao.compareTo("erro") == 0){
                    System.out.println("Erro ao ler teclado. Digite novamente sua opção.");
                    opcao = Read.readString();
                }

                switch (opcao) {
                    case "s":
                    case "S":
                        ListaProdutos.produtos.remove(ListaProdutos.produtos.get(index));
                        System.out.println("Produto excluído com sucesso.\n\n");

                        this.relatorios();

                        Menu.menuCadastroDeProdutos();
                        break;
                    case "n":
                    case "N":
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
