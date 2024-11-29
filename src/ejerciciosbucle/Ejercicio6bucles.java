package ejerciciosbucle;
import java.util.Scanner;
public class Ejercicio6bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota1,nota2,note3;
		int aprobado;
		System.out.println("Introduce la primera nota");
		nota1 = teclado.nextDouble();
		while(nota1<0 || nota1>10) {
			System.out.println("Error");
			System.out.println("introduce la primera nota");
			nota1 = teclado.nextDouble();
		}if(nota1>5) {
			aprobado++;
			//falta nota 2 y nota 3
		}
		System.out.println("La media es"+((nota1+nota2+nota3)/3));
		System.out.println("Aprobados"+ aprobado);	
		System.out.println("Suspenso"+(3-aprobado));
	
	}

}
