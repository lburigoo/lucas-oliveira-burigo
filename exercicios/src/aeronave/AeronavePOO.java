package aeronave;

import java.lang.reflect.Constructor;

public class AeronavePOO {

	String modelo;
	int passageiros;
	double velMax;
	double capCombustivel;
	double queimaCombustivelMinuto;
	
	public AeronavePOO(String modelo, int passageiros, double velMax, double capCombustivel,
			double queimaCombustivelMinuto) {
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.velMax = velMax;
		this.capCombustivel = capCombustivel;
		this.queimaCombustivelMinuto = queimaCombustivelMinuto;
	}

	
	public String toString() {
		return "AeronavePOO [modelo=" + modelo + ", passageiros=" + passageiros + ", velMax=" + velMax
				+ ", capCombustivel=" + capCombustivel + ", queimaCombustivelMinuto=" + queimaCombustivelMinuto + "]";
	}
	
	
		
	
	 
	
}

