import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 배열처럼 여러개의 자료를 가질 수 있다.
		// 길이값을 정해주지 않고, 추가만 하면 된다.
		// 기본형은 다룰 수 없고 객체만 다룰 수 있다.
		ArrayList list = new ArrayList();
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		// 객체의 형태가 아니라도 일단 된다.
		// 왜냐하면 자동으로 boxing을 해준다.
		list.add(500); // auto-boxing
		list.add(123.123);
		
		// length랑 비슷하게 size로 넣은 갯수를 알 수 있다.
		
//		int size = list.size();
//		System.out.println(size);
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		// 배열과 거의 같다.
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
		
		
		for(Object o : list) {
			System.out.println(o);
		}
	}
}
