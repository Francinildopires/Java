package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		String letra = scan.next();
		
		/*
		if(letra.equalsIgnoreCase("a")) {
			System.out.println("Esta letra � vogal.");
		} else if(letra.equalsIgnoreCase("e")) {
			System.out.println("Esta letra � vogal.");
		} else if(letra.equalsIgnoreCase("i")) {
			System.out.println("Esta letra � vogal.");
		} else if(letra.equalsIgnoreCase("o")) {
			System.out.println("Esta letra � vogal.");
		} else if(letra.equalsIgnoreCase("u")) {
			System.out.println("Esta letra � vogal.");
		} else  {
			System.out.println("Esta letra � consoante.");
		}
		
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
			|| letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") 
			|| letra.equalsIgnoreCase("u")){
			System.out.println("Esta letra � vogal.");
		} else {
			System.out.println("Esta letra � consoante.");
		}
		*/
		if(letra.length() > 1) {
			System.out.println("N�o � uma letra v�lida");
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
