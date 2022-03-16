package beecrowd;
import java.util.Scanner;
public class Media1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double media = ((a * 3.5) + (b * 7.5)) / 11;
		
		System.out.println("MEDIA = " + String.format("%.5f", media));
		
	}

}

