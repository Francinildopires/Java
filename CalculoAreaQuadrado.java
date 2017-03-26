package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class CalculoAreaQuadrado {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o tamanho do lado do quadrado: ");
		double ladoQuadrado = scan.nextDouble();
		
		// area = lado * lado
		double area = Math.pow(ladoQuadrado, 2);
		
		double dobroDaArea = area * 2;
		
		if(area < 1){
			System.out.println("A area do quadrado é: " + area + "cm");
		}else {
			System.out.println("A area do quadrado é: " + area + "mt");
		}
		
		if(dobroDaArea < 1){
		System.out.println("O dobro da área do quadrado é: " + dobroDaArea + "cm");
		}else {
			System.out.println("O dobro da área do quadrado é: " + dobroDaArea + "mt");
		}
		
		}
}


