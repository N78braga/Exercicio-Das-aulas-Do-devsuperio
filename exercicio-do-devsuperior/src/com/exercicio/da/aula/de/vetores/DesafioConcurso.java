package com.exercicio.da.aula.de.vetores;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConcurso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de pessoas? ");
		int qtd = sc.nextInt();
		String[] vetor = new String[qtd];
		double[] vet = new double[vetor.length];
		double[] vet1 = new double[vetor.length];

		String name = " ", nome = " ";
		double count = 0, cont = 0;
		double maior = 0, soma = 0, percentual = 0, media = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite os dados " + (i+1) + "a pessoa:");
			System.out.print("Name: ");
			sc.nextLine();
			vetor[i] = sc.nextLine();
			System.out.print("note step 1: ");
			vet[i] = sc.nextDouble();
			System.out.print("note step 2: ");
			vet1[i] = sc.nextDouble();

		}
		System.out.println("");
		System.out.println("TABELA:");
		for (int i = 0; i < vetor.length; i++) {
			soma = (vet[i] + vet1[i]) / 2;
			System.out.println(vetor[i] + ", " + vet[i] + ", " + vet1[i] + String.format(", MEDIA = %.2f", soma));

		}
		System.out.println(" ");
		System.out.println("PESSOAS APROVADAS:");
		for (int i = 0; i < vetor.length; i++) {
			soma = (vet[i] + vet1[i]) / 2;
			if (soma >= 70.00) {
				name = vetor[i];
				System.out.println(name);
				cont++;
				count += soma;// soma a notas dos aprovado
				media = count / cont;// tirando a média dos aprovados
				percentual = cont / qtd * 100;// tirando o percentual dos aprovados
			}
			// verificando que teve a maior nota
			if (soma > maior) {
				maior = soma;
				nome = vetor[i];
			}

		}
		System.out.println(" ");
		System.out.println(String.format("Porcentagem de Aprovação: %.2f", percentual) + " %");
		System.out.println("Maior média: " + nome);
		System.out.println(String.format("Nota média dos Aprovados: %.2f", media));

		sc.close();

	}

}
