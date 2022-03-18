package beecrowd;
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		// Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor 
		// que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do 
		// funcionário, com duas casas decimais.
		
		Scanner scanner = new Scanner(System.in);	
		int funcionario = scanner.nextInt();
		int horas = scanner.nextInt();
		double valor = scanner.nextDouble();
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f\n", horas*valor);
		System.out.println("teste");
		

	}

}
