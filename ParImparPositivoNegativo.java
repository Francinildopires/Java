package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class ParImparPositivoNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Entre com uma opera��o (+ - / *): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default : System.out.println("Opera��o inval�da."); 
		valida = false; 
		}
		
		if(valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if(resultado >= 0) {
				System.out.println("Resultado Positivo.");
			} else {
				System.out.println("Resultado Negativo.");
			}
			
			if(resultado % 2 == 0) {
				System.out.println("O resultado � Par.");
			} else {
				System.out.println("O Resultado � �mpar.");
			}
			
		}
		
		

	}

}
