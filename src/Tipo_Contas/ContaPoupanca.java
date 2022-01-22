package Tipo_Contas;

import Clientes.Cliente;

import java.util.GregorianCalendar;

public class ContaPoupanca extends Conta {

    GregorianCalendar calendar = new GregorianCalendar(); //Instacia um calendario para pegar o dia atual

    private final int diaAniversario; //Dia do mes ao qual serão aplicados os juros
    private double taxaJuros=0.03; //Taxa de juros baseada na taxa Selic

//--------------------- CONSTRUTOR ---------------------------
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        diaAniversario= calendar.get(GregorianCalendar.DAY_OF_MONTH); //Pega o dia atual do mes na criação da conta e guarada no dia de aniversario
    }

//--------------------- GETTERS ------------------------------

    public double getTaxaJuros() {
        return taxaJuros;
    }


//--------------------- SETTERS ------------------------------


    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }


//----------------------- METODOS ---------------------------
    //calcula o rendimento mensal da conta
    public void adicionaJuros(double taxa){
        if(calendar.get(GregorianCalendar.DAY_OF_MONTH) == diaAniversario) { //verifica se o dia atual é o mesmo do dia de aniversario
            this.saldoConta += this.saldoConta * taxa; //adiciona o rendimento mensal da conta
            System.out.println("\nRendimento mensal adicionado.\nSaldo atual: " + this.saldoConta);
        }else {
            System.out.println("\nNada a adicionar, dia do aniversario ainda não chegou");
        }
    }
}
