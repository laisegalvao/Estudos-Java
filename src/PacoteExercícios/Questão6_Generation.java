package PacoteExercícios;

import java.util.Scanner;

public class Questão6_Generation {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		final int MES = 30, ANO = 365;
		int Dias, res, converteMes, converteAno;
		
		System.out.println("Qual a sua idade em dias? ");
		Dias = ler.nextInt();
		
		converteAno = Dias/ANO;
		converteMes = (Dias%ANO)/MES;
		res = (Dias%ANO)%MES;
		
		System.out.println("A idade corresponde a " + res + " dias," 
				+ converteAno + " anos e " + converteMes + " meses.");
		
	}

}