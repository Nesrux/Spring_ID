package com.nesrux.jmfood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;

@Component()
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher disparadorEvento;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		//Padrão observer
		
		disparadorEvento.publishEvent(new ClienteAtivadoEvent(cliente));
	}


}
