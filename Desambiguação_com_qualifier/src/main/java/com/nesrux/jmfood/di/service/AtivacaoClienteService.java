package com.nesrux.jmfood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;
import com.nesrux.jmfood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Qualifier("sms")
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

	}

}
