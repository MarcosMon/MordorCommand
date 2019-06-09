package org.lasencinas.pedidos;

import java.util.UUID;

import org.lasencinas.interfaces.Pedido;

public class PedidoInternacional implements Pedido {

	private String destino = null;
	private int peso = 0;
	private UUID id = UUID.randomUUID();

	public PedidoInternacional(String destino, int peso) {
		this.destino = destino;
		this.peso = peso;

	}

	@Override
	public String destino() {

		return this.destino;
	}

	@Override
	public int peso() {

		return this.peso;
	}
	
	public String getId() {

		return id.toString();
	}

}
