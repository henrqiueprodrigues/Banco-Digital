import Clientes.*; //importa todas as classes do pacote clientes
import Tipo_Contas.*; //importa todas as classes do pacote contas

public class Main {
    public static void main(String[] args) {

        //Cria uma conta e a associa a Jeferson
        Cliente Jeferson= new PessoaFisica("Jeferson", "12345678910");
        Conta conta1= new ContaCorrente(Jeferson);
        Banco.adicionaConta(conta1,Jeferson); //Adiciona a conta ao banco de dados do banco e a lista de contas de Jeferson
        Jeferson.adicionaContato("Jeferson@gmail.com");
        Jeferson.adicionaContato("(11) 99999-0000");

        //Cria uma segunda conta e a associa ao nome GFT
        Cliente GFT= new Pessoajuridica("GFT", "12345678901234");
        Conta conta2= new ContaCorrente(GFT);
        Banco.adicionaConta(conta2,GFT);


        //Cria uma terceira conta e a associa a jeferson
        ContaPoupanca conta3= new ContaPoupanca(Jeferson);
        Banco.adicionaConta(conta3,Jeferson);

        //Deposita valores naa contas
        conta1.deposito(500);
        conta2.deposito(10000);

        //Faz tranferencia entre contas
        conta2.transferencia(conta1,200);
        conta1.transferencia(conta3,300);

        //Saca os valores
        conta1.saque(200);
        conta1.saque(500);

        //Adiciona o rendimento mensal a conta poupança
        conta3.adicionaJuros(0.03);

        //Imprime as infomações dos clientes
        Jeferson.imprimeInformacoes();
        GFT.imprimeInformacoes();

        //Imprime as informações das contas dos bancos
        Banco.imprimeInfoContas();
    }

}
