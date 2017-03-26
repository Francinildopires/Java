package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double nota4 = scan.nextDouble();
		
		double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Media das notas Bimestrais = " + mediaNotas);

	}

}
