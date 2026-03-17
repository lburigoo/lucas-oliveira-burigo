package mercado;

public class Mercado {

	public static void main(String[] args) {
		
		MercadoPOO unidadeDeBlumenau = new MercadoPOO();
		
		unidadeDeBlumenau.nomeMercado = "Mercado Blumenau";
		unidadeDeBlumenau.macaVendidaAno = 3000;
		unidadeDeBlumenau.precoMaca = 1.20;
		unidadeDeBlumenau.laranjaVendidaAno = 4000;
		unidadeDeBlumenau.precoLaranja = 1.00;
		
		MercadoPOO unidadeDeJoinville = new MercadoPOO();
		
		unidadeDeJoinville.nomeMercado = "Mercado Joinville";
		unidadeDeJoinville.macaVendidaAno = 5000;
		unidadeDeJoinville.precoMaca = 1.10;
		unidadeDeJoinville.laranjaVendidaAno = 3000;
		unidadeDeJoinville.precoLaranja = 1.50;
		
		MercadoPOO unidadeDeFlorianopolis = new MercadoPOO();
		
		unidadeDeFlorianopolis.nomeMercado = "Mercado Floripa";
		unidadeDeFlorianopolis.macaVendidaAno = 7000;
		unidadeDeFlorianopolis.precoMaca = 0.50;
		unidadeDeFlorianopolis.laranjaVendidaAno = 6500;
		unidadeDeFlorianopolis.precoLaranja = 1.25;

	}

}
