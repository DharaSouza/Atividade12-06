package Matriz;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int m[][] = new int [4][4];

		for (int x=0; x<4;  x++) {

	    for (int y=0; y<4; y++) {

		m[x][y] = (int)Math.round(Math.random()*100);

			}
		}

		for (int x=0;  x<4;  x++) {

		for (int y=0; y<4; y++) {

		if (x == y) {

		System.out.println("[" + m[x][y] + "]");

				}
		else {

		m[x][y] = 0;

		System.out.println("[" + m[x][y] + "]");

				}

			}

		System.out.println("\n------------");

		}

		ler.close();
	}

}

