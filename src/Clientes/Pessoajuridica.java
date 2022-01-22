package Clientes;

public class Pessoajuridica extends Cliente{

    private final String CNPJ; //Indentificação da empresa na receita federal


//--------------------- CONSTRUTOR ---------------------------

    public Pessoajuridica(String nome, String cnpj) {
        super(nome);
        this.CNPJ= cnpj;
    }


//--------------------- GETTERS ------------------------------

    public String getCNPJ() {
        return CNPJ;
    }
}
