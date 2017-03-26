package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class MediaAproveitamento {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double mediaNotas = (nota1 + nota2) /2;
		
		String aproveitamento = "";
		
		if(mediaNotas >= 9 && mediaNotas <= 10){
			aproveitamento = "A";		
		} else if(mediaNotas >=7.5 && mediaNotas <= 9.0) {
			aproveitamento = "B";
		} else if(mediaNotas >= 6.0 && mediaNotas <= 7.5) {
			aproveitamento = "C";
		} else if(mediaNotas >= 4.0 && mediaNotas <= 6.0) {
			aproveitamento = "D";
		} else if(mediaNotas >= 0 && mediaNotas <= 4.0 ) {
			aproveitamento = "E";
		}
		
			System.out.println();
			System.out.println("Primeira Nota: " + nota1);
			System.out.println("Segunda Nota: " + nota2);
						
			System.out.println();
			System.out.println("Media das Notas: " + mediaNotas);
			
			System.out.println();
			System.out.println("Conceito: " + aproveitamento);
			
			switch(aproveitamento) {
			case "A":
			case "B":
			case "C":
				System.out.println("APROVADO !"); 
				break;
			default :
				System.out.println("REPROVADO."); 
				break;
			}
		} 
	
	
		
	}


