package br.com.concessionariaXYZ.teste;

import br.com.concessionariaXYZ.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		
		objeto.preencherCor("azul");
		objeto.preencherMontadora("ford");
		objeto.preencherValor(15000);
		
		
		System.out.println(objeto.retornarCor());
		System.out.println(objeto.retornarMontadora());
		System.out.println(objeto.retornarValor());
		System.out.println("Usando o toString");
		System.out.println(objeto.toString());
		
		System.out.println("Desconto 10% : " + objeto.retornarDesconto());
		System.out.println("Desconto X% : " + objeto.retornarDesconto(20));
		
		

	}

}
