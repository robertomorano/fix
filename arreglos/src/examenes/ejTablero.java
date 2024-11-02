package examenes;

import java.util.Scanner;

public class ejTablero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		n = sc.nextInt();
		// le da alutra
		for (int k = 0; k < n * 4; k++) {
			// se encarg de repetir la secuencia
			if (k % 2 == 0) {
				for (int j = 0; j < n * 2; j++) {
					for (int i = 0; i < n; i++) {
						System.out.print(" ");
					}
					for (int i = 0; i < n; i++) {
						System.out.print("*");
					}
				}
				System.out.println();
				for (int j = 0; j < n * 2; j++) {
					for (int i = 0; i < n; i++) {
						System.out.print(" ");
					}
					for (int i = 0; i < n; i++) {
						System.out.print("*");
					}
				}
			} else {
				for (int j = 0; j < n * 2; j++) {
					for (int i = 0; i < n; i++) {
						System.out.print("*");
					}
					for (int i = 0; i < n; i++) {
						System.out.print(" ");
					}
				}
				System.out.println();
				for (int j = 0; j < n * 2; j++) {
					for (int i = 0; i < n; i++) {
						System.out.print("*");
					}
					for (int i = 0; i < n; i++) {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}
