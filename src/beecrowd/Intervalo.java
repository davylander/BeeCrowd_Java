/*
 * Classe para problema Beecrowd - Intervalo
 * 27/03/2022
 * DIreitos reservados a Davi Souto
 */

package beecrowd;

import java.util.Scanner;

/*
 * @version 1.0
 * @author Davi Souto Neri - Beecrowd
 */

public class Intervalo {

	public static void main(String[] args) {
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 
		 * ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, 
		 * deverá ser impressa a mensagem “Fora de intervalo”.
		 * O símbolo ( representa "maior que". Por exemplo: [0,25]  indica valores entre 0 e 25.0000, inclusive eles. (25,50] indica valores maiores que 25 
		 * Ex: 25.00001 até o valor 50.0000000
		 * 
		 * Entrada: O arquivo de entrada contém um número com ponto flutuante qualquer.
		 * 
		 * Saída: A saída deve ser uma mensagem conforme exemplo abaixo.
		 */

		Scanner scanner = new Scanner(System.in);
		
		double valor = scanner.nextDouble();
				
		if ((valor >= 0) && (valor <= 25.0000000)) {
			System.out.println("Intervalo (0,25]");
		}
		if((valor >= 25.0000001) && (valor <= 50.0000000)) {
			System.out.println("Intervalo (25,50]");
		}
		if((valor >= 50.0000001) && (valor <= 75.0000000)) {
			System.out.println("Intervalo (50,75]");
		}
		if((valor >= 75.0000001) && (valor <= 100.0000000)) {
			System.out.println("Intervalo (75,100]");
		}
		if((valor < 0) || (valor > 100)) {
			System.out.println("Fora de intervalo");
		}
		
	}

}
