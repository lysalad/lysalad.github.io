import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(); // LinkedHashSet이 들어가는 순서를 기억하라고 만든 것
												// 그렇지만 인덱스를 가지고 있지는 않다... 유감,,
		set.add("banana");
		set.add("carrot");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		for (String s : set) {
			System.out.println(s); // 왠일인지 추가된 순서가 유지되고 있었다.
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));
		
		set2.addAll(set);
		System.out.println(set2);
	}
}
