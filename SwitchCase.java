package com.fran.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um dia da semana de (1 à 7): ");
		int diaSemana = scan.nextInt();
		
		/*
		if(diaSemana == 1) {
			System.out.println("Domingo");
		} else if(diaSemana == 2) {
			System.out.println("Segunda-Feira");
		} else if(diaSemana == 3) {
			System.out.println("Terça-Feira");
		} else if(diaSemana == 4) {
			System.out.println("Quarta-Feira");
		} else if(diaSemana == 5) {
			System.out.println("Quinta-Feira");
		} else if(diaSemana == 6) {
			System.out.println("Sexta-Feira");
		} else if(diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("não é um dia da semana válido.");
		}
		
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo."); break;
		case 2: System.out.println("Segunda-Feira."); break;
		case 3: System.out.println("Terça-Feira."); break;
		case 4: System.out.println("Quarta-Feira."); break;
		case 5: System.out.println("Quinta-Feira."); break;
		case 6: System.out.println("Sexta-Feira."); break;
		case 7: System.out.println("Sábado."); break;
		default: System.out.println("não é um dia da semana válido.");
		}
		*/
		
		// O (switch) funciona como múltiplos (If-Else).
		
		/*
		switch(diaSemana) {
		case 1: System.out.println("Domingo."); 
		case 2: System.out.println("Segunda-Feira."); 
		case 3: System.out.println("Terça-Feira."); 
		case 4: System.out.println("Quarta-Feira."); 
		case 5: System.out.println("Quinta-Feira.");
		case 6: System.out.println("Sexta-Feira.");
		case 7: System.out.println("Sábado."); break;
		default: System.out.println("não é um dia da semana válido.");
		}
		*/
		
		switch(diaSemana) {
		case 2:  
		case 3:  
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil."); break;
		case 1:
		case 7: System.out.println("Fim de semana."); break;
		default: System.out.println("não é um dia da semana válido.");

		}
	}
}
