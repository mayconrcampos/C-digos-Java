package MAPA;

import java.util.ArrayList;

public class ListaProdutos {
    public static ArrayList<Produto> produtos = new ArrayList<>();


    public static void setCadastro(Produto p) {
        ListaProdutos.setProdutoAppend(p);
    }

    private static void setProdutoAppend(Produto p) {
        ListaProdutos.produtos.add(p);
    }
}
