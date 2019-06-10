package org.formacion.factorymethod;

public class LavadoraCargaFrontal extends Lavadora {

     public LavadoraCargaFrontal() {
    	    this.tipoCarga = "frontal";
     }
     
     protected Lavadora creaLavadora() {
    	 return new LavadoraCargaFrontal();
     }
	
}
