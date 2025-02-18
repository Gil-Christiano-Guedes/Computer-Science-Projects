package Curso;

public class Operadores_Aritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* As operações de multiplicação são avaliadas primeiro na ordem da esquerda para a direita (isto é, elas são associadas da esquer-
da para a direita), porque têm uma precedência mais alta que a adição. (O Java não tem nenhum operador aritmético para exponen-
ciação, assim x2 é representado como x * x. */
		
		// Operadores +, _, /, *, %
		
		int a = 10;
		int b = 4;
		Double myDouble;
		myDouble = (double)(a/b);
		
		System.out.printf("\n Soma de %d com %d será %d \n", a, b, (a+b));
		System.out.printf("\n Subtração de %d por %d será %d \n", a, b, (a-b));
		System.out.printf("O produto entre %d e %d será %d \n", a, b, (a*b));
		System.out.printf("A divisão entre %d e %d será %2f \n", a, b, myDouble);
		System.out.printf("O módulo - resto da divisão - entre %d e %d será %d \n", a, b, (a%b));

	}

}
