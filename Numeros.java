package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O maior numero é: " + num1);
		} else {
			System.out.println("O maior numero é: " + num2);
		}
		

	}

}
