/*
 * Classe problema Beecrowd 
 * 10/04/2022
 * Direitos reservados a davylander
 */

package beecrowd;

import java.util.*;

/*
 * @version1.0 
 * @author Davi Souto Neri
 */

public class Lanche {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		double preco = 0;
		
		String linha = scanner.nextLine();
		String[] valores = linha.split(" ");
		
		int codigo = Integer.parseInt(valores[0]);
		int quantidade = Integer.parseInt(valores[1]);
		
		if(codigo == 1) {
			preco = 4.00;
		}
		else if(codigo == 2) {
			preco = 4.50;
		}
		else if(codigo == 3) {
			preco = 5.00;
		}
		else if(codigo == 4) {
			preco = 2.00;
		}
		else if(codigo == 5) {
			preco = 1.50;
		}
		
		double total = preco * quantidade;
		System.out.printf("Total R$: %.2f", total);
		
		/*
		switch(codigo) {
			case 1:
				preco = 4.00;
				System.out.printf("Total R$: %.2f", preco*quantidade);
				break;
			case 2:
				preco = 4.50;
				System.out.printf("Total R$: %.2f", preco*quantidade);
				break;
			case 3:
				preco = 5.00;
				System.out.printf("Total R$: %.2f", preco*quantidade);
				break;
			case 4:
				preco = 2.00;
				System.out.printf("Total R$: %.2f", preco*quantidade);
				break;
			case 5:
				preco = 1.50;
				System.out.printf("Total R$: %.2f", preco*quantidade);
				break;
			default:
				break;				
		}
		*/
	}
}
