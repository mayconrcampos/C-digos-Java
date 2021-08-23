package MAPA;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();


    private void setCadastro(Produto p) {
        this.setProdutoAppend(p);
    }

    private void setProdutoAppend(Produto p) {
        this.produtos.add(p);
    }

    
    // Método Cadastra Produtos

    public void cadastraProduto() {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o nome do produto: ");
            String nome = scan.nextLine();
            scan.nextLine();

            System.out.println("Digite o valor (R$): ");
            Double valor = scan.nextDouble();
            //scan.nextLine();

            System.out.println("Digite quantas Unidades: ");
            Integer unidade = scan.nextInt();
            //scan.nextLine();

            System.out.println("Digite quantidade em estoque: ");
            Integer estoque = scan.nextInt();
            //scan.nextLine();

            
            
            System.out.println("Confirma Inclusão? S/N :");
            String opcao = scan.next();

            switch(opcao.toUpperCase()){
                case "S":
                    Produto prod = new Produto(nome, valor, unidade, estoque);
                    this.setCadastro(prod);

                    System.out.println("Repetir operação? S/N :");
                    String repetir = scan.next();

                    if(repetir.toUpperCase() == "S"){
                        Menu.inclusaoProduto();
                        break;
                    }else if(repetir.toUpperCase() == "N"){
                        System.out.println("Opção N selecionada. Voltando ao menu 1.1.1.");
                        Menu.inclusaoProduto();

                    }else{
                        System.out.println("Opção Inválida! Retornando ao Menu 1.1.1");
                        Menu.inclusaoProduto();
                        break;
                    }
                    
                case "N":
                    Menu.menuCadastroDeProdutos();
                    break;
                default:
                    System.out.println("Opção inválida\n\n\n");
                    Menu.menuCadastroDeProdutos();

            }
    }

    // Método Altera Produto

    public void alteraProduto(String nome) {

        
        if(produtos.contains(nome)){
            System.out.println("Tem sim.");
        }else{
            System.out.println("Notem não");
        }
        
        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scan.nextLine();
        scan.nextLine();

        System.out.println("Digite o valor (R$): ");
        Double valor = scan.nextDouble();
        //scan.nextLine();

        System.out.println("Digite quantas Unidades: ");
        Integer unidade = scan.nextInt();
        //scan.nextLine();

        System.out.println("Digite quantidade em estoque: ");
        Integer estoque = scan.nextInt();
        //scan.nextLine();

        
        
        System.out.println("Confirma Inclusão? S/N :");
        String opcao = scan.next();

        switch(opcao.toUpperCase()){
            case "S":
                Produto prod = new Produto(nome, valor, unidade, estoque);
                this.setCadastro(prod);

                System.out.println("Repetir operação? S/N :");
                String repetir = scan.next();

                if(repetir.toUpperCase() == "S"){
                    Menu.inclusaoProduto();
                    break;
                }else{


                }
                
            case "N":
                System.out.println("Inclusão não confirmada.");
                Menu.menuCadastroDeProdutos();
                break;

            default:
                System.out.println("Opção inválida\n\n\n");
                Menu.menuCadastroDeProdutos();

        }*/
    }

    // Método que gera relatórios e lista todos os produtos cadastrados.

    public void relatorios() {
        for(Integer i = 0; i < this.produtos.size(); i++) {
            String nome = this.produtos.get(i).getNome();
            System.out.println("Nome            :"+ nome);

            Double valor = this.produtos.get(i).getValor();
            System.out.println("Valor(R$)       :"+ valor);

            Integer unidade = this.produtos.get(i).getUnidade();
            System.out.println("Uni             :"+ unidade);

            Integer qtde = this.produtos.get(i).getQtdeEstoque();
            System.out.println("Qtde Estoque    :"+ qtde);
        }
    }




}
