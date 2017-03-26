package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class CelsiusParaFarenheit {

	public static void main(String[] args) {
		
		Scanner graus = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Graus ºC: ");
		
		double grauC = graus.nextDouble();
		
		double grauF = (grauC * 1.8) + 32;
		
		System.out.println("Graus Celsius no valor de " + grauC + " ºC" + 
							" transformado em Farenheit é: " + grauF + " ºF");
		

	}

}
