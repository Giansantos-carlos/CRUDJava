package entity;

import javax.sql.rowset.CachedRowSet;

public class TesteOne {
	 public static void main(String[] args){
    
		 double C, K, F, Ra, Re;
		 String ri;
		 C = 2.43;
		 
		 F = C * 1.8 + 32;
	     K = C + 273.15;
	     Ra = C * 1.8 + 32 + 459.67;
	     Re = C * 0.8;
	     ri = "Gian";

	        System.out.println("A temperatura em Fahrenheit é: " + F);
	        System.out.println("A temperatura em Kelvin é: " + K);
	        System.out.println("A temperatura em Reaumur é: " + Ra);
	        System.out.println("A temperatura em Rankine é: " + Re);
	        System.out.println("A temperatura em Rankine é: " + ri);
	        
	        if (C < 1) {
	        	System.out.println("acertou");
			}else {
				System.out.println("Errou"); 
			}
	       
	 }


}



