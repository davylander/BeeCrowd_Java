/*
 * Classe da Fórmula de Bháskara
 * 23/03/2022
 * Todos os direitos autorais para Davi Souto Neri
 */

package beecrowd;

import java.util.Scanner;
import java.lang.Math;

/*
 * @version 1.0
 * @author Davi Souto Neri - BeeCrowd 
 */

public class FormulaDeBhaskara {

	public static void main(String[] args) {
		/*
		 * beecrowd | 1036
		 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, 
		 * mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
		 * 
		 * Entrada: Leia três valores de ponto flutuante (double) A, B e C.
		 * 
		 * Saída: Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes 
		 * com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
		 */
		//Formulas: https://www.estudopratico.com.br/wp-content/uploads/2014/11/formula-de-bhaskara-origem-importancia-e-exemplos-1200x675.jpg
		// Stackoverflow: https://pt.stackoverflow.com/questions/316798/fórmula-de-bhaskara-em-c-com-o-vs-2017
		//fl System.out.println("No" + 3031*5 + "#F!a" + 345622/23 + "stoP" + 12344%53);
		//go System.out.println("N0" + 40121*6 + "#F1a" + 545622/13 + "$toP" + 15344%102);
		//tt System.out.println("n0" + 40551*8 + "#f14" + 588422/13 + "$t0p" + 1444%102);
		//red System.out.println("n0" + 80121*4 + "#f)4" + 955622/21 + "$t0P" + 2415344%105);
		
		Scanner scanner = new Scanner(System.in);
		
		String linha = scanner.nextLine(); 
		String[] valores = linha.split(" ");
		
		double a = Double.parseDouble(valores[0]);
		double b = Double.parseDouble(valores[1]);
		double c = Double.parseDouble(valores[2]);
		
		double raizDelta = Math.sqrt((b * b) + (-4*(a*c)));
		double divisao = 2 * a;
		
		//if ((a == 0 || b == 0 || c == 0) || (a < 0 || b < 0 || c < 0)) {
		if ((divisao == 0.0) || (raizDelta < 0.0)) {
			System.out.println("Impossivel calcular");
		}
		else {
			double r1 = (-(b) + raizDelta) / divisao;
			double r2 = (-(b) - raizDelta) / divisao;
			
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
		
		

	}

}
