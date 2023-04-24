package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Liste {

	/*
	 * Interfejs List je izveden iz korenog interfejsa Collection i nalazi se u
	 * paketu java.util. Sadrzi metode za dodavanje, azuriranje, brisanje i
	 * pretrezivanje elemenata, i neke druge osnovne operacije. Moze imati duplirane
	 * elemente i indeksiranje krece od 0 Lista cuva redosled dodavanja, i
	 * dozvoljava indeksni pristup i dodavanje
	 */

	public static void main(String[] args) {

		/*
		 * Java pruža nekoliko ugrađenih implementacija interfejsa "List", uključujući:
		 * 
		 * ArrayList: dinamička implementacija liste koja se bazira na nizu objekata.
		 * 
		 * LinkedList: LinkedList je implementacija liste koja se bazira na povezanim
		 * vektorima(element, pokazivač). Svaki vektor čuva referencu na sledeći vektor
		 * u listi.
		 * 
		 * Vector: Vector je starija implementacija dinamičke liste koja je bila
		 * prisutna u Javi pre nego što je uveden ArrayList. Vector je sličan
		 * ArrayList-u, ali je sinhronizovan, što znači da je bezbedan za upotrebu u
		 * multithreaded okruženju. Međutim, zbog sinhronizacije, Vector može biti
		 * sporiji od ArrayList-a u jednonitnom okruženju.
		 * 
		 * Stack: Stack je specijalna vrsta liste koja implementira LIFO (Last In, First
		 * Out) princip, što znači da poslednji element koji je dodat u listu (gornji
		 * element) prvi biva uklonjen. Stack je često korišćen u situacijama gde je
		 * potrebno pratiti redosled elemenata, na primer u algoritmima za upravljanje
		 * stekom.
		 * 
		 * Pored ugrađenih, moguće je implementirati i prilagoditi sopstvene liste u
		 * skladu sa specifičnim potrebama projekta.
		 */

		List<String> AL = new ArrayList<String>();
		List<Integer> LL = new LinkedList<Integer>();
		// Dodaje element na kraj liste
		AL.add("element");
		LL.add(0);
		AL.add("element");
		LL.add(0);
		AL.add("element");
		LL.add(0);
		AL.add("drugi");
		LL.add(2);

		// Dodaje element na određenu poziciju u listi
		AL.add(4, "petiElement");
		LL.add(3, 4);

		// Uklanja element sa određene pozicije u listi
		AL.remove(1);
		LL.remove(1);

		// Uklanja prvo pojavljivanje određenog elementa iz liste
		AL.remove("element");
		LL.remove("0");

		// Vraća element sa određene pozicije u listi
		AL.get(0);
		LL.get(3);

		// Postavlja novu vrednost na određenoj poziciji u listi
		AL.set(0, "5.Element");
		LL.set(3, 10);

		// Vraća broj elemenata u listi
		AL.size();
		LL.size();
		System.out.println("Broj elemenata niza AL: " + AL.size());
		System.out.println("Broj elemenata niza LL: " + LL.size());

		// Proverava da li lista sadrži određeni element
		AL.contains("element");
		LL.contains(0);

		// Vraća indeks prvog pojavljivanja određenog elementa u listi
		AL.indexOf("element");
		LL.indexOf(0);

		// Vraća indeks poslednjeg pojavljivanja određenog elementa u listi
		AL.lastIndexOf("element");
		LL.lastIndexOf(0);

		// Proverava da li je lista prazna
		AL.isEmpty();
		LL.isEmpty();

		// Stampanje liste
		System.out.println("Lista AL : " + AL);

		// Stampa preko Iteratora - kretanje kroz listu
		ListIterator<Integer> li = LL.listIterator();
		System.out.print("Lista LL : ");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		System.out.println("");

		// Briše sve elemente iz liste
		AL.clear();
		LL.clear();
		System.out.println("Broj elemenata niza AL: " + AL.size());
		System.out.println("Broj elemenata niza LL: " + LL.size());

	}
}
