import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		// 리스트를 쉽게 만드는 방법!
		// Arrays 클래스를 사용한다.
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(list);
		
		// 이렇게 만든 데에는 add를 못쓴다.
		// 위랑 차이는... 생성자로 만들고 안만들고 차이인데
		// 그렇다고 한다...
		// 컴파일 에러 난다.
//		List<Integer> test = Arrays.asList(10, 20, 30, 40, 50);
//		test.add(60);
		
		// 이렇게 만들어주면 다 추가해준다!
		list.addAll(Arrays.asList(60, 70, 80));
		System.out.println(list);
		
		// 이렇게 하면 다 지워진다.
		list.removeAll(Arrays.asList(30, 40, 50));
		System.out.println(list);
		
		// 10, 20이 다 있냐고 물어본다. true/false로 나온다.
		System.out.println(list.containsAll(Arrays.asList(10, 20)));
		
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub); // 10, 20, 60이 나온다.
		System.out.println(list);
	}
}
