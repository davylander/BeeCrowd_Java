package beecrowd;
import java.util.Scanner;
public class Media2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
		
		System.out.println("MEDIA = " + String.format("%.1f", media));
		
	}

}