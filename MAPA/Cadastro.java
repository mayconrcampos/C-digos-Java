package MAPA;

import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();


    public Cadastro(Produto p) {
        this.setProdutoAppend(p);
    }

    private void setProdutoAppend(Produto p) {
        this.produtos.add(p);
    }

    public void getProdutos() {
        for(Integer i = 0; i < this.produtos.size(); i++) {
            String nome = this.produtos.get(i).getNome();
            System.out.println(nome);

            Double valor = this.produtos.get(i).getValor();
            System.out.println(valor);

            Integer unidade = this.produtos.get(i).getUnidade();
            System.out.println(unidade);

            Integer qtde = this.produtos.get(i).getQtdeEstoque();
            System.out.println(qtde);
        }
    }

}
