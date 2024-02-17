package test;

public class Asiento {
	String color;
    int precio;
    int registro;
    
    void cambiarColor(String x){
   	 String[] tipos= {"rojo","verde","amarillo","negro","blanco"};
   	 
   	 for (int i=0;i<5;i++){
   		 if (tipos[i]==x) {
   		    color=x;
       }
     }
  }
}
