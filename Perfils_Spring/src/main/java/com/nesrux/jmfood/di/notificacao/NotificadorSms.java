package com.nesrux.jmfood.di.notificacao;

import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SemUrgencia)
//@Component
public class NotificadorSms implements Notificador {
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do Telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(),
				mensagem);

	}

}
