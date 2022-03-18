package beecrowd;
import java.util.Scanner;
public class CalculoSimples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String linha1 = scanner.nextLine();
		System.out.println(linha1);
		String linha2 = scanner.nextLine();
		System.out.println(linha2);
		
		String[] arrayValores1 = linha1.split(" ");
		String[] arrayValores2 = linha2.split(" ");
		
		/*for(int i=0; i<arrayValores1.length; i++) {
			System.out.println();
			for(int j=0; j<arrayValores2.length; j++) {
				System.out.println(arrayValores1[i]);
				System.out.println(arrayValores2[j]);
			}
	
		}
		*/
		

	}

}
