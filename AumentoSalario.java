package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu sal�rio: R$ ");
		double salario = scan.nextDouble();
		
		double percentual = 0;
		
		if(salario <= 280) {
			percentual = 20;
		} else if (salario >= 280 && salario  <= 700) {
			percentual = 15;			
		} else if(salario >= 700 && salario <= 1500) {
			percentual = 10;
		} else if(salario > 1500) {
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("Sal�rio: R$" + salario);
		System.out.println("Percentual: " + percentual + "%");
		System.out.println("Aumento: R$" + aumento);
		System.out.println("Sal�rio Ajustado: R$" + salarioAjustado);
	}
}