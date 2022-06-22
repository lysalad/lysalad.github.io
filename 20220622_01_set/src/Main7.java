import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(); // TreeSet은 하나하나 가지를 치면서 작은거부터 보여준다.
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(22);
		set.add(30);
		
		for (int i : set) {
			System.out.println(i);
		}
	}
}
