package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class TrueFalse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double valor = scan.nextDouble();
		
		if(valor >= 0) {
			System.out.println("O valor é positivo");
		} else {
			System.out.println("O valor é negativo");
		}
		

	}

}
