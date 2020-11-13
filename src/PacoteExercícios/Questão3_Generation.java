package PacoteExercícios;

import java.util.Scanner;

public class Questão3_Generation {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int A, B, C, D, R, S;
		
		System.out.println("Entre com um valor para A: ");
		A = ler.nextInt();
		
		System.out.println("Entre com um valor para B: ");
		B = ler.nextInt();
		
		System.out.println("Entre com um valor para C: ");
		C = ler.nextInt();
		
		R = (int) Math.pow(A+B, 2);
		S = (int) Math.pow(B+C, 2);
		D = R + S/2;
		
		System.out.println("O valor de D é: " + D);
			
	}

}
