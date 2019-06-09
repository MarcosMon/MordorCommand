package org.lasencinas.pedidos;

import java.util.UUID;

import org.lasencinas.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

	private String destino = null;
	private String instrucciones = null;
	private UUID id = UUID.randomUUID();
	public PedidoPeligrosoOrden(String destino, String instrucciones) {
		
		this.destino = destino;
		this.instrucciones = instrucciones;
	
	}
	@Override
	public String destino() {

		return this.destino;
	}
	@Override
	public int peso() {
		return 0;
	}
	@Override
	public String instrucciones() {
		return this.instrucciones;
	}
	public String getId() {
		return id.toString();
	}



}
