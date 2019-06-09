package org.lasencinas.pedidos;

import java.util.UUID;

import org.lasencinas.interfaces.Pedido;

public class PedidoNacional implements Pedido {
	
	private String destino = null;
	private int peso = 0;
	private UUID id = UUID.randomUUID();

	public PedidoNacional(String destino, int peso) {
		
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
	@Override
	public String getId() {
		return id.toString();
	}
	
	

}
