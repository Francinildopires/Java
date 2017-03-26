package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		double resultado = num1 + num2;
		
		System.out.println("A soma dos números é: " + resultado);

	}

}
