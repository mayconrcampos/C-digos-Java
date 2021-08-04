public class PessoaPrincipal {
    
    public static void main(String[] args) {
        
        PessoaFisica pessoa = new PessoaFisica();

        pessoa.setDados("Maycon Campos", "Av Renato Ramos", "048 984443857");
        pessoa.setCPF("037721379-97");
        pessoa.getDados();

        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setDados("SCPar SA", "Rua da Praia", "048 3255-3366");
        empresa.setCNPJ("21.912.774/0001-69");
        empresa.getDados();

        PessoaJuridica empresa2 = new PessoaJuridica();
        empresa2.setDados("NextPrint", "Av Renato Ramos", "048 3222-3322");
        empresa2.setCNPJ("11.321.456.987/0001-55");
        empresa2.getDados();
    
    }
}
