package beecrowd;

import java.util.Scanner;
public class ConversaoDeTempo {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento em uma f�brica, e informe-o expresso
		 * no formato horas:minutos:segundos.
		 * 
		 * Entrada: O arquivo de entrada cont�m um valor inteiro N.
		 * 
		 * Sa�da: Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
		 */
		
		/*
		 * 60 s = 1 min
		 * 60 min = 1 h
		 * 3600 s = 1 h
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		int tempo = scanner.nextInt();
		
		int rHora = tempo % 3600;
		int rMinutos = rHora % 60;
		int rSegundos = rMinutos % 1;
		
		int hora = tempo / 3600;
		int minutos = rHora / 60;
		int segundos = rMinutos / 1;
		
		System.out.println(hora+":"+minutos+":"+segundos);
		

	}

}
