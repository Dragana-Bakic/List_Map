package map;

import java.util.HashMap;
import java.util.Map;

public class Mape_HashMap {

	/*
	 * Interfejs Map je jedna od kolekcija unutar java.util paketa koja se koristi
	 * za čuvanje parova ključ-vrednost. Svaki kljuc je povezan sa odredjenom
	 * vrednoscu. Jednom sacuvana vrednost se kasnije moze pretraziti koristeci samo
	 * kljuc.
	 * 
	 * HashMap, TreeMap, ConcurrentHashMap, LinkedHashMap.
	 *
	 */

	public static void main(String[] args) {

		// HashMap<K, V>

		/*
		 * Jedan objekat je koriscen kao kljuc (indeks) za drugi objekat (vrednost).
		 * Prilikom dodavanja duple vrednosti kljuca, vrednost vec postojeceg kljuca ce
		 * biti zamenjena novom. Null vrednosti - jedna za kljuc, vise za vrednosti. Ne
		 * postoji redosled mape i za koriscenje je potrebno importovati
		 * java.util.HashMap.
		 */

		Map<String, Integer> hashMap = new HashMap<>();

		// Dodavanje elemenata u HashMap
		hashMap.put("Jedan", 1);
		hashMap.put("Dva", 2);
		hashMap.put("Tri", 3);
		hashMap.put("Četiri", 4);

		// Prikazivanje sadržaja mape
		System.out.println("Sadržaj mape: " + hashMap);

		// Dobijanje vrednosti na osnovu ključa
		int vrednostTri = hashMap.get("Tri");
		System.out.println("Vrednost za ključ 'Tri': " + vrednostTri);

		// Provera prisustva ključa
		boolean postojiKljuc = hashMap.containsKey("Pet");
		System.out.println("Postoji ključ 'Pet' u mapi: " + postojiKljuc);

		// Uklanjanje elementa na osnovu ključa
		hashMap.remove("Dva");

		// Provera veličine mape
		int velicinaMape = hashMap.size();
		System.out.println("Veličina mape nakon uklanjanja elementa: " + velicinaMape);

		// Iteriranje kroz mapu
		System.out.println("Iteriranje kroz mapu:");
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("Ključ: " + entry.getKey() + ", Vrednost: " + entry.getValue());

		}

	}

}
