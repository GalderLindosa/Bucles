package ejerciciosbucle;
import java.util.Scanner;
public class Ejercicio5bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Int->String->length
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("intro num:");
		num = teclado.nextInt();
		System.out.print("el numero de digitos es "+String.valueOf(num).length());

		teclado.close();
	}

}
