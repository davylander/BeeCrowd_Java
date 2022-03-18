package beecrowd;
import java.util.Scanner;
public class CalculoSimples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String linha1 = scanner.nextLine();
		String linha2 = scanner.nextLine();
		
		String[] arrayValores1 = linha1.split(" ");
		String[] arrayValores2 = linha2.split(" ");
		
		for(int i=0; i<arrayValores1.length; i++) {
			System.out.print(" " + arrayValores1[i] + "");
	
		}
		
		System.out.println();
		
		for(int i=0; i<arrayValores2.length; i++) {
			System.out.print(" " + arrayValores2[i] + " ");
		}
	}

}
