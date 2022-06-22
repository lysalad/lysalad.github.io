import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next()); // 삽입된 순서를 전혀 신경쓰지 않는다.
											// 인덱스도 없기때문에 신경쓰지 않는다.
											// 달라고 하면 그냥 하나씩 아무 순서대로 준다.
		}
		
		set.contains("banana");
		set.contains("donut");
	}
}
