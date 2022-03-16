package beecrowd;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double n = 3.14159;
        double aux = n * (raio * raio);
        double area = (double) (Math.round(aux*10000.0)/10000.0);
        
        System.out.println("A=" + area + "\n");
	}

}


