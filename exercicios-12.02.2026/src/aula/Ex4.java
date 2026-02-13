package aula;

import java.util.Scanner;

public class Ex4 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome");
		String nome = input.next();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = input.next();
		
		String nomeCompleto = nome + " " + sobrenome;
		
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
	}
}
