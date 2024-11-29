package ejerciciosbucle;
import java.util.Scanner;
public class Ejercicio7bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, opcion;
		//Esto se tiene que repetir en bucle cada vez que escogamos una opción
		System.out.println("Menu inicial");
		System.out.println("1. Operaciones básicas");
		System.out.println("2. Operaciones complejas");
		System.out.println("3. Terminar el programa");
		opcion = teclado.nextInt();
		//hasta aqui
		switch(opcion){
			
		case 1:
			System.out.println("Introduce el primer numero");
			num1 = teclado.nextInt();
			System.out.println("Introduce el segundo numero");
			num2 = teclado.nextInt();
			
			System.out.println("1.Sumar");
			System.out.println("2.Resta");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("¿Que opción quieres?");
			opcion = teclado.nextInt();
			
			switch(opcion){
			
			case 1: 
				System.out.println(num1 + " + "+num2 +"= "+(num1+num2));
			break;
			case 2: 
				System.out.println(num1-num2);
			break;
			case 3:
				System.out.println(num1*num2);
			break;
			case 4: 
				System.out.println(num1/num2);
			break;
			
			}
		break;
		case 2: 
			System.out.println("Introduce el primer numero");
			num1 = teclado.nextInt();
			System.out.println("1.Potencias");
			System.out.println("2.Raíz cuadrada");
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1: 
				System.out.println("Introduce la potencia:");
				num2 = teclado.nextInt();
				System.out.println(Math.pow(num1, num2));
			break;
			case 2: 
				System.out.println("La raiz cuadrada es:");
				System.out.println(Math.sqrt(num1));
		break;
		
			case 3: 
				System.out.println("El programa se ha finalizado");
		break;
		
		
		}
	}
		teclado.close();
}
}