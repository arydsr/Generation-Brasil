package br.com.generation.exerciciosvetorematriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] pontuacao = new double[4];
		double maior = 0.0;

		System.out.println("\nDigite as 5 pontua��es: \n");
		for (int i = 0; i <= 5; i++) {
			pontuacao[i] = entrada.nextDouble();
		
			if (pontuacao[i] > maior) { 
				maior = pontuacao[i];
			}
		}
		System.out.println("\n A 1� pontua��o � de: " + pontuacao[0]);
		System.out.println("\n A 2� pontua��o � de: " + pontuacao[1]);
		System.out.println("\n A 3� pontua��o � de: " + pontuacao[2]);
		System.out.println("\n A 4� pontua��o � de: " + pontuacao[3]);
		System.out.println("\n A 5� pontua��o � de: " + pontuacao[4]);

		System.out.println("\n A maior pontua��o � de: " + maior);
	}
}