package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a qtd de litros vendido: ");
		double litros = scan.nextDouble();
		
		System.out.print("Entre com o tipo de combustivel: ");
		String tipo = scan.next();
		
		double precoGas =  2.5;
		double precoAlc =  1.9;
		int perDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		double precoAPagar = 0;
		
		if(tipo.equalsIgnoreCase("A")) {
			
			if(litros <= 20) {
				perDesconto = 3;
			} else {
				perDesconto = 5;
			}
			
			total = litros * precoAlc;
			
		} else if(tipo.equalsIgnoreCase("G")) {
			
			if(litros <= 20) {
				perDesconto = 4;
			} else {
				perDesconto = 6;
			}
			
			total = litros * precoGas;
		}
		
		totalDesc = (total / 100) * perDesconto;
		
		precoAPagar = total - totalDesc;
		
		System.out.println("Total: " + total);
		System.out.println("Total de Desconto: " + totalDesc);		
		System.out.println("Valor a ser pago: " + precoAPagar);

	}

}
