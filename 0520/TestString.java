//문자열(기초형이 아니라 참조형 타입)

public class TestString {
	public static void main(String[] args){
		// 문자열을 쓸때는 String 참조형 박스를 사용한다.
		//참조형은 대문자로 시작한다. 클래스를 불러오는 상자기때문에 클래스 이름과 같다. 그래서 대문자로 시작한다.
		String str;
		str = "Hello World";
		System.out.println(str);
		
		String s2 = "다음 문자열";
		System.out.println(s2);
		
		String concat = str + (1 + 2) + "\n" + true + s2 + 3.0;
		System.out.println(concat);
		
	}
}