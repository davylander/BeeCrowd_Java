package beecrowd;
import java.util.Scanner;
public class Diferenša {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		int diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
		
	}

}
