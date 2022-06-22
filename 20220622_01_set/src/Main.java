import java.util.HashSet;
import java.util.Iterator;

// set
public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		// boolean으로 물어보면 .add 되었는지 알려준다.
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(set.size()); // 출력이 2로 나온다.
		
		System.out.println(set.toString()); // toString을 해도 중복된 건 나오지 않는다.
		
//		set.get(0); 인덱스 번호를 가지고 오는 get이라는 메소드가 없다.
		// set은 인덱스를 가지고 있지 않기 때문이다. 그래서 get이 없다.
		
		// for(int i = 0; i < set.size(); i++) { 당연히 for로  순환해서 get하는 것도 안된다.
		//	set.get(i);
		// } 
		
		// 원소를 확인하려면 for-each를 사용한다.
		for(Object o : set) {
			System.out.println(o);
		}
		
		// iterator도 사용할 수 있다.
		Iterator<Object> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
