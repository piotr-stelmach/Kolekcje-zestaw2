import java.util.List;
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

	}
}
