package exerciciosAlgoritmo;

import java.util.Scanner;

public class Exercicio7 {

	/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
	sua terça parte.
	Ex:
	Digite um número: 3.5
	O dobro de 3.5 é 7.0
	A terça parte de 3.5 é 1.16666*/
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número real");
		double num = sc.nextDouble();
		
		double dobro = num*2;
		double tercaParte = num/3;
		
		System.out.println("O dobro do número " + num + " é " + dobro + " e a terça parte é " + tercaParte);
		
		sc.close();

	}

}
