import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
				
		// setA와 setB를 모두 합친 set을 만들려면 ?
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		System.out.println(setUnion);
		
		// set은 집합 연산에 아주 특화되어잇따.
		// 관련된걸 다 메소드로 제공하고 있따.
		
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);
		System.out.println(setDuplicate); // 중복되는 부분만 남기고 지운다. 교집합만 남게 된다.
		
		Set<Integer> setLeftOuter = new HashSet();
		setLeftOuter.addAll(setA);
		setLeftOuter.remove(setB);
		System.out.println(setLeftOuter); // 중복되고 남은 것 중 왼쪽 집합의 것을 출력한다.
		
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		System.out.println(setSame.equals(setUnion)); // 같은 집합인지 아닌지 확인해준다.
	}
}
