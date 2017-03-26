package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro Lado: ");
		double lado1 = scan.nextDouble();
		
		System.out.print("Digite o Segundo Lado: ");
		double lado2 = scan.nextDouble();
		
		System.out.print("Digite O Terceiro Lado: ");
		double lado3 = scan.nextDouble();
		
		if(((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){
		
		if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero.");
			
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3 ) {
			
		/*
		else if(lado1 == lado2 && lado1 != lado3 
				|| lado2 == lado3 && lado2 != lado1 
				|| lado3 == lado1 && lado3 != lado2) {
		*/
			
			System.out.println("Triângulo Isósceles");
		
			
		} else if(lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
			
			/*
			else if(lado1 != lado2 && lado1 != lado3
					|| lado2 != lado3 && lado2 != lado1
					|| lado3 != lado1 && lado3 != lado2) {
		    */
			System.out.println("Triângulo Escaleno");
			
		}
	} else {
		System.out.println("Não forma um triângulo");
	}

	}

}
