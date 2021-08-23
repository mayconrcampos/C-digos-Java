package MAPA;

public class Principal {
    
    public static void main(String[] args) {
        Produto prod = new Produto("Notebook Dell", 2900.00, 1, 5);

        System.out.println("Nome    :"+prod.getNome());
        System.out.println("Valor   :"+prod.getValor());
        System.out.println("Unidade :"+prod.getUnidade());
        System.out.println("Qtde    :"+prod.getQtdeEstoque());

        Cadastro cadastro = new Cadastro(prod);
        cadastro.getProdutos();
        
    }
}
