package PacoteExerc�cios;

import java.util.Scanner;

public class Quest�o2_Generation {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		float custoCN, custoF, ValorImposto, ValorDistr;
		
		System.out.println("Entre com um valor de custo de f�brica: ");
		custoF = ler.nextFloat();
		
		ValorDistr = custoF + (custoF * 28/100);
		ValorImposto = custoF + (custoF * 47/100);
		custoCN = ValorDistr + ValorImposto + custoF;
		
		System.out.println("O custo de um carro novo para o consumidor � de " + custoCN
				+ "." + " J� o custo de f�brica � de R$ " + custoF + ".");
	}

}
