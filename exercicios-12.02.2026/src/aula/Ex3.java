package aula;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a largura do triângulo");
		double largura = input.nextDouble();
				
		System.out.println("Digite a altura do triângulo");
		double altura = input.nextDouble();
				
		double perimetro =  (altura + largura)*2;
		double area = altura*largura;
		
		System.out.println("O perímetro do triângulo é de: " + perimetro);
		System.out.println("A área do triângulo é de: " + area);
		
	}
}
