package PacoteExercícios;

import java.util.Scanner;

public class Questão1_Generation {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		String nome;
		float n1, n2, n3, mf;
		
		System.out.println("Nome do aluno: ");
		nome = ler.nextLine();
		
		System.out.println("Entre com a nota n1: ");
		n1 = ler.nextFloat();
		
		System.out.println("Entre com a nota n2: ");
		n2 = ler.nextFloat();
		
		System.out.println("Entre com a nota n3: ");
		n3 = ler.nextFloat();
		
		mf = (n1 * 2 + n2 * 3 + n3 *5)/10;
		
		System.out.println("O aluno " + nome + " obteve média final igual a: " + mf);
	}
}
