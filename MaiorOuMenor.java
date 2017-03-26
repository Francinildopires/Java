package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class MaiorOuMenor {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Digite o terceiro número: ");
		double num3 = scan.nextDouble();
		
		System.out.println();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O Maior número é: " + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("O Maior número é: " + num2);
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("O Maior número é: " + num3);
		}
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("O Menor número é: " + num1);
		} else if(num2 <= num1 && num2 <= num3) {
			System.out.println("O Menor número é: " + num2);
		} else if(num3 <= num1 && num3 <= num2) {
			System.out.println("O Menor número é: " + num3);
		}

	}

}
