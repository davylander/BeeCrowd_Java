package beecrowd;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
		 * As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
		 * 
		 * Entrada: O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
		 * 
		 * Saída: Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 
		 * Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
		 */
		
		// dividir o valor, e usar o resto para a proxima divisão
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int r100 = n % 100;
		int r50 = r100 % 50;
		int r20 = r50 % 20;
		int r10 = r20 % 10;
		int r5 = r10 % 5;
		int r2 = r5 % 2;
		int r1 = r2 % 1;
		
		int n100 = n / 100;
		int n50 = r100 / 50;
		int n20 = r50 / 20;
		int n10 = r20 / 10;
		int n5 = r10 / 5;
		int n2 = r5 / 2;
		int n1 = r2 / 1;
		
		System.out.println(r100);
		System.out.println(r50);
		System.out.println(r20);
		System.out.println(r10);
		System.out.println(r5);
		System.out.println(r2);
		System.out.println(r1);
		System.out.println("_______________________________");
		System.out.println(n100);
		System.out.println(n50);
		System.out.println(n20);
		System.out.println(n10);
		System.out.println(n5);
		System.out.println(n2);
		System.out.println(n1);
		
		
	}

}
