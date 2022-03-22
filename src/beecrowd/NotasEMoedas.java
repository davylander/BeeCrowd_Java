/*
 * Notas e Moedas
 * 22/03/2020
 * Direitos reservados a Davi Souto - https://github.com/davylander
 */
package beecrowd;

import java.util.Scanner;

/*
 *@version 1.0 
 *@author Davi Souto Neri - BeeCrowd
 */

public class NotasEMoedas {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
		 * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
		 * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
		 * A seguir mostre a relação de notas necessárias.
		 * 
		 * Entrada: O arquivo de entrada contém um valor de ponto flutuante N (0 >= N >= 1000000.00).
		 * 
		 * Saída: Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
		 * Obs: Utilize ponto (.) para separar a parte decimal.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double valor = scanner.nextDouble();
		
		double rest100 = valor % 100;
		double rest50 = rest100 % 50;
		double rest20 = rest50 % 20;
		double rest10 = rest20 % 10;
		double rest5 = rest10 % 5;
		double rest2 = rest5 % 2;
		
		double rest1 = rest2 % 1;
		double rest050 = rest1 % 0.50;
		double rest025 = rest050 % 0.25;
		double rest010 = rest025 % 0.10;
		double rest005 = rest010 % 0.05;
		double rest001 = rest005 % 0.01;
		
		int n100 = (int) Math.floor(valor / 100);
		int n50 = (int) Math.floor(rest100 / 50);
		int n20 = (int) Math.floor(rest50 / 20);
		int n10 = (int) Math.floor(rest20 / 10);
		int n5 = (int) Math.floor(rest10 / 5);
		int n2 = (int) Math.floor(rest5 / 2);
		
		int n1 = (int) Math.floor(rest2 / 1);
		int n050 = (int) Math.floor(rest1 / 0.50);
		int n025 = (int) Math.floor(rest050 / 0.25);
		int n010 = (int) Math.floor(rest025 / 0.10);
		int n005 = (int) Math.floor(rest010 / 0.05);
		int n001 = (int) Math.floor(rest005 / 0.01);
		
		System.out.println("NOTAS:");
		System.out.println(n100 + " nota(s) de R$ 100.00");
		System.out.println(n50 + " nota(s) de R$ 50.00");
		System.out.println(n20 + " nota(s) de R$ 20.00");
		System.out.println(n10 + " nota(s) de R$ 10.00");
		System.out.println(n5 + " nota(s) de R$ 5.00");
		System.out.println(n2 + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(n1 + " moeda(s) de R$ 1.00");
		System.out.println(n050 + " moeda(s) de R$ 0.50");
		System.out.println(n025 + " moeda(s) de R$ 0.25");
		System.out.println(n010 + " moeda(s) de R$ 0.10");
		System.out.println(n005 + " moeda(s) de R$ 0.05");
		System.out.println(n001 + " moeda(s) de R$ 0.01");
		
		/*
		double n100 = (valor / 100);
		double n50 = (rest100 / 50);
		double n20 = (rest50 / 20);
		double n10 = (rest20 / 10);
		double n5 = (rest10 / 5);
		double n2 = (rest5 / 2);
		
		double n1 = (rest2 / 1);
		double n050 = (rest1 / 0.50);
		double n025 = (rest050 / 0.25);
		double n010 = (rest025 / 0.10);
		double n005 = (rest010 / 0.05);
		double n001 = (rest005 / 0.01);
		
		
		System.out.println("NOTAS:");
		System.out.printf("%.0f nota(s) de R$ 100.00\n", n100);
		System.out.printf("%.0f nota(s) de R$ 50.00\n", n50);
		System.out.printf("%.0f nota(s) de R$ 20.00\n", n20);
		System.out.printf("%.0f nota(s) de R$ 10.00\n", n10);
		System.out.printf("%.0f nota(s) de R$ 5.00\n", n5);
		System.out.printf("%.0f nota(s) de R$ 2.00\n", n2);
		
		System.out.println("MOEDAS:");
		System.out.printf("%.0f moeda(s) de R$ 1.00\n", n1);
		System.out.printf("%.0f moeda(s) de R$ 0.50\n", n050);
		System.out.printf("%.0f moeda(s) de R$ 0.25\n", n025);
		System.out.printf("%.0f moeda(s) de R$ 0.10\n", n010);
		System.out.printf("%.0f moeda(s) de R$ 0.05\n", n005);
		System.out.printf("%.0f moeda(s) de R$ 0.01\n", n001);
		*/
	}

}
