package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class TurnoEscolar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Em que turno voc� estuda ? digite M-matutino, V-vespertino e N-noturno: ");
		String turno = scan.next();
		
		/*
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom Dia !");
		} else if(turno.equalsIgnoreCase("V")) {
			System.out.println("Boa Tarde !");
		} else if(turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite !");
		} else {
			System.out.println("Valor Inv�lido");
		}
		*/
		
		switch(turno){
		case "m":
		case "M": System.out.println("Bom Dia !"); break;
		case "v":
		case "V": System.out.println("Boa Tarde !"); break;
		case "n":
		case "N": System.out.println("Boa Noite !"); break;
		}

	}

}
