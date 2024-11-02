package examenes;
import java.util.Scanner;
public class Ej4 {
	public static void main(String[] args) {
		//Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
		 int n=0;
		 boolean primo=true;
		 int cont=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Dme un numero");
		 n = sc.nextInt();
		 for(int i=1;i<=n;i++) {
			 primo=true;
			 for(int j=2;j<i;j++){
				 if ((i%j)==0) {
					 primo=false;
				 }
			 }
			 if (primo){
				 cont++;
			 }		 	 
		 }
		 System.out.println("Hay "+cont+" desde 0 hasta "+n);
	}

}
