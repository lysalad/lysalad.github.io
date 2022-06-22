import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("둘리", 100);
		map.put("홍길동", 90);
		map.put("도우너", 150);
	
		
		
		Map<Integer, String> map2 = new HashMap<>();
		
		map2.put(1, "둘리");
		map2.put(4, "홍길동");
		map2.put(3, "도우너");
		
		//entry는 키와 value를 한 데 묶은 것이다.
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		/*
		System.out.println(map.toString());
		
		Set<String> keySet = map.keySet();
		
		for (String key : keySet) {
			System.out.println(key + "=" + map.get(key));
		}
		
		
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			
			System.out.println(key + "=" + value);
		}
		*/
	}
}
