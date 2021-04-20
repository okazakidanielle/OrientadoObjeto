package br.com.bankofoz.bo;

import br.com.bakofoz.beans.Cliente;
import br.com.bakofoz.beans.Conta;
import br.com.bankofoz.dao.ContaDAO;

public class ContaBO  {
	
	public ContaDAO contaDAO = new ContaDAO();
	

	public String adicionarConta (String nomeCliente, short agencia, short numero) {
		if (nomeCliente == null || nomeCliente.length() <= 5) {
			return "O nome do cliente n�o pode ficar em branco e ter menos que 5 caracteres";	
		}
		
		if (agencia == 0) {
			return "O n�mero da ag�ncia n�o pode ser zero.";
			
		}
			
		if (numero <= 0) {
			return "O n�mero deve ser maior que zero.";
		}
		
		Cliente cliente = new Cliente();
		cliente.nome = nomeCliente;
		
		Conta conta = new Conta();
		conta.agencia = agencia;
		
		conta.cliente = cliente;
		conta.numero = numero;
		
		this.contaDAO.adicionarConta(conta);
		return "Conta adicionada";
			
	}
	
	public Conta consultarConta (int numero) {
		Conta conta = null;
		if (numero > 0) {
			conta = contaDAO.consultarConta(numero);
			
		}
		
		return conta;
	}
	

}

	


