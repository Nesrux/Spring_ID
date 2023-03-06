package com.nesrux.jmfood.di.service;

import com.nesrux.jmfood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	@SuppressWarnings("unused")
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	

	
}
 