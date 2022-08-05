package com.exercicio.da.aula.de.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class DesafioTelefone {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de cliente: ");
		int qtd = sc.nextInt();

		String[] name = new String[qtd];
		String[] telefone = new String[name.length];
		int[] tipo = new int[name.length];
		int[] minutos = new int[name.length];

		for (int i = 0; i < name.length; i++) {
			System.out.println("Dados do " + (i + 1) + "°. cliente:");
			System.out.print("Nome: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Telefone: ");
			telefone[i] = sc.next();
			System.out.print("Tipo: ");
			tipo[i] = sc.nextInt();
			System.out.print("Minutos: ");
			minutos[i] = sc.nextInt();
		}
		System.out.println(" ");
		System.out.println("Informe o preço basico e exedente de cada tipo de conta: ");
		double[][] tipos = new double[3][2];
		for (int i = 0; i < tipos.length; i++) {
			System.out.println("tipo " + i + ":");
			for (int j = 0; j < tipos[i].length; j++) {
				tipos[i][j] = sc.nextDouble();

			}

		}
		double count0 = 0, count1 = 0, count2 = 0;
		double tip = 0, tip1 = 0, tip2 = 0;
		System.out.println(" ");
		for (int i = 0; i < tipos.length; i++) {
			for (int j = 0; j < tipos[i].length; j++) {

				count0 = tipos[0][0];
				count1 = tipos[1][0];
				count2 = tipos[2][0];
				tip = tipos[0][1];
				tip1 = tipos[1][1];
				tip2 = tipos[2][1];

			}

		}
		double conta = 0;
		for (int i = 0; i < tipo.length; i++) {
			if (minutos[i] > 90 && tipo[i] == 0) {
				conta = ((minutos[i] - 90) * tip) + count0;
			} else if (minutos[i] < 90 && tipo[i] == 0) {
				conta = count0;
			}
			if (minutos[i] > 90 && tipo[i] == 1) {
				conta = ((minutos[i] - 90) * tip1) + count1;
			} else if (minutos[i] < 90 && tipo[i] == 1) {
				conta = count1;
			}
			if (minutos[i] > 90 && tipo[i] == 2) {
				conta = ((minutos[i] - 90) * tip2) + count2;
			} else if (minutos[i] < 90 && tipo[i] == 2) {
				conta = count2;
			}
			System.out.println(name[i] + ", " + telefone[i] + ", Minutos: " + minutos[i] + ", conta = R$ " + conta);
		}

		sc.close();

	}

}
