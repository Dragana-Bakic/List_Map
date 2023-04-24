package map;

import java.util.TreeMap;
import java.util.Map;

public class Mape_TreeMap {

	public static void main(String[] args) {

		// TreeMap čuva ključeve sortirane u prirodnom redosledu ili prema zadatom
		// komparatoru.

		// Kreiranje objekta TreeMap
		Map<String, Integer> treeMap = new TreeMap<>();

		// Dodavanje elemenata u TreeMap
		treeMap.put("Jedan", 1);
		treeMap.put("Dva", 2);
		treeMap.put("Tri", 3);
		treeMap.put("Četiri", 4);

		// Prikazivanje sadržaja mape
		System.out.println("Sadržaj mape: " + treeMap);

		// Dobijanje vrednosti na osnovu ključa
		int vrednostTri = treeMap.get("Tri");
		System.out.println("Vrednost za ključ 'Tri': " + vrednostTri);

		// Provera prisustva ključa
		boolean postojiKljuc = treeMap.containsKey("Pet");
		System.out.println("Postoji ključ 'Pet' u mapi: " + postojiKljuc);

		// Uklanjanje elementa na osnovu ključa
		treeMap.remove("Dva");

		// Provera veličine mape
		int velicinaMape = treeMap.size();
		System.out.println("Veličina mape nakon uklanjanja elementa: " + velicinaMape);

		// Iteriranje kroz mapu
		System.out.println("Iteriranje kroz mapu:");
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println("Ključ: " + entry.getKey() + ", Vrednost: " + entry.getValue());
		}
	}
}
