package com.nesrux.jmfood.di.notificacao;

import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;




@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
	public NotificadorEmail() {
		System.out.println("Notificador Real: ");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
