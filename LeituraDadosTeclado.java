package com.fran.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		 System.out.println("Digite seu nome completo:");
		
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		
		String primeiroNome = scan.next();
		
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		
		
		System.out.println("Digite a sua idade: ");
		
		int idade = scan.nextInt();
		
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Digite a sua altura: ");
		
		double altura = scan.nextDouble();
		
		System.out.println("Minha altura �: " + altura);
		*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, nome da mulher, altura, tem bichos de estima��o");
		
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		String nomeMulher = scan.next();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Nome da mulher: " + nomeMulher);
		System.out.println("Sua altura: " + altura);
		System.out.println("Tem bichos de estima��o: " + temPet);
		
		
;	}

}
