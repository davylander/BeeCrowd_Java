package beecrowd;
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		// Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor 
		// que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do 
		// funcion�rio, com duas casas decimais.
		
		Scanner scanner = new Scanner(System.in);	
		int funcionario = scanner.nextInt();
		int horas = scanner.nextInt();
		double valor = scanner.nextDouble();
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f\n", horas*valor);
		System.out.println("teste");
		

	}

}
