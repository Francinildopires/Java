package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class farenheitParaCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Graus �F: ");
		
		double grauF = scan.nextDouble();
		
		double grauC =  (grauF-32) / 1.8;
		
		System.out.println("Graus Farenheint no valor de " + grauF + "�F" + 
							" transformado em Celsius �: " + grauC + "�C");

	}

}
