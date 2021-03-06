public class IntegerToString {
	
	public static void main(String[] args) {
		
		//static method라고 한다. 클래스 이름으로 사용하는 메소드이다.
		//valueOf method는 괄호 안에 문자열로 바꾸고 싶은 자료를 넣어주면 문자열로 바꿔준다.
		String strNum = String.valueOf(12345);
		System.out.println(strNum);
		
		// 메소드를 사용하지 않고 문자열로 바꾸는 방법이다.
		String strNum2 = "" + 12345;
		
		int i = 5055;
		String strNum3 = "" + i;
		System.out.println(strNum3.charAt(0));
		
		System.out.println(i + 100);
		System.out.println(strNum2 + 100);
	}
}