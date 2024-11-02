package examenes;

import java.util.Scanner;

public class ejHexagono {

	public static void main(String[] args) {
		 int n;
		 int limite2=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Dame un numero");
		 n = sc.nextInt();
		 int limite=n;
		 limite2=n;
		 for (int i=0;i<(n);i++) {
			 for(int j=limite2;j>0;j--) {
				 System.out.print(" ");
			 }
			 for (int j=0;j<limite;j++) {
				 System.out.print("*");
			 }
			 limite += 2;
			 limite2--;
			 System.out.println(""); 
		 }
		// System.out.println(limite);
		// System.out.println(limite2);
		 limite-=4;
		 limite2=2;
		 for (int i=0;i<(n-1);i++) {
			 for(int j=0;j<limite2;j++) {
				 System.out.print(" ");
			 }
			 for (int j=limite;j>0;j--) {
				 System.out.print("*");
			 }
			 limite -= 2;
			 limite2++;
			 System.out.println(""); 
		 }
		 
	}

}
