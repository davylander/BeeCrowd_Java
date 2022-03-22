/*
 * Idade em dias
 * 22/03/2022
 * Direitos reservados a Davi Souto - https://github.com/davylander
*/

package beecrowd;

import java.util.Scanner;

/*
 * @version 1.0
 * @author Davi Souto Neri - BeeCrowd
*/

public class IdadeEmDias {
	
	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias
		 * Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias. Nos 
		 * casos de teste nunca haver� uma situa��o que permite 12 meses e alguns dias, como 360, 363 ou 364. 
		 * Este � apenas um exerc�cio com objetivo de testar racioc�nio matem�tico simples.
		 * 
		 * Entrada: O arquivo de entrada cont�m um valor inteiro.
		 * 
		 * Sa�da: Imprima a sa�da conforme exemplo fornecido.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		// � preciso descobrir o resto de dias que sobra da divis�o por 365 dias, 30 dias e 1 dia.
		
		int restoAnos = idade % 365;
		int restoMeses = restoAnos % 30;
		int restoDias = restoMeses % 1;
		
		// Ap�s descobrir o resto dessas divis�s, com exce��o dos anos, � necess�rio dividir o valor dos restos pelo n�mero de m�s e dia.
		
		int anos = idade / 365;
		int meses = restoAnos / 30;
		int dias = restoMeses / 1;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
	}

}
