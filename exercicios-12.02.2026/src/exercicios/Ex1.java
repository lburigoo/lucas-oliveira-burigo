package exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void estacaoAno() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 1 para verão, 2 para inverno, 3 para outono, 4 para primavera");
		int estacao = input.nextInt();
		
		if(estacao == 1) {
			System.out.println("É verão \nE o tempo está quente");
		} else if(estacao == 2) {
			System.out.println("É inverno \nE o tempo está frio");
		}else if(estacao == 3) {
			System.out.println("É outono \nE o tempo esta seco");
		}else if(estacao == 4) {
			System.out.println("É primavera \nE o tempo está quente e úmido");
		}else {
			System.out.println("Número inválido!");
		}
		
	}
	
	public static void main(String[] args) {
		estacaoAno();
	}
	
}
