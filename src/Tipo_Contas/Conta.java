package Tipo_Contas;

import Clientes.Cliente;

public abstract class Conta {

    private static int contadorConta= 1; //Serve para calcular o numero da conta
    private final int numeroConta; //Serve como o numero de indentificação da conta dentro do sistema
    private int numeroAgencia= 1; //Agencia padrão
    protected double saldoConta; //Guarda o valor dentro do dinheiro dentro da conta
    protected final Cliente cliente; //Indentificação de qual cliente a conta pertence

//--------------------- CONSTRUTOR ------------------------

    public Conta(Cliente cliente){
        this.numeroConta= contadorConta++; //Utiliza o contador para definir o numero da conta e o incrmenta
        this.cliente= cliente;
        this.saldoConta=0;
    }


//--------------------- GETTERS ---------------------------

    public double getSaldoConta() {
        return this.saldoConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getCliente() {
        return cliente.getNome(); //Puxa o nome do cliente a partir da classe cliente
    }


//--------------------- SETTERS -----------------------------

    //Possibilita o cliente trocar de agencia
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }


//----------------------- METODOS ---------------------------

    //Deposita valor na conta  exibe o saldo apos o deposito
    public void deposito(double valor){
        this.saldoConta += valor;
        System.out.println("\nDeposito realizado com sucesso. \nSaldo atual:" + this.saldoConta);
    }

    //Verifica se o valor solicitado é maior do que o saldo na conta
    public boolean verificaValor(double valor){
        if(valor>this.saldoConta){ //Se o valor a sacar é maior que o saldo atual exibe a mesnagem de opreaçõa invalida
            System.out.println("\nOperação não concluida. Saldo invalido.\nSaldo: "+this.saldoConta);
            return false;
        }
        return true;//Caso o valor seja menor retorna true
    }

    //Retira um valor especificado da conta
    public void saque(double valor){
        if(verificaValor(valor)) this.saldoConta -= valor;
    }

    //Transfere uma quantia de uma conta a outra
    public void transferencia(Conta destino, double valor){
        if(verificaValor(valor)){ //Checa para ver se a transferencia é possivel
            this.saldoConta -= valor; //Retira o valor da conta de origem
            destino.deposito(valor); //Deposita o valor na conta destino
            System.out.println("\nTransferencia realizada com sucesso.\nSaldo atual: " + this.saldoConta);
        }
    }
}


