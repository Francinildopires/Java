package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class ParOuInpar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		double numInt = input.nextDouble();
		
		if(numInt % 2 == 0) {
			System.out.println(numInt + " É um número Par.");
		} else {
			System.out.println(numInt + " É um número Ímpar.");
		}
	}

}
