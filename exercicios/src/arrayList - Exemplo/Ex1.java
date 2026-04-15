package arrayList;


import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Lucas");
		nomes.add("João");
		nomes.add("Pedro");
		nomes.add("Jéssica");
		nomes.add(2, "José");
		nomes.add("0");
		
		System.out.println(nomes);
		
	}
}
