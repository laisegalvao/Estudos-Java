package PacoteExercícios;

import java.util.Scanner;

public class Questão5_Generation {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, x;
		
		System.out.println("Digite sua idade em anos: ");
		anos = ler.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		meses = ler.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		x = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("A idade em dias corresponde a: " + x + " dias");
	}

}
