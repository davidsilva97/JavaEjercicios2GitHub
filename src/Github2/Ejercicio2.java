package Github2;
import java.util.Scanner;


public class Ejercicio2 {
	public static void main(String[] args) {
		//Create a Java program that tells whether your body to weight ratio is good or could be better.
		//The java app should take in your weight and height from the console and calculate your body to weight ratio.
		//You can use this article as a standardized guide for how to apply the logic.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingresa tu estatura en metros:");
		float estatura = entrada.nextFloat();
		System.out.print("Ingresa tu peso en kilogramos:");
		float peso = entrada.nextFloat();
		
		float imc = (peso/(estatura*estatura));
		
		if(imc <=18.5) {
			System.out.println("Tu imc fue de: "+(double)Math.round(imc *100d)/100+" estas BAJO de peso");
		} else if(imc>18.5 && imc<=24.9) {
			System.out.println("Tu imc fue de: "+(double)Math.round(imc *100d)/100+" tu peso es NORMAL");
		}else if(imc>24.9 && imc<=29.9) {
			System.out.println("Tu imc fue de: "+(double)Math.round(imc *100d)/100+" necesitas Bajar de peso");
		}else if(imc>18.5 && imc<=24.9) {
			System.out.println("Tu imc fue de: "+(double)Math.round(imc *100d)/100+" tu peso es NORMAL");
		}else {
			System.out.println("Tu imc fue de: "+(double)Math.round(imc *100d)/100+" tienes OBESIDAD");
		}
		
	}
}
