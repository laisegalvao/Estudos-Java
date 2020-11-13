package PacoteExercícios;

import java.util.Scanner;

public class Questão4_Generation {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		final int hora = 3600;
		final int minuto = 60;
		int Segundos, segundos, H, Min, converteH, converteMin, duração;
		
		System.out.println("Qual o tempo em segundos de um evento em uma fábrica?");
		segundos = ler.nextInt();
		
		converteH = segundos/3600;
		Segundos = segundos - (3600 * converteH);
		converteMin = segundos/60;
		Segundos = segundos - (60 * converteMin);
		
		System.out.println("O tempo de duração de um evento em uma fábrica é de " +
		converteH + " hora(s)," + converteMin + " minuto(s) e " + Segundos + "segundo(s).");
				
	}

}
