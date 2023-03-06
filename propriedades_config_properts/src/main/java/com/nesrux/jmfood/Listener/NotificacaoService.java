package com.nesrux.jmfood.Listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.notificacao.NivelUrgencia;
import com.nesrux.jmfood.di.notificacao.Notificador;
import com.nesrux.jmfood.di.notificacao.TipoDoNotificador;
import com.nesrux.jmfood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	@TipoDoNotificador(NivelUrgencia.SemUrgencia)
	@Autowired
	private Notificador notificador;

	@EventListener
	public void cliebteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro  do email está ativo");
	}

}
