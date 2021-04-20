package br.com.bankofoz.implementa��o;

import java.util.Scanner;

import br.com.bakofoz.beans.Conta;
import br.com.bankofoz.bo.ContaBO;

public class ImplementarConta {
	
		
	
	public static void main(String[] args) {
		System.out.println("O que voce deseja cadastrar ? / 1 - Conta Corrente / 2- Conta Poupan�a");
		Scanner leitor = new Scanner(System.in);
		
		int valorDigitado = leitor.nextInt();
		System.out.println ("Digite o nome do cliente");
		String nomedoCliente = leitor.next();
		System.out.println("Digite a ag�ncia...");
		short agencia = leitor.nextShort();
		System.out.println ("Digite o n�mero da conta...");
		short numero = leitor.nextShort();
		
		ContaBO contaBO = new ContaBO();
		contaBO.adicionarConta(nomedoCliente, agencia, numero);
		
		System.out.println ("Deseja consultar alguma conta ?");
		short numeroConta = leitor.nextShort();
		Conta resultado = contaBO.consultarConta(numeroConta);
		System.out.println(resultado.numero + " -- " + resultado.cliente.nome);
		
		leitor.close();
	    
	}
}
