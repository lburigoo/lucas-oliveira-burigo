package exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número da estação");
		int estacao = input.nextInt();

		if (estacao == 1) {
		
			System.out.println(retornarVerao());
		} else if (estacao == 2) {
			System.out.println(retornarOutono());
		} else if (estacao == 3) {
			System.out.println(retornarInverno());
		} else if (estacao == 4) {
			System.out.println(retornarPrimavera());
		} else {
			System.out.println("Escolha errada");
		}

	}

	
	public static String retornarVerao() {
		return "É verão e o tempo está quente";
	}

	
	public static String retornarOutono() {
		return "É outono e as folhas estão caindo";
	}
	
	public static String retornarInverno() {
		return "É inverno e o tempo está frio";
	}

	
	public static String retornarPrimavera() {
		return "É primavera e as folhas estão florindo";
	}

}
