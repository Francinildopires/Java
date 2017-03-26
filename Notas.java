package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a primeira Nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.println();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A média das Notas é: " + media);
		System.out.println();
		
		if(media == 10) {
			System.out.println("Aprovado com Distinção.");
		} else if(media >= 7) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado.");
		} 

	}

}
