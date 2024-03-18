package practicaSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Casillas");
		map.put(3, "Piqué");
		map.put(7, "Villa");
		map.put(11, "Capdevila");
		map.put(16, "Busquets");
		map.put(18, "Pedrito");
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xabi Alonso");
		map.put(6, "Iniesta");
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			System.out.println("Clave: " + key + "--> valor: " + map.get(key));
		}
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.get(6));
		map.remove(18);
		System.out.println(map.get(18));
		
		System.out.println("Existe 18?" + map.containsKey(18));
		System.out.println(map.containsKey(1));
		map.clear();
		System.out.println(map.size());
	}

}
