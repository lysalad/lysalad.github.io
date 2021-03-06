public class StaticVariableAndConst {
	public static void main(String [] args) {
		
		// 변수의 선언과 초기화 i는 변수 10은 상수
		int i = 10;
		/* i++해서 11이 됐다고 하면, 10이 변한게 아니라 i의 값이 증가한 것이다.
		 변수는 변할 수 있지만(가능성을 가지고 있어서) 상수는 변하지 않는다. */
		i++;
		
		// 하지만 변하지 않는 상수에도 이름을 붙여줄 수 있다.
		final int My_NUMBER = 22;
		
		/* 이렇게 하면 compile error가 난다.
		 My_NUMBER++; */
		
		/* 변해서는 안되는 수를 표현하고자 할때, 이름이 있는 상수로 만들어 두고 활용할 수 있다.
		 상수는 정수 혹은 변수 등과 구분하기 위해서 대문자로만 보통 이름을 적어준다.
		 여러 단어를 입력하는 경우에는 _아래 하이픈을 넣는다.
		 final double PI = 3.14; 이런게 대표적인 고정된 상수! */
		
		// (예)
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);
		
		/* 초기화를 한 번만 하면 에러가 안난다. 하지만 두 번째 초기화가 또 있으면
		그때는 compile error가 발생한다.
		final도 초기화를 할 수 있지만 그 후에는 변경할 수 없다.*/ 
		final int ASDF;
		ASDF = 10;
		// ASDF = 15;
		
		//아직은 어떻게 써야 할 지 잘 모르겠구만
	}
}