package Github2;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions
		//Failed if they scored 3 or less
		//Insufficient if they scored > 3 but less than 5. (5 included)
		//Good if they scored > 5 but less than 8. (8 included)
		//Excellent Grade if they scored 10.
		//if participants enter a negative number or a number outside the range supported (outside 0 - 10)
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa el valor de la nota: ");
		int nota = entrada.nextInt();
		
		if(nota >=0 && nota <= 3) {
			System.out.print("Failed");
		} else if(nota >3 && nota<=5) {
			System.out.print("Insufficient");
		}else if(nota >5 && nota<=8){
			System.out.print("Good");
		}else if(nota>8 && nota<=10) {
			System.out.print("Excellent");
		}else {
			System.out.print("Nota invalida");
		}
		
	}
}
