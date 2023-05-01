package exerciciosAlgoritmo;

import java.util.Scanner;

public class Exercicio4 {

	/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
	Ex:
	Digite um valor: 8
	Digite outro valor: 5
	A soma entre 8 e 5 é igual a 13.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int num1 = sc.nextInt();
		System.out.println("Digite outro valor");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + soma);

		sc.close();
	}

}
