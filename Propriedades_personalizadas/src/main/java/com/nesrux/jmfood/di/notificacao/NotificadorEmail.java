package com.nesrux.jmfood.di.notificacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SemUrgencia)
@Component
public class NotificadorEmail implements Notificador {

	@Value("{$notificador.email.host-servidor}")
	private String host;
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
		System.out.println(host);
		System.out.println(porta);
	}

}
