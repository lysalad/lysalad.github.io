public class StringMethods{
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o");
		System.out.println(index);
		
		//찾는 글자가 없으면 결과를 -1로 출력한다.
		int notFound = hello.indexOf("a");
		System.out.println(notFound);
		
		int index2 = hello.indexOf("ll");
		System.out.println(index2);
		
		//오른쪽에서부터 찾을때 lastindexOf
		int index3 = hello.lastIndexOf("l");
		System.out.println(index3);

		}
}