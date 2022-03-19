package beecrowd;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		/* 1012
		 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
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
