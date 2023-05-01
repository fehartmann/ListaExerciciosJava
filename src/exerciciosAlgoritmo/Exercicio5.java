package exerciciosAlgoritmo;

import java.util.Scanner;

public class Exercicio5 {

	/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média
	na disciplina.
	Ex:
	Nota 1: 4.5
	Nota 2: 8.5
	A média entre 4.5 e 8.5 é igual a 6.5*/
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a primeira nota");
			double nota1 = sc.nextDouble();
			System.out.println("Digite a segunda nota");
			double nota2 = sc.nextDouble();
			
			double media = (nota1 + nota2)/2;
			
			System.out.printf("A média entre " + nota1 + " e " + nota2 + " é igual a %.1f" , media);
			
			sc.close();

	}

}
