import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		// 리터에이블?? 이라는 기능을 상속하고있다.
		// iterator
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		// 원소를 하나하나 볼 수 있도록 도와주는 또 다른 메소드(?)
		Iterator<String> iterator = list.iterator();
		// 다음 걸 하나하나 가져온다.
		// 4번 넘게 반복해서 가져오라고 하면
		// 없는 데도 가져오려고 해서 예외가 발생한다. (총 길이가 4라서)
		// 그래서 그 전에 가져올 게 있는지 물어볼 수 있다.
		// while문으로 물어보면서 반복까지 할 수 있다.
		while(iterator.hasNext()) {
			String str = iterator.next();
			
			if(str.length() == 5) {
				// iterator 보고 지워달라고 한 거라서
				// remove를 여기에 써야한다,
				// iterator가 다음을 가리키는 거라서!?!
				// iterator는 list를 참조해서
				// 다음거를 불러주는 기능을 한다.
				// (뭔말인지 100프로 이해못함)
				iterator.remove();
			}
		}
		System.out.println(list);
		
		// System.out.println(list.contains("banana"));
		
		// equals를 호출해서 동등함을 비교하고 같을 때 지운다.
		// 원소 찾아서 지우는건 list가 편하다.
		// Array는 하나하나 검색해야한다.
		// list.remove("banana");
		// System.out.println(list);
		
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
		// for-each에서는 안된다.
//		for(String s : list) {
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
	}
}
