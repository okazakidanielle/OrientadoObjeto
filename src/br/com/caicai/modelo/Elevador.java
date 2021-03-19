package br.com.caicai.modelo;

public class Elevador {
	
	private String nome;
	private int maximoPessoas;
	private int andarMaximo;
	private int andarMinimo;
	private int andarAtual;
	private int qtdePessoas;
	
	
	public String descer() {
		if (andarAtual>andarMinimo){
		   andarAtual-=1;
		   return "Descendo";
		   
	   }		
	       return "N�o foi poss�vel descer";   
		
	}
	
	public String descer(int andar) {
		if((andarAtual-andar)>=andarMinimo) {
			andarAtual -= andar;
			return "Descendo";
			
		}
		   return "N�o foi poss�vel";
	}
	
	public String subir(int andar) {
		if ((andarAtual+andar)<=andarMaximo) {
			andarAtual+=andar;
			return "Subindo";
			
		}
		   return "N�o foi poss�vel";
	}
	
	
	public void sair () {
		if (qtdePessoas>0) {
			qtdePessoas-=1;
		}
	}
	
	public void entrar() {
		if (qtdePessoas < maximoPessoas) {
			qtdePessoas = qtdePessoas+1;
	   }
	}
	
	@Override
	public String toString() {
		return "Elevador [nome=" + nome + ", maximoPessoas=" + maximoPessoas + ", andarMaximo=" + andarMaximo
				+ ", andarMinimo=" + andarMinimo + ", andarAtual=" + andarAtual + ", qtdePessoas=" + qtdePessoas + "]";
	}
	
	public void inicializar(String pNome, int pMaximoPessoas, int pAndarMaximo, int pAndarMinimo) {
		nome = pNome;
		maximoPessoas = pMaximoPessoas;
		andarMaximo = pAndarMaximo;
		andarMinimo = pAndarMinimo;

		
		
	}

}
