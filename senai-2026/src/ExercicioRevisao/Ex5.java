package ExercicioRevisao;

import java.util.Scanner;

public class Ex5 {
	
	

	    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        int inscricao;
        double altura;
        
        
        int inscricaoMaisAlto = 0;
        double alturaMaisAlto = -1;     
        
        int inscricaoMaisBaixo = 0;
        double alturaMaisBaixo = 1000;  
        
        double somaAlturas = 0;
        int quantidade = 0;
        
        System.out.println("Cadastro de atletas");
        System.out.println("Digite 0 no número de inscrição para encerrar\n");
        
        while (true) {
            System.out.print("Número de inscrição: ");
            inscricao = entrada.nextInt();
            
            
            if (inscricao == 0) {
                break;
            }
            
            System.out.print("Altura (em metros): ");
            altura = entrada.nextDouble();
            
            
            
            quantidade++;
            somaAlturas += altura;
            
            
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                inscricaoMaisAlto = inscricao;
            }
            
           
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                inscricaoMaisBaixo = inscricao;
            }
        }
        
        
        System.out.println("\n=== RESULTADO ===");
        
        if (quantidade == 0) {
            System.out.println("Nenhum atleta foi cadastrado.");
        } else {
            System.out.printf("Atleta mais alto:    inscrição %d - %.2f m%n", 
                             inscricaoMaisAlto, alturaMaisAlto);
            
            System.out.printf("Atleta mais baixo:   inscrição %d - %.2f m%n", 
                             inscricaoMaisBaixo, alturaMaisBaixo);
            
            double media = somaAlturas / quantidade;
            System.out.printf("Altura média:        %.2f m%n", media);
            
            System.out.println("Quantidade de atletas cadastrados: " + quantidade);
        }
        
        entrada.close();
    }
}