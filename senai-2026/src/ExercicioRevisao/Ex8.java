package ExercicioRevisao;

public class Ex8 {
	
	    public static void main(String[] args) {
			
	    	int[][] matriz = {
	                {210, 3, 399900},
	                {160, 3, 329900},
	                {240, 3, 369000},
	                {141, 2, 232000},
	                {300, 4, 539900},
	                {198, 4, 299900},
	                {153, 3, 314900},
	                {142, 3, 199000},
	                {138, 3, 212000},
	                {149, 3, 242500},
	                {194, 4, 240000},
	                {200, 3, 347000},
	                {189, 3, 330000},
	                {447, 5, 699900},
	                {126, 3, 259900}
	            };
	            
	          
	            long somaPrecos = 0;
	            int menorPreco = Integer.MAX_VALUE;
	            
	            
	            int maxQuartos = Integer.MIN_VALUE;
	            int minQuartos = Integer.MAX_VALUE;
	            int tamanhoMaxQuartos = 0;
	            int tamanhoMinQuartos = 0;
	            
	           
	            long somaTamanhosCaras = 0;
	            int contagemCaras = 0;
	            
	            for (int[] casa : matriz) {
	                int tamanho = casa[0];
	                int quartos = casa[1];
	                int preco = casa[2];
	                
	                somaPrecos += preco;
	                if (preco < menorPreco) {
	                    menorPreco = preco;
	                }
	                
	                
	                if (quartos > maxQuartos) {
	                    maxQuartos = quartos;
	                    tamanhoMaxQuartos = tamanho;
	                }
	                if (quartos < minQuartos) {
	                    minQuartos = quartos;
	                    tamanhoMinQuartos = tamanho;
	                }
	                
	                
	                if (preco > 300000) {
	                    somaTamanhosCaras += tamanho;
	                    contagemCaras++;
	                }
	            }
	            
	            double mediaPrecos = (double) somaPrecos / matriz.length;
	            int diferencaTamanhos = tamanhoMaxQuartos - tamanhoMinQuartos;
	            double mediaTamanhosCaras = contagemCaras > 0 ? (double) somaTamanhosCaras / contagemCaras : 0;
	            
	            
	            System.out.println("Total de casas: " + matriz.length + "\n");
	            
	            System.out.printf("a) Média dos preços das casas:          R$ %,.2f%n", mediaPrecos);
	            System.out.printf("b) Preço da menor casa:                 R$ %,d%n", menorPreco);
	            System.out.printf("c) Diferença de tamanho (maior quartos - menor quartos): %d m²%n", diferencaTamanhos);
	            System.out.printf("   → Casa com mais quartos (%d): %d m²%n", maxQuartos, tamanhoMaxQuartos);
	            System.out.printf("   → Casa com menos quartos (%d): %d m²%n", minQuartos, tamanhoMinQuartos);
	            System.out.printf("d) Média do tamanho das casas > R$ 300.000: %.2f m² (baseado em %d casas)%n", 
	                              mediaTamanhosCaras, contagemCaras);
	        }
	    }
	        


