package org.lasencinas.procesador;

import org.lasencinas.enumType.EstadoPedido;
import org.lasencinas.interfaces.Pedido;
import org.lasencinas.interfaces.Procesador;
import org.lasencinas.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

	@Override
	public boolean procesa(TratamientoPedido pedidoInt) {

		return pedidoInt.tratar();
	}

	public String printarStatus(boolean estado, Pedido pedido) {
		
		if(estado) {
			return pedido.destino() + " " + EstadoPedido.ACEPTADO;
		}
		 return pedido.destino() + " " + EstadoPedido.RECHAZADO;
	}

}
