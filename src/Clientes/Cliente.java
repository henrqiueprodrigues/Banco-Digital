package Clientes;

import Tipo_Contas.Conta;

import java.util.ArrayList;


public abstract class Cliente {

   private final String nome; //Nome do cliente ou impresa
   private  ArrayList<Conta> contas= new ArrayList<>(); //Cria um array statico dinamico que ira guardar as contas do cliente
   private  ArrayList<String> contatos= new ArrayList<>(); //Cria uma lista dinamica com os contatos do cliente


//--------------------- CONSTRUTOR ---------------------------

   public Cliente(String nome){
      this.nome= nome;
   }


//--------------------- GETTERS ------------------------------

   public String getNome() {
      return nome;
   }


//--------------------- METODOS -------------------------------

   //Troca a agencia do conta epecificada
   public void trocarAgencia(Conta conta, int novaAgencia){
      conta.setNumeroAgencia(novaAgencia);
      System.out.println("Agencia trocada para: " + novaAgencia);
   }

   //Adiciona uma nova conta
   public void adicionaConta(Conta conta){
      contas.add(conta);
   }

   //Adiciona um novo meio de contato
   public void adicionaContato(String contato){
      contatos.add(contato);
   }

   //Imprime todos os valores dentro da lista contatos e contas
   public void imprimeInformacoes(){
      System.out.println("\nLista de contatos de " + this.nome + ":");
      for (String contato : contatos){ //Iprime todos os contatos
         System.out.println(contato);
      }
      System.out.println("Contas associadas a " + this.nome + ":"); //Imprime todas as co ntas associadas
      for (Conta conta : contas){
         System.out.println(conta.getNumeroConta());
      }
      System.out.println(""); //Pula uma linha ao final
   }

}
