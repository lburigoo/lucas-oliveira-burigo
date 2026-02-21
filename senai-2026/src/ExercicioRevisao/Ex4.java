package ExercicioRevisao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o dia do mês");
		int diaMes = input.nextInt();
		
		if (diaMes < 1 || diaMes > 31) {
			System.out.println("Dia Inválido");
			return;
		}
		
		System.out.println("Digite o mês");
		int mes = input.nextInt();
		
		if (mes < 1 || mes > 12) {
			System.out.println("Mês Inválido");
			return;
		}
		
		System.out.println("Digite o ano");
		int ano = input.nextInt();
		
		boolean bissexto = false;
		if (ano % 4 == 0 & ano % 100 != 0) {
			bissexto = true;
		}
		
		int diasNoMes = 0;
		
		switch (mes) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			diasNoMes = 31;
			break;
			
		case 4: case 6: case 9: case 11:
			diasNoMes = 30;
			
		case 2:
			diasNoMes = bissexto ? 29 : 28;
			break;
		}
		
		if(diaMes <= diasNoMes) {
			System.out.println("Data Válida");
		} else {
			System.out.println("Data Inválida");
		}
		
		
		
	}
}
