package Curso;
import java.util.Scanner;

public class Input_Output_Terminal {

	public static void main(String[] args) {
		
		System.out.print("A minha idade eh: ");
		int year;
		try (Scanner entrada = new Scanner(System.in)) {
			year = entrada.nextInt();
		}
		
		System.out.println("Resposta: " + year + " anos");

	}
}
