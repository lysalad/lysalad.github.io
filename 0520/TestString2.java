public class TestString2{
	public static void main(String[] args){
		// Hello의 스펠들이 배치되어 있는 데는 순서가 있다. 이 모음은 index라고 한다.
		String hello = "Hello";
		
		//내가 원하는 자리에 있는 문자를 찾아내는 메소드
		//인덱스의 범위를 꼭 확인해야한다. 음수는 안된다. 0부터 시작한다.
		// 0부터 시작한다. H는 0, e는 2가 된다.
		//띄어쓰기도 하나의 문자이기 때문에 인덱스 값을 가진다. \n도 마찬가지이다.
		char h = hello.charAt(0);
		
		System.out.println(h);
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		
		
		// 문자의 길이를 확인하는 메소드
		int length = hello.length();
		System.out.println(length);	
	}
}