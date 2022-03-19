package beecrowd;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		/* 1012
		 * Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
		 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		 * b) a �rea do c�rculo de raio C. (pi = 3.14159)
		 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
		 * d) a �rea do quadrado que tem lado B.
		 * e) a �rea do ret�ngulo que tem lados A e B.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String linha = scanner.nextLine();
		String[] arrayValores = linha.split(" ");
		
		double a = Double.parseDouble(arrayValores[0]);
		double b = Double.parseDouble(arrayValores[1]);
		double c = Double.parseDouble(arrayValores[2]);
		double pi = 3.14159;
		
		double trianguloRetangulo = (a * c) / 2;
		double circulo = pi * (c * c);
		double trapezio = ((a + b) * c) / 2;
		double quadrado = b * b;
		double retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		
		
		//System.out.println(a + " " + b + " " + c);
	}

}
