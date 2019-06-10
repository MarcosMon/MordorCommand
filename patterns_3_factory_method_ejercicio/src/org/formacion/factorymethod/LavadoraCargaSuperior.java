package org.formacion.factorymethod;

public class LavadoraCargaSuperior extends Lavadora {

	public LavadoraCargaSuperior() {
		this.tipoCarga = "superior";
	}

	protected Lavadora creaLavadora() {
		return new LavadoraCargaSuperior();
	}
}
