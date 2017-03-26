package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class CalculoSalarioMensal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor da hora trabalhada: R$");
		double valorHora = scan.nextDouble();
		
		System.out.print("Horas trabalhadas no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("Valor do meu salário é: " + "R$"+ salario);
		
	}

}
