package org.lasencinas.procesador;

import org.lasencinas.interfaces.PedidoPeligroso;
import org.lasencinas.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

	PedidoPeligroso pedidoConPeligro = null;
	public TratamientoPedidoPeligroso(PedidoPeligroso pedidoConPeligro) {
		
		this.pedidoConPeligro = pedidoConPeligro;
		
	}

	@Override
	public boolean tratar() {
		
		if(pedidoConPeligro.instrucciones() != "no ponerselo en el dedo") {
			return true;
		}
		return false;
	}

}
