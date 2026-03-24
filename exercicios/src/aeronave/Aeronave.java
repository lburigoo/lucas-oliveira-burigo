package aeronave;

public class Aeronave {

	public static void main(String[] args) {
		
		AeronavePOO Falcon = new AeronavePOO ("Falcon200", 180, 850, 26.000, 45);
		AeronavePOO Thunder = new AeronavePOO ("Thunder", 220, 920, 32.000, 60);
		AeronavePOO CloudRunner = new AeronavePOO ("CloudRunner", 150, 780, 21.000, 38);
		AeronavePOO AirCruiser = new AeronavePOO ("AirCruiser X", 300, 980, 45.000, 75);
	
		System.out.println(Falcon);
	}
	
}
