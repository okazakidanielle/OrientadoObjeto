package br.com.bakofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Corrente extends Conta implements PadraoConta{
	
	public float limite;
    public float taxa;
    
    public boolean sacar(float valor) {
    	return true;
    }
    
    public void debitarTaxa() {
    	saldo = saldo - taxa;
    }
    
    public void aumentarLimite(float porc) {
    	float resultado = limite * porc / 100;
		limite = limite + resultado;
    }

	@Override
	public boolean depositar(float valor) {
		
		return false;
	}
	
	public float verificarSaldo() {
				return saldo + this.limite;
			}
			
}
