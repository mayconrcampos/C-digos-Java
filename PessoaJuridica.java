public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCNPJ(){
        return this.cnpj;
    }

    public void getDados(){
        System.out.println("Dados da Pessoa Jurídica");
        System.out.println("Nome    : "+this.nome);
        System.out.println("End     : "+this.endereco);
        System.out.println("Fone    : "+this.telefone);
        System.out.println("CNPJ    : "+this.cnpj);
    }
}
