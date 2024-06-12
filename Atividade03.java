package Matriz;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
	
		int a[][] = new int [3][3];
		
		int b[][] = new int [3][3];
		
		int c[][] = new int [3][3];
		
		for (int x=0; x<3;  x++) {

	    for (int y=0; y<3; y++) {
		    
			 a [x][y] = (int)Math.round(Math.random()*100);
			 b [x][y] = (int)Math.round(Math.random()*100);
			 c [x][y] += a[x][y]*b[x][y];

		}
		
    	}
		for (int x=0; x<3;  x++) {

	    for (int y=0; y<3; y++) {
	    	System.out.println("Matriz A");
	    	System.out.println("["+a[x][y]+"]");
	    }
			    System.out.println("\n------------");
		
		}
		for (int x=0; x<3;  x++) {

		    for (int y=0; y<3; y++) {
		    	System.out.println("Matriz B");
		    	System.out.println("["+b[x][y]+"]");
		    }
				    System.out.println("\n------------");
}
		for (int x=0; x<3;  x++) {

		    for (int y=0; y<3; y++) {
		    	System.out.println("Matriz C");
		    	System.out.println("["+c[x][y]+"]");
		    }
				    System.out.println("\n------------");
}}
			 
}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 