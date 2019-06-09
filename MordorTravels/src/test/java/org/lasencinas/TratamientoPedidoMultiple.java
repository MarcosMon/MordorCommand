package org.lasencinas;

import java.util.List;

import org.lasencinas.interfaces.Pedido;
import org.lasencinas.interfaces.TratamientoPedido;

public class TratamientoPedidoMultiple implements TratamientoPedido {

	List<Pedido> pedidos = null;
	int totalBultos = 0;
	int pesoTotal = 0;

	public TratamientoPedidoMultiple(List<Pedido> pedidos) {

		this.pedidos = pedidos;
	}

	public void calcularTotalBultos() {

		totalBultos = pedidos.size();
	}

	public int getNumBultos() {
		return totalBultos;
	}

	public void calcularPesoTotal() {
		for (int i = 0; i < pedidos.size(); i++) {
			pesoTotal += pedidos.get(i).peso();
		}

	}

	public int getPesoTotal() {
		return pesoTotal;
	}

	@Override
	public boolean tratar() {

		if (pesoTotal != 0 && totalBultos == pedidos.size()) {
			return true;
		} else {
			return false;
		}
	}

}
