package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class CalculoArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Digite o valor do raio: ");
		double raio = scan.nextDouble();
		
		//double area = pi * (raio * raio);		
		
		  // (Math)é uma classe utilitaria do Java
		double area = Math.PI * Math.pow(raio, 2);
		
		
		
		System.out.println("A area do circulo é: " + area);

	}

}
