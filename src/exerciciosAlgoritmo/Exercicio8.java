package exerciciosAlgoritmo;

import java.util.Scanner;

public class Exercicio8 {

	/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores
	relativos em outras medidas.*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma distância em metros");
		double distancia = input.nextDouble();
		
		double distanciaKm = distancia * 0.001;
		double distanciaHm = distancia * 0.01;
		double distanciaDam = distancia * 0.1;
		double distanciaDm = distancia * 10;
		double distanciaCm = distancia * 100;
		double distanciaMm = distancia * 1000;
		
		
		System.out.println("A distância de " + distancia + " corresponde a:");
		System.out.println(distanciaKm + "Km");
		System.out.println(distanciaHm + "Hm");
		System.out.println(distanciaDam + "Dam");
		System.out.println(distanciaDm + "dm");
		System.out.println(distanciaCm + "cm");
		System.out.println(distanciaMm + "mm");

		input.close();
	}

}
