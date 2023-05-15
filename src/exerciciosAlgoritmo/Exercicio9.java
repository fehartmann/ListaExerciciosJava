package exerciciosAlgoritmo;

import java.util.Scanner;

public class Exercicio9 {

	/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
	e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto dinheiro você tem na carteira?");
		double valor = sc.nextDouble();
		
		double valorDolar = valor / 3.45;
		
		System.out.printf("Você pode comprar US$%.2f" ,valorDolar);

		sc.close();
	}

}
