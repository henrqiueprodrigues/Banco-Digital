### Desafio Banco Digital

Nesse repositorio se encontra o Código do desafio Criando um Banco Digital com Java e Orientação a Objetos.

## Implementações adicionais:

- ### Banco:
	- Adicionado um array dinamico para guardar todas as contas criadas.
	- Adicionado um método para, ao mesmo tempo, adicionar a conta a lista de contas do banco e do cliente.
	- Adicionado um método que imprime todos as contas dentro do array, informando seu numero, cliente e saldo.

- ### Conta:
	- Adicionado um objeto cliente a sues componentes.
	- Reformulado método getCliente de forma a retornar o nome do cliente ao inves da indentificação da referencia.
	- Adicionado método setAgencia para possibilitar a troca de agencia pelo cliente.
	- Adicionado método verificaValor que checa se o valor para um saque ou transferencia excede o saldo da conta.

- ### ContaPoupanca:
	- Adicionado diaAniversario aos seus componentes, onde é guardado o dia que o rendimenro mensal deve ser aplicado.
	- Adicionado taxaJuros aos seus componente, onde é guardado a taxa de rendimento da conta.
	- Modificado o construtor para guardar o dia de criação da conta como o diaAniversario.
	- Criação de get e set da taxa juros para fornecer a taxa a os metodos e modificala com base na taxa SELIC.
	- Criação do método adicionaJuros, que verifica se o dia atual é iagual ao diaAniversario e adiciona o rendimento caso seja.

- ## Cliente:
	- Adicionado dois arrrays dinamico para guardar as contas de cada cliente e as suas formas de contato.
	- Adicionado método trocarAgencia que permite o cliente transferir sua conta para outra agencia.
	- Adicionado método adicionaConta e adicionaContato para prencher os arrays dinamicos.
	- Adicionado método imprimeInformacoes que imprime todos os valores dos arrays dinamicos

- ## **Nova classe** PessoaFisica:
	- Extende cliente, porem adicona-se o CPF a suas caracteristicas e seu construtor.

- ## **Nova classe** PessoaJuridica:
	- Extende cliente, porem adicona-se o CNPF a suas caracteristicas e seu construtor.	
