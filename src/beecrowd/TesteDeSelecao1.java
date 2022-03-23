/*
 * Classe Teste de Sele��o 1 - BeeCrowd linguagem Java
 * 23/03/2022
 * Todos os direitos reservados para Davi Souto
 */

package beecrowd;

import java.util.Scanner;

/*
 * @version 1.0
 * @author Davi Souto Neri - BeeCrowd Java
 */

public class TesteDeSelecao1 {

	public static void main(String[] args) {
		/*
		 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D,
		 *  ambos, forem positivos e se a vari�vel A for par escrever a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".
		 *  
		 *  Entrada: Quatro n�meros inteiros A, B, C e D.
		 *  
		 *  Sa�da: Mostre a respectiva mensagem ap�s a valida��o dos valores.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String linha = scanner.nextLine();
		String[] valores = linha.split(" ");
		
		int a = Integer.parseInt(valores[0]);
		int b = Integer.parseInt(valores[1]);
		int c = Integer.parseInt(valores[2]);
		int d = Integer.parseInt(valores[3]);
		
		if (((b > c) && (d > a)) && ((c + d) > (a + b)) && (c > 0 && d > 0) && (a % 2 == 0)) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores n�o aceitos");
		}

	}

}
