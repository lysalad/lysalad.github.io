import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	public static boolean isNumberChar(char c) {
		return c >= '0' && c <= '9';
	}
	
	public static boolean isNumberStr(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!isNumberChar(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));

		// 1. 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
		// 일단 먼저 문자열 길이가 5글자인 원소들을 찾아내서 그 index를 알아낸다.
		// 그 index만으로 list를 다시 구성한다. -> 이걸 어케해야하누...
		// 1-1. 문자열 길이가 5글자가 아닌 애들을 삭제한다.
		// 1-2. 문자열 길이가 5글자인 애들만 모아서 sub를 만든다. -> sub는 int int를 써서... string으로 할 수가 없다.
		// 1-3. 그냥 걔네만 가지고 리스트를 만든다.
		// Iterator<String> iterator = list.iterator();
		// List<String> list5 = new ArrayList<>();
		//
		// for (int i = 0; i < list.size(); i++) {
		// String abcde = list.get(i);

		// 이렇게 하면 list가 안생기고 두 개가 따로 나온다. list가 두 개로 나옴
		// List<String> list5 = new ArrayList<>(Arrays.asList(list.get(i)));
		// System.out.println(list5);

		// sub는 int int라서 안된다..
		// 형을 바꿔서 할 수 있을것도 같은데 너무 귀찮다... 한방에 하고싶다.
		// list.subList(0, list.get(i));

		// 한 면에 하려면 역시 iterator인가?
		// 나.... 뭔지 모르겠지만.... 너무 어렵게 생각하고 있는 거 같아...

		// --------------------------------------------------------------- 다시 1

		// 1. 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
		List<String> list5 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == 5) {
				list5.add(list.get(i));
			}
		}
		System.out.println(list5);

		// 2. 문자열 중에 'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
		List<String> listContainE = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("e")) {
				listContainE.add(list.get(i));
			}
		}
		System.out.println(listContainE);

		// 1번 선생님 풀이

		// 복사본 만들기
		List<String> copy = new ArrayList<>(list);
		Iterator<String> iterator = copy.iterator();

		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() != 5) {
				iterator.remove();
			}
		}
		System.out.println(copy);

		// 3. '정수 형태의 값'을 가지는 문자열을 -> Integer 형으로 바꾸기
		// Integer i = Integer.valueOf("1234"); // -> 1234 Integer로 변환
		// Integer exp = Integer.valueOf("숫자가 아니면?"); //-> NumberFormatException 예외로
		// 처리하기
		// 베스트는 아스키를 이용하는 것이다. 근데 뭔지 모르겠뜸
		
		List<String> list2 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나"));

		// char c = "가".charAt(0); 이렇게하면 밑에 false 뜬다.
		// char c = "3".charAt(0); 이렇게 숫자로 바꾸면 아래에 true 뜬다.
		// System.out.println("가".charAt(0) > '0' && c <= '9');

		List<Integer> listInteger = new ArrayList<>();

		for (int i = 0; i < list2.size(); i++) {
			String str = list2.get(i);
			
			if (isNumberStr(str)) {
				listInteger.add(Integer.valueOf(str));
			}
//			try {
//				Integer value = Integer.valueOf(str);
//				listInteger.add(value);
//			} catch (NumberFormatException e) {
//				System.out.println("문자열을 정수형으로 변환하는데 실패하여 예외가 발생했으나 정상흐름으로 돌아가기를 원해 예외처리를 하였습니다.");
//			}
		}
		System.out.println(listInteger);
	}
}