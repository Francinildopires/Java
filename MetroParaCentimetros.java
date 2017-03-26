package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class MetroParaCentimetros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de metros que queira converte: ");
		double metros = scan.nextDouble();
		
		double cm = metros * 100;
		
		if(metros <= 1) {
			System.out.println(metros + " metro = " + cm + " centímetros");
		} else  {
			System.out.println(metros + " metros = " + cm + " centímetros");
		}
		
		
		

	}

}
