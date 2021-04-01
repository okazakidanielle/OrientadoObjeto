package br.com.lojaabc.implementacao;

import br.com.lojaabc.modelo.Cliente;
import br.com.lojaabc.modelo.PessoaFisica;
import br.com.lojaabc.modelo.PessoaJuridica;

public class ImplementarCliente2 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente ();
		char resposta = Magica.s("Digite F ou J").charAt(0);
		
		if (resposta=='F') {
			cliente = new PessoaFisica(
					"Nome da PF", 
					"email da PF", 
					"12345678",
					"123456",
					"123456x"				
					);
		}else if (resposta=='J') {
			cliente = new PessoaJuridica(
					"Nome da PJ", 
					"email da PJ", 
					"12345678",
					"1234560001",
					"cnae"
					);
		}else {
			System.out.println("Op��o inv�lida");
		}
		
		System.out.println(cliente.getResumo());
		System.out.println(cliente.exibirDocumentacoes());
		

	}
        
	
}



/*
* Polimorfismo: � o recurso onde um objeto ou m�todo pode conter v�rias formas
* utilizando o mesmo nome.
* M�todos:
* 1� Override (sobrescrita): temos dois m�todos em classes diferentes (pai e filha)
* e o m�todo da filha ter� prioridade (os par�metros n�o precisam ser os mesmos)
* 2� Overload (sobrecarga): temos dois m�todso com o mesmo nome na mesma classe.
* Nesse caso os m�todos devem possuir par�metros distintos obrigatoriamente.
* Objeto:
* Ocorre quando o objeto � criado pelo pai e instanciado pelo filho. Exemplo:
* Cliente cliente = new PessoaFisica();
*/