import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class NewMain {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1250);
		map.put(2, 1260);
		map.put(3, 1270);
		map.put(4, 1280);

		System.out.println(map);

		HashMap<Integer, Integer> map2 = new HashMap<>();

		for (Integer i : map.keySet()) {
			Integer value = map.get(i);

			map2.put(value, i);

		}

		System.out.println(map2);

		List<Integer> list1 = new ArrayList();

		for (Integer i : map.keySet()) {
			Integer value = map.get(i);

			list1.add(i);
			list1.add(value);

		}

		System.out.println(list1);

		HashMap<Integer, Integer> funkcja1 = new HashMap();
		funkcja1.put(1, 2);
		funkcja1.put(2, 4);
		funkcja1.put(3, 8);
		funkcja1.put(4, 16);

		HashMap<Integer, Integer> funkcja2 = new HashMap();
		funkcja2.put(88, 3);
		funkcja2.put(89, 5);
		funkcja2.put(90, 9);
		funkcja2.put(91, 17);

		/*HashMap<Integer, Integer> zlozenie1 = new HashMap<>();
		zlozenie1.put(1, 3);
		zlozenie1.put(2, 5);
		zlozenie1.put(3, 9);
		zlozenie1.put(4, 17);
		*/
		//System.out.println(zlozenie1);
		
		Map<Integer,Integer> mapaZlozona=Funkcje.zlozenie(funkcja1, funkcja2);

	}
}
