package MAPA;

public class Produto {
    private String nome;
    private Double valor;
    private Integer unidade;
    private Integer qtde_estoque;

    public Produto(String nome, Double valor, Integer unidade, Integer qtde_estoque) {
        this.setNome(nome);
        this.setValor(valor);
        this.setUnidade(unidade);
        this.setQtdeEstoque(qtde_estoque);
    }

    private void setNome(String nome) {
        if(nome != "") {
            this.nome = nome;
        }
        
    }

    private void setValor(Double valor) {
        if(valor > 0){
            this.valor = valor;
        }else{
            System.out.println("ERRO! Valor precisa ser acima de 0.");;
        }
    }

    private void setUnidade(Integer unidade) {
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

    public Integer getUnidade() {
        return this.unidade;
    }

    public Integer getQtdeEstoque() {
        return this.qtde_estoque;
    }

}
