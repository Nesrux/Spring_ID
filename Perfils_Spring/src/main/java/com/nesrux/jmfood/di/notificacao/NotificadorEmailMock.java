package com.nesrux.jmfood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;


@TipoDoNotificador(NivelUrgencia.URGENTE)
@Profile("Mock")
@Component
public class NotificadorEmailMock implements Notificador {

	public NotificadorEmailMock() {
		System.out.println("notificador mock");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}

}
