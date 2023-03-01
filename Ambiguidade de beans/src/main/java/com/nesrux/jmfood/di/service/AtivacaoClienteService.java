package com.nesrux.jmfood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nesrux.jmfood.di.modelo.Cliente;
import com.nesrux.jmfood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private List<Notificador> notificadores;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		for (Notificador notificador : notificadores) {
			if (notificador != null) {
				notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
			} else {
				System.out.println("Não existe notificador, mas cliente foi ativado");
			}
		}
	}
}
