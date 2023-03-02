package com.nesrux.jmfood.di.modelo;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	@SuppressWarnings("unused")
	private boolean ativo;

	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public void ativar() {
		ativo = true;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;

	}
}
