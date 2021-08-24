package MAPA;

import java.util.Scanner;

public class Cadastro {
    
    // Método Cadastra Produtos

    public void cadastraProduto() {
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
                this.cadastraProduto();

            }else{
                System.out.println("Digite o valor (R$): ");
                Double valor = scan.nextDouble();
        
                while(valor == 0) {
                    System.out.println("Digite o valor (R$): ");
                    valor = scan.nextDouble();
                }
                
                scan.nextLine();
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
                System.out.println("Confirma Inclusão? S/N :");
                char opcao = scan.nextLine().charAt(0);
                
                opcao = Character.toUpperCase(opcao);
                switch(opcao){
                    case 'S':
                        ListaProdutos.setCadastro(new Produto(nome, valor, unidade, estoque));

                        System.out.println("Produto inserido com sucesso.");
                            
                        //System.out.println(this.produtos.get(0).getNome());
                        this.relatorios();

                        scan.nextLine();
                        System.out.println("Repetir operação? S/N :");
                        Character repetir = scan.next().charAt(0);
                        repetir = Character.toUpperCase(repetir);

                        if(repetir == 'S'){
                            System.out.println("Cadastrar novo Produto.\n\n");
                            this.cadastraProduto();
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

                System.out.println("Deseja editar produto? S/N");
                
                char opcao = scan.nextLine().charAt(0);
                
                opcao = Character.toUpperCase(opcao);

                switch (opcao) {
                    case 'S':
                        ListaProdutos.produtos.remove(ListaProdutos.produtos.get(index));
                        this.relatorios();    

                        System.out.println("Item atual excluido. Fazer novo cadastro do produto.\n\n");

                        this.cadastraProduto();
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

    // Consulta de Produtos

    public void consultaProduto(String nome) {
        // Implementar
    }

    // Método que gera relatórios e lista todos os produtos cadastrados.

    public void relatorios() {
        System.out.println(" ------ Relatório de Estoque ------ ");
        for(Integer i = 0; i < ListaProdutos.produtos.size(); i++) {
            String nome = ListaProdutos.produtos.get(i).getNome();
            Double valor = ListaProdutos.produtos.get(i).getValor();
            String unidade = ListaProdutos.produtos.get(i).getUnidade();
            Integer qtde = ListaProdutos.produtos.get(i).getQtdeEstoque();

            System.out.println("Nome:   "+nome+"    Valor (R$):     "+valor+"   Unidade:    "+unidade+"     Qtde Estoque:   "+qtde+"");
            
        }
    }
}
