package br.com.bankofoz.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bakofoz.beans.Conta;

public class ContaDAO {

	public List<Conta> contas = new ArrayList<>();
	
	public Conta adicionarConta (Conta conta) {
		this.contas.add(conta);
		return conta;
	}
	
	public Conta consultarConta (int numero) {
		Conta resultado = null;
		for (Conta conta : contas) {
			if (conta.numero == numero) {
				resultado = conta;
			}
		}
		
		return resultado;
	}
	

}
