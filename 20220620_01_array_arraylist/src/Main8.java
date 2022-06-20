import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));

		// 1. 합과 평균 구하기
		// 1-1. 합

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i); // 뭐야 왜 안됐어 첨에 어이업네
		}
		System.out.println("list 합: " + sum);

		// 1-2. 평균
		int avg = 0;
		for (int i = 0; i < list.size(); i++) {
			avg = sum / list.size();
		}
		System.out.println("list 평균: " + avg);
		
		// 2. 정수 57이 리스트에 있는가, 있으면 몇 번째 index인가?
		if (list.contains(57) == true) {
			System.out.println("57의 위치: " + list.indexOf(57));
		}

		// 3. 정수 23의 개수
		// 3-1. list,sublist를 사용해서 구하기 -> 안된다...
		// 잘리는 구간이 몇 개인지를 세면 23의 갯수가 나온다.
		// 이거는 근데 생각해보니까 23이 있을때 잘라주는게 아니라, 몇 번 자리까지 자른다!는 말이다.
		// 3-2. iterator을 사용하기
		Iterator<Integer> iterator = list.iterator();
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Integer itg = iterator.next();

			if (itg.equals(23) == true) {
				count++;
			}
		}
		System.out.println("23의 갯수: " + count);

		// 4. 중복되는 23을 하나만 삭제하기
		// iterator의 목적은 하나씩 다 보는것!
		// for-each와 다른 점은 for-each는 보기만 할 수 있고,
		// iterator은 변경도 가능하다는 점
		
		// 4-1. break 사용
//		while (iterator.hasNext() == true) {
//			int value = iterator.next();
//			
//			if(value == 23) {
//				iterator.remove();
//				break;
//			}
//		}
		
		// 4-2. index 사용
		// 4-2-1. 그냥 지우기
//		int index = list.indexOf(23);
//		list.remove(index);
//		System.out.println(list);
		
		// 4-2-2. 오른쪽부터 찾아서 지우기
		int index = list.lastIndexOf(23);
		list.remove(index);
		System.out.println("23을 삭제-> " + list);
		
	}
}
