package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(-4);
		
		Collections.reverse(numeros);
		
		System.out.println(numeros);
		
		
		
	}
}
