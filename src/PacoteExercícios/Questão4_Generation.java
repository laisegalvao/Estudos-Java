package PacoteExerc�cios;

import java.util.Scanner;

public class Quest�o4_Generation {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		final int hora = 3600;
		final int minuto = 60;
		int Segundos, segundos, H, Min, converteH, converteMin, dura��o;
		
		System.out.println("Qual o tempo em segundos de um evento em uma f�brica?");
		segundos = ler.nextInt();
		
		converteH = segundos/3600;
		Segundos = segundos - (3600 * converteH);
		converteMin = segundos/60;
		Segundos = segundos - (60 * converteMin);
		
		System.out.println("O tempo de dura��o de um evento em uma f�brica � de " +
		converteH + " hora(s)," + converteMin + " minuto(s) e " + Segundos + "segundo(s).");
				
	}

}
