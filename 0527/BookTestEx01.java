
public class BookTestEx01 {
	public static void main(String[] args) {
		
		
		Book book1 = new Book();
		
		book1.title = "파도가 바다의 일이라면";
		book1.author = "김연수";
		
		book1.printAll();
		
		
		Book book2 = new Book();
		
		book2.title = "Twilight";
		book2.author = "Stephenie Meyer";
		
		book2.printAll();
		
		
		Book book3 = new Book();
		
		// book3.title = "우리가 빛의 속도로 갈 수 없다면";
		// book3.author = "김초엽";
		
		book3.printAll02("우리가 빛의 속도로 갈 수 없다면", "김초엽");
		
	}
}

