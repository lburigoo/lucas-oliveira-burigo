package atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> num = new ArrayList();
		
		num.add(3);
		num.add(5);
		num.add(7);
		num.add(23);
		
		System.out.println("Digite um numero para saber se está na Array");
		int numeroDigitado = input.nextInt();
		
		int indice = num.indexOf(numeroDigitado);

		if (indice != -1) {
			System.out.println("O valor " + numeroDigitado + " está no índice " + indice);
		} else {
			System.out.println("O valor não está na lista");
		}
		
	}
}
