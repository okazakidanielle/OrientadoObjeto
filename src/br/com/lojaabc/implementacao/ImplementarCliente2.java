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
			System.out.println("Opção inválida");
		}
		
		System.out.println(cliente.getResumo());
		System.out.println(cliente.exibirDocumentacoes());
		

	}
        
	
}



/*
* Polimorfismo: é o recurso onde um objeto ou método pode conter várias formas
* utilizando o mesmo nome.
* Métodos:
* 1º Override (sobrescrita): temos dois métodos em classes diferentes (pai e filha)
* e o método da filha terá prioridade (os parâmetros não precisam ser os mesmos)
* 2º Overload (sobrecarga): temos dois métodso com o mesmo nome na mesma classe.
* Nesse caso os métodos devem possuir parâmetros distintos obrigatoriamente.
* Objeto:
* Ocorre quando o objeto é criado pelo pai e instanciado pelo filho. Exemplo:
* Cliente cliente = new PessoaFisica();
*/