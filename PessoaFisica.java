public class PessoaFisica extends Pessoa {
    protected String cpf;

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void getDados(){
        System.out.println("Dados da Pessoa Física");
        System.out.println("Nome    : "+this.nome);
        System.out.println("End     : "+this.endereco);
        System.out.println("Fone    : "+this.telefone);
        System.out.println("CPF     : "+this.cpf);
    }
}
