package com.exercicio.da.aula.de.Repticao;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtleta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name = "", nome = "";
		char sexo;
		double altura = 0, peso = 0, soma = 0, maior = 0, media = 0;
		double count = 0,cont = 0,percentoal = 0, cont1 = 0;

		System.out.print("Qual a quantidade de pessoas? ");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite os dados atleta numero " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Sexo: ");
			sexo = (Character.toUpperCase(sc.next().charAt(0)));
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M:");
				sexo = (Character.toUpperCase(sc.next().charAt(0)));
			}
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while(altura < 0) {
				System.out.print("Valor invalidor! Favor digite um valor positivo: ");
				altura = sc.nextDouble();
			}
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while(peso < 17) {	// foi realizado uma pesquisa e o menor peso para um atleta é na categoria mirim até 7 anos que de 17kg
				System.out.print("Valor invalidor! Favor digite um valor positivo: ");
				peso = sc.nextDouble();
			}
			count+=peso;
			soma = count  / qtd;
			if(altura > maior) {
				maior = altura;
				nome = name;
			}
			if(sexo == 'M') {
				cont++;
				percentoal = cont / qtd * 100;
			}
			else{
				cont1++;
				media = (media + altura);
			}		

		}
		System.out.println(" ");
		System.out.println("RELATÓRIO:");
		System.out.printf("peso médio dos atletas: %.2fKg%n",soma);
		System.out.println("Atleta mais alto: " + nome);
		System.out.println("Porcentagem de homens: " + String.format("%.2f", percentoal) + "%");
		System.out.println("Altura média das mulheres: " + String.format("%.2f", media/cont1));

		sc.close();

	}

}
