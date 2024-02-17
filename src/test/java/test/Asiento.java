package Sobre_el_auto;

public class Asiento {
	static String color;
    int precio;
    int registro;
    
    static void cambiarColor(String x){
   	 String[] Juan= {"rojo","verde","amarillo","negro","blanco"};
   	 
   	 for (int i=0;i<5;i++){
   		 if (Juan[i]==x) {
   		    color=x;
       }
     }
  }
}
