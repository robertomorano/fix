package examenes;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		// Realiza un programa que nos diga si un número introducido por teclado es capicúa o no. El número debe ser mayor o igual que 0.
		 int n=0;
		 int nMod=0;
		 int pont=0;
		 boolean capicua=true;
		 int cont=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Dame un numero");
		 n = sc.nextInt();
		 nMod=n;
		while (nMod>9) {
			nMod/=10;
			cont++;

		}
	}
}
