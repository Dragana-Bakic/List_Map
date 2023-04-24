package map;

import java.util.Map;
import java.util.LinkedHashMap;

public class Mape_LinkedHashMap {

	public static void main(String[] args) {

		// LinkedHashMap održava redosled ubacivanja elemenata. To znači da su elementi
		// sortirani prema redosledu njihovog ubacivanja u mapu, što je različito od
		// "HashMap"F koji ne garantuju redosled elemenata i "TreeMap" koji ih sortira
		// po kljucu.

		// Kreiranje objekta LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

		// Dodavanje elemenata u LinkedHashMap
		linkedHashMap.put("Jedan", 1);
		linkedHashMap.put("Tri", 3);
		linkedHashMap.put("Dva", 2);
		linkedHashMap.put("Četiri", 4);

		// Prikazivanje sadržaja mape
		System.out.println("Sadržaj mape: " + linkedHashMap);

		// Dobijanje vrednosti na osnovu ključa
		int vrednostTri = linkedHashMap.get("Tri");
		System.out.println("Vrednost za ključ 'Tri': " + vrednostTri);

		// Provera prisustva ključa
		boolean postojiKljuc = linkedHashMap.containsKey("Pet");
		System.out.println("Postoji ključ 'Pet' u mapi: " + postojiKljuc);

		// Uklanjanje elementa na osnovu ključa
		linkedHashMap.remove("Dva");

		// Provera veličine mape
		int velicinaMape = linkedHashMap.size();
		System.out.println("Veličina mape nakon uklanjanja elementa: " + velicinaMape);

		// Iteriranje kroz mapu
		System.out.println("Iteriranje kroz mapu:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println("Ključ: " + entry.getKey() + ", Vrednost: " + entry.getValue());
		}
	}
}
