package br.com.lojaabc.modelo;

import br.com.lojaabc.lib.PadraoPessoas;

public class Cliente implements PadraoPessoas{
	
	private String nome;
	private String email;
	private String fone;
	
	public String exibirDocumentacoes() {
		return null;
	}
	
	public void setAll(String nome, String email, String fone) {
		
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		
		
	}
	public String getNome() {
		
		
		return nome;
			
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Cliente(String nome, String email, String fone) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	public Cliente() {
		super();
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + "]";
	}
	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return nome;
	}
	

}
