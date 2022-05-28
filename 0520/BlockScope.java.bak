public class BlockScope { 
	public static void main(String[] args) {
		int a = 10;
		
		{
			int b = 20;
			//범위가 다르니까 같은 이름을 가진 변수를 사용할 수 있을까? = false
			// int a = 99;
			System.out.println("가능한가?");
			System.out.println(a);
			System.out.println(b);
		}
		
		// System.out.println(b);
		// 중괄호 짝만 맞으면 컴파일과 실행에 문제가 없다!
		// 중괄호로 만들어진 범위가 block 이다.
		// block이 닫히면 그 안도 닫혀서 사라진다.
		// 그래서 바깥에서 안에 있는 변수는 사용을 할 수 없다.
		// 위와 같은 상황에서 b는 지역변수라고 한다.
		// a도 지역변수이긴 한데, {}안에 있으면 무조건 지역변수이기 때문이다.
		// 하지만 a와 b의 영향 범위는 다르다.
		//a는 범위가 b보다 넓다.
	}
}