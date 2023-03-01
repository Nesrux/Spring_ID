package com.nesrux.jmfood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;
import com.nesrux.jmfood.di.notificacao.NivelUrgencia;
import com.nesrux.jmfood.di.notificacao.Notificador;
import com.nesrux.jmfood.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SemUrgencia)
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

	}

}
