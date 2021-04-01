package br.com.lojaabc.modelo;

import br.com.lojaabc.lib.PadraoPessoas;

public class PessoaFisica extends Cliente implements PadraoPessoas{

	private String cpf;
	private String rg;
	
		
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, String email, String fone, String cpf, String rg) {
		super.setAll(nome, email, fone);
		this.cpf = cpf;
		this.rg = rg;
	}
	@Override
	public String toString() {
		return "PessoaFísica [cpf=" + cpf + ", rg=" + rg + ", toString()=" + super.toString() + "]";
	}
	
	
	public PessoaFisica(String cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
		
		
	}

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return super.getNome() + "\n" + cpf;
	}
	
	
}
