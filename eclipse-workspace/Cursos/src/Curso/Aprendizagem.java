package Curso;

public class Aprendizagem {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		String[] greeting = new String[3];
		greeting[0] = "Hello ";
		greeting[1] = "World! ";
		greeting[2] = "Everyone! \n";
		for(String s : greeting) {
			System.out.print(s);
		}
		
		System.out.println("\n for equivalente a \n ");
		
		String[] saudacoes = new String[2];
		saudacoes[0] = "Hello ";
		saudacoes[1] = "World!";
		
		for(int i=0; i < saudacoes.length; i++) {
			System.out.print(saudacoes[i]);
		}

	}

}
