package exercicios;

import java.util.Scanner;

public class Ex3 {

	
	public static void repeticao (int numero) {
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(numero + " + "  + (numero+i));
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = input.nextInt();
		
		repeticao(numero);
		}
}


