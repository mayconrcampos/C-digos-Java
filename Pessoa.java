public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public void setDados(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void getDados(){
        System.out.println("Dados da Pessoa ");
        System.out.println("Nome    : "+this.nome);
        System.out.println("End     : "+this.endereco);
        System.out.println("Fone    : "+this.telefone);
    }
}
