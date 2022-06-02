public class Book {
	String title;
	String author;
	
	// void를 한 이유는 ? = 
	// 반환값을 안 가지고 출력만 해줄 것이기 때문이다.
	public void printAll() {
		System.out.println(title);
		System.out.println(author);
	}
	
	
	public void printAll02(String title, String author) {
		String result = "제목은 " + title + ", 저자는 " + author;
		System.out.println(result);
	}
}