package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class Download {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do arquivo em MB: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.print("Digite a velocidade da internet: ");
		double velInternet = scan.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("O tempo aproximado de download é: " + tempo);
		

	}

}
