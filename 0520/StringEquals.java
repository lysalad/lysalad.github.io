public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		System.out.println(a == b); //true
		// 문자열은 참조를 한다. 위와 같은 경우 == 연산자는 값을 확인하지 않고,
		// 참조하는 대상이 같은지를 확인한다. 왜냐하면 a 와 b는 둘다 Hello로 참조하는 인스턴스가 똑같기 때문이다.
		// 따라서 == 수식이 true로 나올 수밖에 없다.
		
		System.out.println(a == b);
		System.out.println(a == ("He" + llo));
		//예상 결과는 true지만 false로 나옴
		// a가 참조하는 "Hello"와 "He" + llo로 만들어진 "Hello"는 참조하는 것이 다르다.
		//관계연산자로는 문자열을 비교할 수 없다. 똑같은 모양을 가졌는지 등등
		
		//equals라는 메소드는 자기자신과 괄호안에 있는 문자열의 값이 같은지 확인한다.
		System.out.println("----- 문자열 값 동등 확인 -----");
		System.out.println(a.equals("He" + llo));
	}
}