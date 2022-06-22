import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일", 1);
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		// 맵의 크기? 길이?
		System.out.println(map.size());
		// get안에 들어간 키의 value값을 찾아준다.
		System.out.println(map.get("이"));
		System.out.println(map.get("삼"));
		System.out.println(map.get("오"));
		// 중복되는 키는 입력이 되지 않는다. 가 아니네 입력된다.
		// 중복되는 값을 넣고싶지 않으면 먼저 물어봐야한다.
		// if로 걸러주면 안들어간다.
		if(!map.containsKey("이")) {
			map.put("이", 2222);
		}
		System.out.println(map.get("이"));
		
	}
}
