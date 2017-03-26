package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class CalculoRaiz {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com valor de a: ");
		double a = scan.nextDouble();
		
		if(a == 0) {
			System.out.println("Não é uma equação do segundo grau.");
		} else {
		
		System.out.print("Entre com valor de b: ");
		double b = scan.nextDouble();
		
		System.out.print("Entre com valor de c: ");
		double c = scan.nextDouble();
		
		double delta = Math.pow(b, 2) - (4*a*c);
		
		
		
		if(delta < 0) {
			System.out.println("Delta Negativo");
		} else {
			
			System.out.println("Delta = " + delta);
			
		double x1 =  ((-b) + Math.sqrt(delta)) / (2*a);
		double x2 =  ((-b) - Math.sqrt(delta)) / (2*a);	
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		}
		
		}
		
		
		
	}
}