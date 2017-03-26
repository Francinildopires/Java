package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class MasculinoOuFeminino {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite (F) para Feminino ou (M) para Masculino: ");
		String sexo = scan.next();
		
		/*
		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo inválido");
		}
		*/
		
		switch(sexo) {
		case "f":
		case "F": 
			System.out.println("Feminino.");
			break;
		case "m":
		case "M":
			System.out.println("Masculino.");
			break;
		default : 
			System.out.println("Sexo Inválido.");
		}
	}
}