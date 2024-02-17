package test;

public class Auto {
	String modelo;
	int precio;
    Asiento[] asientos ;
	String marca;
	Motor motor;
	int registro;
	int n_asientos;
	static int cantidadCreados;
  	
	 	int cantidadAsientos() { 
		for(int i=0;i< asientos.length;i++) {
			if (asientos[i]!= null) {	
				n_asientos+=1;
			}
    		  		
		}
		return n_asientos;
	}
	
	 	String verificarIntegridad(){
		String resultado="Auto original";
		if (this.registro== motor.registro ) {
			for(int i=0;i< asientos.length;i++) {
				if (asientos[i]!= null) {	
				 if(asientos[i].registro!=this.registro) {
					 resultado="Las piezas no son originales";
					 break;
				 }
				}
				
		}
		}
		else {
			 resultado="Las piezas no son originales";
		}
		return resultado;	
	}
	
}