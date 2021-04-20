package br.com.bakofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Poupança extends Conta implements PadraoConta{

	public float rendimento;
	
	public void creditarRendimento() {
		float resultado = saldo * rendimento / 100;
		saldo = saldo + resultado;
			
		
	}

	@Override
	public boolean sacar(float valor) {
		float resultado = saldo - valor;
		if (resultado < 0) {
			return false;
		}
		
		saldo = resultado;
		return true;
			
	}

	@Override
	public boolean depositar(float valor) {
        saldo = saldo + valor;
		return true;
	}
	
	
	

}
