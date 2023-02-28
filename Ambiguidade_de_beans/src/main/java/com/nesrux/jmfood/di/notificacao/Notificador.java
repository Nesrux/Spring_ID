package com.nesrux.jmfood.di.notificacao;

import com.nesrux.jmfood.di.modelo.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String mensagem);

}
