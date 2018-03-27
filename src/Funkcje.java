import java.util.HashMap;

public class Funkcje {

	public static HashMap<Integer, Integer> zlozenie(HashMap<Integer, Integer> f, HashMap<Integer, Integer> g) {

		HashMap<Integer, Integer> wynik = new HashMap();
		for (Integer key : f.keySet()) {

			Integer value = f.get(key);
			if (g.containsKey(value)) {
				wynik.put(key, g.get(value));
			}
		}

		return wynik;
	}
}
