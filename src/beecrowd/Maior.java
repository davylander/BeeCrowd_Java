package beecrowd;

import java.lang.Math;
import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String linha = scanner.nextLine();
		String[] arrayValores = linha.split(" ");
				
		int a = Integer.parseInt(arrayValores[0]);
		int b = Integer.parseInt(arrayValores[1]);
		int c = Integer.parseInt(arrayValores[2]);
		
		int maiorAB = (a+b+ Math.abs(a-b))/2;
		int maiorCab = (c+maiorAB+ Math.abs(c-maiorAB))/2;
		int maior = Math.max(maiorAB, maiorCab);
		
		System.out.println(maior + " eh o maior");
	}

}
