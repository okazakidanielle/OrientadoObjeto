package br.com.bakofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Conta implements PadraoConta {
	
	
	public short numero;
	public byte digito;
	public short agencia;
	public float saldo;
	public Cliente cliente;
	
	public boolean depositar(float valor) {
		return true;
	}
	
	public boolean sacar(float valor ) {
		return true;
	}
	
	public float verificarSaldo() {
		if (this instanceof Poupança) {
			return saldo;
			
			
			}
		return 0;	
		
	}
	
	
}
	
