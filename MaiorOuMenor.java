package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class MaiorOuMenor {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		double num3 = scan.nextDouble();
		
		System.out.println();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O Maior n�mero �: " + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("O Maior n�mero �: " + num2);
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("O Maior n�mero �: " + num3);
		}
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("O Menor n�mero �: " + num1);
		} else if(num2 <= num1 && num2 <= num3) {
			System.out.println("O Menor n�mero �: " + num2);
		} else if(num3 <= num1 && num3 <= num2) {
			System.out.println("O Menor n�mero �: " + num3);
		}

	}

}
