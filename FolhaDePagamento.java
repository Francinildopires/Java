package com.fran.cursojava.exerciciosaulas1415;

import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da hora/trabalhada: R$ ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Digite a quantidade de hora/trabalhada: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		
		double percentual = 0;
		
		if(salarioBruto <= 900) {
			percentual = 0;
		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			percentual = 5;
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			percentual = 10;
		} else if(salarioBruto >= 2500) {
			percentual = 20;
		}
		
		
		double descontoIR = (salarioBruto / 100) * percentual;
		double descontoINSS = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = descontoIR + descontoINSS;
		double salarioLiquido = salarioBruto - totalDescontos ;
		
		System.out.println();
		System.out.println("Salário Bruto: R$ " + salarioBruto);
		System.out.println();
		System.out.println("Desconto " + percentual+ "% " + "IR: R$ " + descontoIR);
		System.out.println("Desconto de 10% INSS: R$ " + descontoINSS);
		System.out.println("FGTS: R$" + fgts);
		System.out.println("Total de Descontos: R$" + totalDescontos);
		System.out.println();
		System.out.println("Salário Liquido: R$ " + salarioLiquido);
		
	}

}
