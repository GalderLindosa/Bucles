package Gestordenotas;
import java.util.Scanner;
public class gestionarnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String username;
		String password;
		String nombre;
		Boolean seguir=true;
		while(seguir)
		{
			System.out.println("Introduce tu usuario");
			username = teclado.next();
			System.out.println("Introduce tu contraseña");
			password = teclado.next();
			if (password.indexOf('e') != -1 || password.indexOf('E') !=-1) {
				System.out.println("ERROR: la contraseña no puede contener la letra e. Intentalo de nuevo.");
				
			}else 
			{
				System.out.println("Usuario y contraseña aceptados");
				seguir=false;
				
				
			}
		}		
			
		System.out.println("--------------------------------------");
		System.out.println("Introduzca su nombre y apellido: ");
		nombre = teclado.next();
		
		double[] examenes = new double[3];
        for (int i = 0; i < 3; i++) {
        do {
        System.out.print("Ingrese la nota del examen parcial " + (i + 1) + " (0-10): ");
        examenes[i] = teclado.nextDouble();
        } while (examenes[i] < 0 || examenes[i] > 10);
        }

       
        double notaUltimoExamen;
        do {
        System.out.print("Ingrese la nota del último examen (0-10): ");
        notaUltimoExamen = teclado.nextDouble();
        } while (notaUltimoExamen < 0 || notaUltimoExamen > 10);

       
        double notaUltimoTrabajo;
        do {
        System.out.print("Ingrese la nota del último trabajo (0-10): ");
        notaUltimoTrabajo = teclado.nextDouble();
        } while (notaUltimoTrabajo < 0 || notaUltimoTrabajo > 10);

       
        double mediaExamenes = (examenes[0] + examenes[1] + examenes[2]) / 3;

       
        double notaFinal = (mediaExamenes= 0.55) + (notaUltimoExamen= 0.30) + (notaUltimoTrabajo * 0.15);

        System.out.println("La nota final de " + nombre + "es" + notafinal+ "");//Arreglar



		
		teclado.close();
	}
}			
		
		
		

