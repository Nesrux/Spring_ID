package com.nesrux.jmfood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SemUrgencia)
@Component
public class NotificadorEmail implements Notificador {

	@Autowired
	private NotificadorProperts properties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);

		System.out.println("Host: " + properties.getHostServidor());
		System.out.println("Porta: " + properties.getPortaServidor());
	}

}
