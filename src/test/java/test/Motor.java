package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int x){
		registro=x;
	}
	
	void asignarTipo(String y){
		String[] tipos= {"electrico","gasolina"};
		for (int i=0;i<2;i++){
			if(tipos[i]==y){
				tipo=y;
			}
		}
	}
}
