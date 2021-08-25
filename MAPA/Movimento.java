package MAPA;

public class Movimento {
    
    public static void entradaSaida(String nome, Integer indice, Integer flag) {
        System.out.println("Olár! entrada!\n\n\n\n\n");

        switch (flag) {
            case 0:
                System.out.println("2. Saída de Produtos do estoque");
                break;
            case 1:
                System.out.println("1. Entrada de Produtos no estoque.\n\n");



                break;
    
        }

        
    }


    public static void confirmaSeExiste(String nome, Integer flag){
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

                if(flag == 1){
                    Movimento.entradaSaida(nome, indice, flag);
                }else{
                    Movimento.entradaSaida(nome, indice, flag);
                }
            }
        }

            if(conta == 0){
                System.out.println("Produto não encontrado.\n");
                Menu.Movimentacao();
            }
    }
}
