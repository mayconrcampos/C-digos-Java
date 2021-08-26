package MAPA;

public class Movimento {
    
    public static void entradaSaida(String nome, Integer indice, Integer flag, Integer estoqueAtual) {
        Cadastro cadastro = new Cadastro();
        switch (flag) {

            // Caso for saida de produtos - flag = 0
            case 0:
                System.out.println("2. Saída de Produtos do estoque");

                System.out.println("Saída - Digite o número de itens que estão saindo.");
                Integer saida = Read.readInt();

                //System.out.println("indice "+indice+" nome "+nome+" flag "+flag+" etoque "+estoqueAtual+" saida"+saida);

                
                while(saida <= 0 || saida > estoqueAtual){
                    System.out.println("Saída - Precisa ser acima de 0 e menor que a qtde atual de estoque.");
                    saida = Read.readInt();
                }

                System.out.println("Confirma Saída do estoque? S/N");
                String confirma = Read.readString();

                if(confirma.compareTo("") == 0 || confirma.compareTo("erro") == 0){
                    System.out.println("Entrada inválida. Confirma Saída do estoque? S/N");
                    confirma = Read.readString();
                }

                switch (confirma) {
                    case "s":
                    case "S":
                        System.out.println("Saída confirmada.");
                        Integer atualMenosSaida = estoqueAtual - saida;
                        
                        System.out.println("Estoque Antes: "+estoqueAtual);
                        System.out.println("----------------------------");
                        System.out.println("Estoque Atual: "+atualMenosSaida);
                        
                        ListaProdutos.produtos.get(indice).setQtdeEstoque(atualMenosSaida);
                        
                        cadastro.listaSimples();

                        System.out.println("Deseja repetir a operação? S/N\n\n");
                        String repetir = Read.readString();

                        if(repetir.compareTo("") == 0 || repetir.compareTo("erro") == 0){
                            System.out.println("Entrada inválida. Deseja repetir a operação? S/N");
                            repetir = Read.readString();
                        }

                        switch (repetir) {
                            case "s":
                            case "S":
                                System.out.println("Repetindo a Operação.\n\n");
                                Menu.Movimentacao();
                                break;
                            case "n":
                            case "N":
                                System.out.println("Retornando ao Menu Principal.\n\n");
                                Menu.menuPrincipal();
                                break;
                            default:
                                System.out.println("Opção inválida.\n\n");
                                Menu.menuPrincipal();
                                break;
                        }

                        break;
                    case "n":
                    case "N":
                        System.out.println("Você escolheu N. Retornando ao menu Movimentação.\n\n\n");
                        Menu.Movimentacao();
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        Menu.Movimentacao();
                        break;
                }

         


            // Caso for entrada de produtos - flag = 1

            case 1:
                System.out.println("1. Entrada de Produtos no estoque.\n\n");

                System.out.println("Entrada - Digite o número de itens que estão entrando.");
                Integer entrada = Read.readInt();

                //System.out.println("indice "+indice+" nome "+nome+" flag "+flag+" etoque "+estoqueAtual+" saida"+saida);

                
                while(entrada <= 0){
                    System.out.println("Entrada - Inválido! Digite novamente o número de itens que estão entrando.");
                    saida = Read.readInt();
                }

                System.out.println("Confirma Entrada no estoque? S/N");
                String confirmaEntrada = Read.readString();

                if(confirmaEntrada.compareTo("") == 0 || confirmaEntrada.compareTo("erro") == 0){
                    System.out.println("Entrada inválida. Confirma entrada no estoque? S/N");
                    confirmaEntrada = Read.readString();
                }

                switch (confirmaEntrada) {
                    case "s":
                    case "S":
                        System.out.println("Entrada confirmada.");
                        Integer atualMaisEntrada = estoqueAtual + entrada;
                        
                        System.out.println("Estoque Antes: "+estoqueAtual);
                        System.out.println("----------------------------");
                        System.out.println("Estoque Atual: "+atualMaisEntrada);
                        
                        ListaProdutos.produtos.get(indice).setQtdeEstoque(atualMaisEntrada);
                        
                        cadastro.listaSimples();

                        System.out.println("Deseja repetir a operação? S/N\n\n");
                        String repetir = Read.readString();

                        if(repetir.compareTo("") == 0 || repetir.compareTo("erro") == 0){
                            System.out.println("Entrada inválida. Deseja repetir a operação? S/N");
                            repetir = Read.readString();
                        }

                        switch (repetir) {
                            case "s":
                            case "S":
                                System.out.println("Repetindo a Operação.\n\n");
                                Menu.Movimentacao();
                                break;
                            case "n":
                            case "N":
                                System.out.println("Retornando ao Menu Principal.\n\n");
                                Menu.menuPrincipal();
                                break;
                            default:
                                System.out.println("Opção inválida.\n\n");
                                Menu.menuPrincipal();
                                break;
                        }
                    case "n":  
                    case "N":
                        System.out.println("Você escolheu N. Retornando ao menu Movimentação.\n\n\n");
                        Menu.Movimentacao();
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        Menu.Movimentacao();
                        break;
                }

            // Caso for reajuste de preços - flag = 2
            
            case 2:
                System.out.println("2. Reajuste de Preços.\n\n");

                System.out.println("Reajuste - Digite o novo valor (R$).");
                Double novoValor = Read.readDouble();
                
                while(novoValor <= 0){
                    System.out.println("Reajuste - Inválido! Digite novamente o novo valor (R$).");
                    saida = Read.readInt();
                }

                System.out.println("Confirma Reajuste de Preço para o produto "+nome+"? S/N");
                String confirmaReajuste = Read.readString();

                if(confirmaReajuste.compareTo("") == 0 || confirmaReajuste.compareTo("erro") == 0){
                    System.out.println("Entrada inválida. Confirma Reajuste de preço para o produto "+nome+"? S/N");
                    confirmaReajuste = Read.readString();
                }

                switch (confirmaReajuste) {
                    case "s":
                    case "S":
                        System.out.println("Reajuste confirmado.");
                        //Integer atualMaisEntrada = estoqueAtual + entrada;

                        System.out.println("Preço Antes (R$): "+ListaProdutos.produtos.get(indice).getValor());
                        System.out.println("----------------------------");
                        System.out.println("Preço Atual (R$): "+novoValor);

                        ListaProdutos.produtos.get(indice).setValor(novoValor);

                        cadastro.listaSimples();

                        System.out.println("Deseja repetir a operação? S/N\n\n");
                        String repetir = Read.readString();

                        if(repetir.compareTo("") == 0 || repetir.compareTo("erro") == 0){
                            System.out.println("Entrada inválida. Deseja repetir a operação? S/N");
                            repetir = Read.readString();
                        }

                        switch (repetir) {
                            case "s":
                            case "S":
                                System.out.println("Repetindo a Operação.\n\n");
                                Menu.Movimentacao();
                                break;
                            case "n":
                            case "N":
                                System.out.println("Retornando ao Menu Principal.\n\n");
                                Menu.menuPrincipal();
                                break;
                            default:
                                System.out.println("Opção inválida.\n\n");
                                Menu.menuPrincipal();
                                break;
                
                        }
                }
        }
        
    }

    public static void confirmaSeExiste(String nome, Integer flag){
        Integer conta = 0;
        Integer compara, indice;
        Integer estoqueAtual;
        
        for(Integer index = 0; index < ListaProdutos.produtos.size(); index++){
            String string1 = nome.toUpperCase();
            String string2 = ListaProdutos.produtos.get(index).getNome();
            
            compara = string1.compareTo(string2);
            if(compara == 0){
                estoqueAtual = ListaProdutos.produtos.get(index).getQtdeEstoque();
                conta++;
                indice = index;

                System.out.println("Nome:   "+ListaProdutos.produtos.get(index).getNome()+"    Valor (R$):     "+ListaProdutos.produtos.get(index).getValor()+"   Unidade:    "+ListaProdutos.produtos.get(index).getUnidade()+"     Qtde Estoque:   "+ListaProdutos.produtos.get(index).getQtdeEstoque()+"\n");

                if(flag == 0){
                    Movimento.entradaSaida(nome, indice, flag, estoqueAtual);
                }else if (flag == 1){
                    Movimento.entradaSaida(nome, indice, flag, estoqueAtual);
                }else{
                    Movimento.entradaSaida(nome, indice, flag, estoqueAtual);
                }
            }
        }

            if(conta == 0){
                System.out.println("Produto não encontrado.\n");
                Menu.Movimentacao();
            }
    }
}
