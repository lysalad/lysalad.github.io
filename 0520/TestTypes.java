public class TestTypes{
	public static void main(String[] args){
		
		char a = 65;
		
		
		
		int i = 123.456;
		double d = i;
		//int i = d; //자료를 축소하면 손실이 있을 수 있어서 컴파일 에러가 난다.
		
	    int i2 = 123.456;
		int i2 = (int) i2; //손실을 감수하더라도 하겠다! 하면 또 새로운 값이 나온다.
		System.out.println(d); //100.0으로 자료가 확장된다.
		
		

		// byte b = 10;
		// short s = 100;
		// // 뒤에 L을 붙이면 앞은 int더라도 long에 다시 담아줘야한다.
		// // 형 변환을 하고 싶으면 다시 (int)를 붙여줘야한다.
		// int i = (int)1000L;
		// int i2 = (int) 341582309285039L;
		// long l = 10000;
		
		// //byte, short sum을 하면 컴파일 에러가 난다.
		// int sum = b + s;
		// System.out.println(sum);
		// System.out.println(i2); //이상한 숫자가 나온다. 언제나 손실의 가능성을 확인해줄것!
		
	}
	
}