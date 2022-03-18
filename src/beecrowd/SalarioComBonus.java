package beecrowd;
import java.util.Scanner;
public class SalarioComBonus {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.next();
		double salario = scanner.nextDouble();
		double montante = scanner.nextDouble();
		
		double total = salario + ((montante * 15)/100);
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
	}

}