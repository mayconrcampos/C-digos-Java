package MAPA;

public class Produto {
    private String nome;
    private Double valor;
    private String unidade;
    private Integer qtde_estoque;

    public Produto(String nome, Double valor, String unidade, Integer qtde_estoque) {
        this.setNome(nome);
        this.setValor(valor);
        this.setUnidade(unidade);
        this.setQtdeEstoque(qtde_estoque);
    }

    private void setNome(String nome) {
        this.nome = nome.toUpperCase();
        
    }

    private void setValor(Double valor) {
        this.valor = valor;
    }

    private void setUnidade(String unidade) {
            this.unidade = unidade;        
    }

    private void setQtdeEstoque(Integer qtde_estoque) {
        this.qtde_estoque = qtde_estoque;
    }

    public void setReajuste(Double reajuste) {
        this.valor += valor * (reajuste / 100);
    }

    public String getNome() {
        return this.nome;
    }

    public Double getValor() {
        return this.valor;
    }

    public String getUnidade() {
        return this.unidade;
    }

    public Integer getQtdeEstoque() {
        return this.qtde_estoque;
    }

}
