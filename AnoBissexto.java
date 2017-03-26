package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int ano = input.nextInt();
		
		System.out.println();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.println(ano + " É um ano Bissexto.");
		} else {
			System.out.println(ano + " Não é um ano Bissexto.");
		}
		
		

	}

}
