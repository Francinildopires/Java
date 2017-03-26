package com.fran.cursojava.exerciciosaulas111213;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor da hora trabalhada: R$");
		double valorHora = scan.nextDouble();
		
		System.out.print("Horas trabalhadas no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		// para saber calcular a porcentagem usa-se ( valortotal / 100) * o valor da porcentagem
		double impostoRenda = (salarioBruto / 100) * 11;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double totalDeDescontos = impostoRenda + inss + sindicato;
		
		double salarioLiquido = salarioBruto - totalDeDescontos;
		
		System.out.println("Salário Bruto: " + "R$" + salarioBruto);
		System.out.println();
		System.out.println("Desconto Imposto de Renda: " + "R$" + impostoRenda);
		System.out.println("Desconto INSS: " + "R$ " + inss);
		System.out.println("Desconto Sindicato: " + "R$" + sindicato);
		System.out.println();
		System.out.println("Total de Descontos: " + totalDeDescontos);
		System.out.println();
		System.out.println("Valor do salario liquido é: " + "R$" + salarioLiquido);
		
	}

}