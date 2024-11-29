package ejerciciosbucle;
import java.util.Scanner;
public class Ejercicio8bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, opcion, edad;
		String username;
		String password;
		String nombre;
		String dni;
	
		System.out.print("Introduce tu usuario:");
		username = teclado.next();
		System.out.print("Introduce tu dni:");
		dni = teclado.next();
		System.out.print("Introduce tu nombre y apellido:");
		nombre = teclado.next();
		System.out.print("Introduce tu edad:");
		edad = teclado.nextInt();
		if(edad>=18) {
			System.out.println("Bienvenido");
		}else {
			System.out.println("Tienes que tener más de 18 años");
			
		}
		System.out.println("Menu inicial");
		System.out.println("1. Comprar libro");
		System.out.println("2. Comprar si hay stock");
		System.out.println("3. Salir del programa");
		opcion = teclado.nextInt();
		switch(opcion){
		
		case 1:
			System.out.println("Introduce el primer numero");
			num1 = teclado.nextInt();
			System.out.println("Introduce el segundo numero");
			num2 = teclado.nextInt();
			
			System.out.println("1.Sumar");
			System.out.println("2.Terminar programa");
			opcion = teclado.nextInt();
			
			switch(opcion){
			
			case 1: 
				System.out.println(num1 + " + "+num2 +"= "+(num1+num2));
			break;

		
	}

}
		teclado.close();
}
	}