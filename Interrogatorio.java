package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class Interrogatorio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vítima ? ");
		System.out.print("R: ");
		String resp1 = scan.next();
		System.out.println();
		
		System.out.println("Esteve no local do crime ? ");
		System.out.print("R: ");
		String resp2 = scan.next();
		System.out.println();
		
		System.out.println("Mora perto da vítima ? ");
		System.out.print("R: ");
		String resp3= scan.next();
		System.out.println();
		
		System.out.println("Devia para a vítima ? ");
		System.out.print("R: ");
		String resp4 = scan.next();
		System.out.println();
		
		System.out.println("Já trabalhou com a vítima ? ");
		System.out.print("R: ");
		String resp5 = scan.next();
		System.out.println();
		
		int cont = 0;
		
		
		if(resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeita.");
		} else if(cont == 3 || cont == 4) {
			System.out.println("Cúmplice.");
		} else if(cont == 5) {
			System.out.println("Assassino.");
		} else {
			System.out.println("Inocente.");
		}
		
		

	}

}
