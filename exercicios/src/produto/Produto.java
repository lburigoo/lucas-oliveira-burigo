package produto;

public class Produto {

	public static void main(String[] args) {
		
		ProdutoPOO p1 = new ProdutoPOO();
		
		p1.nome = "Caderno";
		p1.descricao ="Caderno em espiral tamanho médio";
		p1.precoUnitario = 4.50;
		p1.desconto = 15;
		
		ProdutoPOO p2 = new ProdutoPOO();
		
		p2.nome = "Caneta ESF";
		p2.descricao ="Caneta esferográfica 5mm";
		p2.precoUnitario = 1.20;
		p2.desconto = 2;
		
		ProdutoPOO p3 = new ProdutoPOO();
		
		p3.nome = "Esqueadro";
		p3.descricao ="Esquadro de acrílico 20 cm";
		p3.precoUnitario = 2.35;
		p3.desconto = 10;
	}
}
