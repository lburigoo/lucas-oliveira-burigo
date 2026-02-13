package aula;

import java.util.Scanner;

public class Ex1 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira altura");
		double altura = input.nextDouble();
				
		System.out.println("Digite a segunda altura");
		double altura2 = input.nextDouble();
				
		double resultado = altura - altura2;
		
		System.out.println("A diferença das alturas é de: " + resultado + " metros");
				
	}
}
