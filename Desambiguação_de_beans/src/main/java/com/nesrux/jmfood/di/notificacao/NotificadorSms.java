package com.nesrux.jmfood.di.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;
@Primary
@Component
public class NotificadorSms implements Notificador {
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do Telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(),
				mensagem);

	}

}
