package org.formacion.factorymethod;

public abstract class LavadoraFactoria {

	public Lavadora crea() {
		Lavadora lavadora = creaLavadora();

		lavadora.ponerTambor();
		lavadora.ponerMandos();

		return lavadora;
	}

	protected abstract Lavadora creaLavadora();

}
