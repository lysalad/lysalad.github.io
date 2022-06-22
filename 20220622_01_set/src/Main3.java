import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다", "다", "가", "라"));
		
		Set<String> set = new HashSet<>(list); // 리스트에 있는 걸 다 set에 넣어주면 중복을 거를 수 있다.
		System.out.println(set);
		// list를 set에 넣는 방법2
//		Set<String> set = new HashSet<>();
//		()에 list를 넣는다.
	//	Set<String> set = new HashSet<>(list);
		
		
		// list를 set에 넣는 방법 1
	//	for(int i = 0; i < list.size(); i++) {
	//		set.add(list.get(i));
	//	}
	//	System.out.println(set);
		
		
		
	}
}
