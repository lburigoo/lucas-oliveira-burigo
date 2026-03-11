package exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2 = input.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota3 = input.nextDouble();
		
		
		System.out.println("Sua média final é: " + media(nota1, nota2, nota3));
	}
	
	public static double media(double nota1, double nota2, double nota3) {
		
		
		return (nota1 + nota2 + nota3)/3;
	}
}
