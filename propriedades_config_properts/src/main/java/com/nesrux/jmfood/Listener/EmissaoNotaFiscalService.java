package com.nesrux.jmfood.Listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.service.ClienteAtivadoEvent;
@Component
public class EmissaoNotaFiscalService {

	@EventListener
	public void cliebteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo uma nota fiscal para o cliente "+
				event.getCliente().getNome());
	}

}
