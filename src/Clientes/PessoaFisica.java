package Clientes;

public class PessoaFisica extends Cliente{

    private final String cpf; //Indentificação da pessoa fisica na receita federal

//--------------------- CONSTRUTOR ---------------------------
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf=cpf;

    }

//--------------------- GETTERS ------------------------------
    public String getCpf() {
        return this.cpf;
    }
}
