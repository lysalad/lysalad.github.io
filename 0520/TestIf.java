// 제어문을 알아보자
// 제어하는 대상은 프로그램의 흐름이다.

public class TestIf{
	public static void main(String[] args) {
		
		// if (참) {
			// // 문장1
			// // 문장2
			
		// }
		
		// if (거짓) {
			// //문장 3
			// //문장 4
		// } 
		// 이 부분은 건너뛰고 쭉 프로그램이 실행된다.
		
		//적용 예시 
        boolean condition = false;
        // if~ {} 이 부분의 이름은 than 절이다.
		if (condition) {
			
        	System.out.println("1. 조건문 블록 안입니다."); // true면 얘도 같이 나온다. 1. 2.
        }
		
        System.out.println("2. 프로그램 종료"); // false면 얘만 나온다. 2.만
		
		
	}
}