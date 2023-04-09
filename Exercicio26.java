package aula19_Arrays;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
		 * vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
		 * a) C[x] deverá receber 1 quando A[x] for maior que B[x] b) C[x] deverá
		 * receber 0 quando A[x] for igual a B[x] c) C[x] deverá receber -1 quando A[x]
		 * for menor que B[x]
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Vetor A posicao " + (x + 1));
			vetorA[x] = ler.nextInt();
		}
		for (int x = 0; x < vetorB.length; x++) {
			System.out.println("Vetor B posicao " + (x + 1));
			vetorB[x] = ler.nextInt();
		}
		for (int x = 0; x < vetorC.length; x++) {
			if (vetorA[x] > vetorB[x]) {
				vetorC[x] = 1;
			} else if (vetorA[x] == vetorB[x]) {
				vetorC[x] = 0;
			} else {
				vetorC[x] = -1;
			}
		}
		System.out.print("VetorC = ");
		for (int x = 0; x < vetorC.length; x++) {
			System.out.print(vetorC[x] + " ");
		}
	}
}
