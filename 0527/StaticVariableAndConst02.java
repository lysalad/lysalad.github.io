public class StaticVariableAndConst02{
								// 여기에 final을 붙여주면 변하지 않는다.	
	public static void printTest(final int param) {
		// param++;
		System.out.println(param);
	}
	
	
	public static void main(String[] args) {
		int inner = 10;
		/* final~도 범위와 순서를 물론 가지고 있다. 변수와 사용 범위와 순서는 같다.
		초기화 하기 전에 출력하려고 하면 출력이 안 된다. */
		final int TEST_SCOPE = 20;
		
		/* 여기서 20이 메소드로 넘어가서 20이라는 수가 된다.
		거기서 param으로 변해서 ++;가 붙는다.*/
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		
		
		
		
		
		
		
			// System.out.println(inner);
			// System.out.println(TEST_SCOPE);
			
			// /*위에서 선언하고 초기화 했으므로 여기서는 안 된다.
			// final int TEST_SCOPE = 15;*/
			
			// final int BLOCK = 100;
		// }
	
		
		/* BLOCK 밖에 있으므로 compile error 발생한다.
		변수와 차이점은 변할 수 있냐 없냐의 차이 뿐이다. 나머지는 변수와 같다.
		System.out.println(BLOCK);*/
		
	}
}