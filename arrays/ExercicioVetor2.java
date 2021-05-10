package lista.arrays;

import java.util.Scanner;

/*
 * Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

 */
public class ExercicioVetor2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[6];
		int i;
		int somaPar = 0, numeroPar = 0;
		int somaImpar = 0, numeroImpar = 0;
		int contadorImpar = 0;

		System.out.println("Digite os números desejados: \n");
		for (i = 0; i <= 5; i++) {
			numero[i] = entrada.nextInt();
		}
		System.out.println("\nEsses são os números pares: ");
		
		for (i = 0; i <= 5; i++) {
			if (numero[i] % 2 == 0) {
				System.out.println(numero[i]);
				somaPar += numero[i];
			}
		}

		System.out.println("Esses são os números ímpares: ");
		for (i = 0; i <= 5; i++) {
			if (numero[i] % 2 == 1) {
				System.out.println(numero[i]);
				somaImpar += numero[i];
				contadorImpar++;
			}
		}

		System.out.println("\nA soma dos números pares é igual a: " + somaPar);
		System.out.println("A soma dos números ímpares é igual a: " + somaImpar);
		System.out.println("A quatidade de números ímpares é igual a: " + contadorImpar);
	}
}
