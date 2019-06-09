package org.lasencinas.procesador;

import org.lasencinas.interfaces.TratamientoPedido;
import org.lasencinas.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {
	
	private  PedidoInternacional pedidoInt  = null;

	public TratamientoPedidoInternacional(PedidoInternacional pedidoInt) {
		this.pedidoInt = pedidoInt;
	}

	@Override
	public boolean tratar() {
		
		if(this.pedidoInt.destino() != "Mordor") {
			
			return true;
			
		}
		return false;
	}

}
