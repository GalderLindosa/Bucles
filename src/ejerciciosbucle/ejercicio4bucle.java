package ejerciciosbucle;
import java.util.Scanner;
public class ejercicio4bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
    	double factorial = 1;
    	Scanner teclado = new Scanner(System.in);
   	 
    	do {  
        	System.out.print("Introduce un numero entero >= 0: ");
        	n = teclado.nextInt();
    	} while (n < 0);

   	 
    	for (int i = 1; i <= n; i++) {
        	factorial = factorial * i;
    	}
   	 
    	System.out.printf("%d! = %.0f %n", n, factorial);	 
   	 
    	teclado.close();


	}

}
