package exerciciosAlgoritmo;

import java.util.Scanner;

public class Exercicio6 {

	/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
	sucessor.
	Ex:
	Digite um número: 9
	O antecessor de 9 é 8
	O sucessor de 9 é 10
	*/
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a primeira nota");
			int num = sc.nextInt();
						
			int antecessor = num--;
			int sucessor = num++;
			
			System.out.printf("O antecessor de " + num + " é " + antecessor + " e o sucessor é " + sucessor);
			
			sc.close();

	}

}
