package beecrowd;

import java.util.Scanner;
public class ConversaoDeTempo {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso
		 * no formato horas:minutos:segundos.
		 * 
		 * Entrada: O arquivo de entrada contém um valor inteiro N.
		 * 
		 * Saída: Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
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
