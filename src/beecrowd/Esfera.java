package beecrowd;
import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
		 * A f�rmula para calcular o volume �: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
		 * 
		 * Entrada: O arquivo de entrada cont�m um valor de ponto flutuante (dupla precis�o), correspondente ao raio da esfera.
		 * 
		 * Saida: A sa�da dever� ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espa�o antes 
		 *		  e um espa�o depois da igualdade. O valor dever� ser apresentado com 3 casas ap�s o ponto.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		double pi = 3.14159;
		double raio = scanner.nextDouble();
		
		double volume = (4/3.0) * pi * ((raio * raio) * raio);
		
		System.out.printf("VOLUME = %.3f\n", volume);

	}

}
