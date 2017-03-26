package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		String letra = scan.next();
		
		/*
		if(letra.equalsIgnoreCase("a")) {
			System.out.println("Esta letra é vogal.");
		} else if(letra.equalsIgnoreCase("e")) {
			System.out.println("Esta letra é vogal.");
		} else if(letra.equalsIgnoreCase("i")) {
			System.out.println("Esta letra é vogal.");
		} else if(letra.equalsIgnoreCase("o")) {
			System.out.println("Esta letra é vogal.");
		} else if(letra.equalsIgnoreCase("u")) {
			System.out.println("Esta letra é vogal.");
		} else  {
			System.out.println("Esta letra é consoante.");
		}
		
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
			|| letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") 
			|| letra.equalsIgnoreCase("u")){
			System.out.println("Esta letra é vogal.");
		} else {
			System.out.println("Esta letra é consoante.");
		}
		*/
		if(letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("Vogal."); break;
			default : System.out.println("Consoante.");
		}
		
		}
	}

}
