package PacoteExercícios;

import java.util.Scanner;

public class Questão2_Generation {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		float custoCN, custoF, ValorImposto, ValorDistr;
		
		System.out.println("Entre com um valor de custo de fábrica: ");
		custoF = ler.nextFloat();
		
		ValorDistr = custoF + (custoF * 28/100);
		ValorImposto = custoF + (custoF * 47/100);
		custoCN = ValorDistr + ValorImposto + custoF;
		
		System.out.println("O custo de um carro novo para o consumidor é de " + custoCN
				+ "." + " Já o custo de fábrica é de R$ " + custoF + ".");
	}

}
