import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 위의 리스트에 10, 20, 30, 40 넣어보기
		// 모든 원소들 출력해보기~
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		// 출력1
		for(Object o : list) {
			System.out.println(o);
		}
		
		// 출력2
		System.out.println(list.toString());
		
		// 변경해보기
		// index 2에 있는 20을 바꿔보기
		list.set(1, 15);
		System.out.println(list);
		
		// 값으로 이것을 가지는지 안가지는지를 알 수 있다.
		System.out.println(list.contains(30));
		// 몇번 인덱스에 있는지 알 수 있다.
		System.out.println(list.indexOf(30));
		
		// 원소의 제거가 가능하다.
		// 우측에 있는 인덱스가 하나 줄어든다 ???
		// ♨ 더알아보기
		// 출력하면 10, 15, 40이다.. 왜지감자?
		list.remove(2);
		System.out.println(list);
		
		// 원소 추가하기, inedex 0번째 자리에 0을 넣어라
		list.add(0, 0);
		System.out.println(list);
		
		// 원소 다 날리기
		// 근데 왜 비버집 허물기 함 ??
		// 기껏 만든거 왜 날림 ??
		list.clear();
		System.out.println("지운 결과: " + list);
		System.out.println(list.isEmpty());
	}
}
