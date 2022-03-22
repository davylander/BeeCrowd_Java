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
		 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
		 * Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos 
		 * casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
		 * Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
		 * 
		 * Entrada: O arquivo de entrada contém um valor inteiro.
		 * 
		 * Saída: Imprima a saída conforme exemplo fornecido.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		// É preciso descobrir o resto de dias que sobra da divisão por 365 dias, 30 dias e 1 dia.
		
		int restoAnos = idade % 365;
		int restoMeses = restoAnos % 30;
		int restoDias = restoMeses % 1;
		
		// Após descobrir o resto dessas divisõs, com exceção dos anos, é necessário dividir o valor dos restos pelo número de mês e dia.
		
		int anos = idade / 365;
		int meses = restoAnos / 30;
		int dias = restoMeses / 1;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
	}

}
