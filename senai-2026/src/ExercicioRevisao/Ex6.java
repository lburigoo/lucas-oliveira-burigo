package ExercicioRevisao;

import java.util.Scanner;

public class Ex6 {
	
	

	    public static void main(String[] args) {
	        
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.println("=== Cálculo de decaimento radioativo ===\n");
	        System.out.print("Digite a massa inicial do material (em kg): ");
	        double massaInicialKg = entrada.nextDouble();
	        
	       
	        double massaInicialGramas = massaInicialKg * 1000;
	        double massaFinalDesejada = 0.5;  
	        
	        double massaAtual = massaInicialGramas;
	        int tempoTotalSegundos = 0;
	        int intervaloMeiaVida = 50;  
	        
	        if (massaAtual < massaFinalDesejada) {
	            System.out.println("\nA massa inicial já é menor que 0,5 g.");
	            System.out.printf("Massa inicial: %.3f g\n", massaAtual);
	            System.out.printf("Tempo necessário: 0 segundos\n");
	            entrada.close();
	            return;
	        }
	        
	       
	        while (massaAtual >= massaFinalDesejada) {
	            massaAtual = massaAtual / 2;
	            tempoTotalSegundos += intervaloMeiaVida;
	        }
	        
	        
	        System.out.println("\n=== RESULTADO ===");
	        System.out.printf("Massa inicial:     %.3f kg  (%.3f g)%n", 
	                         massaInicialKg, massaInicialGramas);
	        System.out.printf("Massa final:       %.3f g%n", massaAtual);
	        System.out.printf("Tempo necessário:  %d segundos%n", tempoTotalSegundos);
	        
	        
	        int minutos = tempoTotalSegundos / 60;
	        int segundosRestantes = tempoTotalSegundos % 60;
	        System.out.printf("                 ≈ %d minutos e %d segundos%n", minutos, segundosRestantes);
	        
	        
	        entrada.close();
	    }
	}
