package Curso;
import java.util.Scanner;

public class Operacoes_com_Strings {

	public static void main(String[] args) {
		
		String userName;
		try (Scanner gravador = new Scanner(System.in)) {
			System.out.print("Qual é seu nome: ");
			userName = gravador.nextLine();
		}
		
		Account conta;
		conta = new Account();
		conta.setName(userName);
		System.out.printf("Nome: %s %s", conta.getName(), " | Deu certo! | ");
		// %S retorna strings em caixa alta
		System.out.printf("\nNome: %S ", conta.getName());	
	}
}
