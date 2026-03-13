package exercicios;

import java.util.Scanner;

public class Ex2 {

	
	public static void nomes () {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do colega");
		String nome = input.next();
		
		if(nome.equals("Lucas")) {
			System.out.println("Nome: Lucas ");
			System.out.println("Ele tem 18 anos");
			System.out.println("Ele é estudante de Desenvolvimento de Sistemas");
		}
		
	}
	public static void main(String[] args) {
		nomes();
	}
}
