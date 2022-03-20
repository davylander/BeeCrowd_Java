package beecrowd;
import java.util.Scanner;
import java.lang.Math;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		/*
		 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
		 * p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles, mostrando 4 casas decimais ap�s a v�rgula,
		 * segundo a f�rmula:
		 * https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1015.png
		 * 
		 * Entrada: O arquivo de entrada cont�m duas linhas de dados. A primeira linha cont�m dois valores de
		 * 			ponto flutuante: x1 y1 e a segunda linha cont�m dois valores de ponto flutuante x2 y2.
		 * 
		 * Saida: Calcule e imprima o valor da dist�ncia segundo a f�rmula fornecida, com 4 casas ap�s o ponto decimal.
		 */

		Scanner scanner = new Scanner(System.in);
		
		String linha1 = scanner.nextLine();
		String linha2 = scanner.nextLine();
		
		String[] valoresP1 = linha1.split(" ");
		String[] valoresP2 = linha2.split(" ");
		
		double x1 = Double.parseDouble(valoresP1[0]);
		double y1 = Double.parseDouble(valoresP1[1]);
		double x2 = Double.parseDouble(valoresP2[0]);
		double y2 = Double.parseDouble(valoresP2[1]);
		
		double distancia = Math.sqrt( ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)) );
		
		System.out.printf("%.4f\n",distancia);
		
	}

}
