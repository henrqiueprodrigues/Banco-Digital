import Clientes.Cliente;
import Tipo_Contas.Conta;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private static ArrayList<Conta> contas= new ArrayList<>(); //Cria um array statico dinamico que ira guardar as contas


//--------------------- METODOS -------------------------------

    public static void adicionaConta(Conta conta,Cliente cliente){
        contas.add(conta); //Adiciona a conta ao final da lista
        cliente.adicionaConta(conta); //Adiciona a conta ao cliente
    }

    //Imprime todas as contas do banco
    public static void imprimeInfoContas(){
        System.out.println("\nContas do banco:\n");
        for (Conta conta : contas){
            System.out.println("Numero da conta: "+ conta.getNumeroConta());
            System.out.println("Cliente: " + conta.getCliente());
            System.out.println("Saldo: " + conta.getSaldoConta() + "\n");
        }
    }

}
