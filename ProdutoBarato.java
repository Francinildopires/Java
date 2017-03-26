package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class ProdutoBarato {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Preço do primeiro produto: R$");
		double preco1 = scan.nextDouble();
		
		System.out.print("Preço do segundo produto: R$");
		double preco2 = scan.nextDouble();
		
		System.out.print("Preço do terceiro produto: R$");
		double preco3 = scan.nextDouble();
		
		System.out.println();
		
		if(preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o primeiro produto.");
		} else if(preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o segundo produto.");
		} else if(preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("Compre o terceiro produto.");
		}

	}

}
