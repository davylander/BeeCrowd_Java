package beecrowd;
import java.util.Scanner;
public class CalculoSimples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String linha1 = scanner.nextLine();
		String linha2 = scanner.nextLine();
		
		String[] arrayValores1 = linha1.split(" ");
		String[] arrayValores2 = linha2.split(" ");
		
		//linha 1
		int numero1 = Integer.parseInt(arrayValores1[1]);
		double valor1 = Double.parseDouble(arrayValores1[2]);
		//linha 2
		
		int numero2 = Integer.parseInt(arrayValores2[1]);
		double valor2 = Double.parseDouble(arrayValores2[2]);
		
		double valor = (numero1 * valor1) + (numero2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
		
	}

}
