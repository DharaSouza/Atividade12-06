package Matriz;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int armazena;
		
		int m[][] = new int [5][5];
		
		for (int x=0;  x<5;  x++) {
			
		for (int y=0; y<5; y++) {
			
		armazena  = (int)Math.round(Math.random()*100);

		if (armazena %2 == 0) {
			
		m[x][y] = armazena;
		
		}
		
		else {
			
		y = 0;
		
		         }
		
			}
		
		}
		
		for (int x=0;  x<5;  x++) {
			
		for (int y=0; y<5; y++) {
			
		System.out.println("Os valores são:" + m[x][y]);
		
			}
		
		ler.close();
		
		}
		
	}

}