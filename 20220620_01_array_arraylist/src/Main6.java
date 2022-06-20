
import java.util.*;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		// 오름차순으로 정렬하기
		Collections.sort(list);
		System.out.println(list);
		
		// 해당하는 원소의 인덱스 찾기
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: " + index);
		
		// 내림차순 정렬하기
		Collections.reverse(list);
		System.out.println(list);
		
		// 순서 섞기
		Collections.shuffle(list);
		System.out.println(list);
		
		// 원소 중 최댓값
		// 원소 중 최솟값
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		// 전부 오른쪽 원소로 채우는 것
		Collections.fill(list, 33);
		System.out.println(list);
		
		// 하나를 찾아서 다른걸로 바꿔준다.
		Collections.replaceAll(list, 33, 77);
		System.out.println(list);
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		// 인스턴스에 넣은 걸 뒤집어서 앞에서부터 넣어준다.
		// 새 칸이 있어야 복사가 된다. -> 자리를 지우거나 clear를 써서 칸이 없으면 안된다.
		Collections.copy(list, target);
		
		System.out.println(list);
	}
}
