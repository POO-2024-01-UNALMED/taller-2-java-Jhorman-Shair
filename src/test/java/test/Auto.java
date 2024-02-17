package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos(){
		int x=0;
		for (int i=0;i<asientos.length;i++) {
			if (asientos[i]!=null){
				x+=1;
			}
			return x;
	     }
	}
	String verificarIntegridad(){
		String resultado;
		if(registro==motor.registro) {
			resultado="Auto original";
		}else{	
			resultado="Las piezas no son originales";
		}
		if (resultado=="Auto original") {
			for (int i=0;i<asientos.length;i++) {
				if (asientos[i]!=null){
					if (asientos[i].registro!=registro) {
						resultado="Las piezas no son originales";
						break;
					}
				}	
		}
	}
		return resultado;
  }
}