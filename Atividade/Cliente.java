package Atividade;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
      
    }

    public String getCPF(){
        return this.cpf;
    
    }   
}
