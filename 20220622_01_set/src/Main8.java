import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}
	
	public int getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(title, price);
//		// 이렇게 설정해주면 똑같은 hash숫자를 만들어준다.
//		// set을 쓰고싶으면 hash를 재정의 해줘야 중복을 잡아준다.
//	}
	
	// 이클립스에서 만들어주는 hash
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + price;
//		result = prime * result + ((title == null) ? 0 : title.hashCode());
//		return result;
//	}
	
	// 이클립스에서 만들어주는 hash2 이게 우리가 먼저 만든거와 비슷한 모습
	// Object에 있다.
	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	
}

public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책1", 5000);
		Book b3 = new Book("책2", 7000);
		Book b4 = new Book("책3", 4000);
		
//		Set<Book> tree = new TreeSet<>();
//		tree.add(b1);
//		tree.add(b2);
//		tree.add(b3);
//		tree.add(b4);
		
//	System.out.println(tree);
		
		Comparator<Book> com = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		Set<Book> treeByPrice = new TreeSet<>(com);
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		
		System.out.println(treeByPrice);
		
		
		
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		// set은 Hash를 살펴서 중복을 찾아낸다.
//		// Hash가 다르면 다르다고 판단한다.
//		// b1이 가지고 있는 인스턴스의 Hash와 b2가 가지고 있는 인스턴스의 Hash가 다르다.
//		// Hash는 각 객체를 나타낼 수 있는 고유한 번호로 만들어줄 수 있다.
//		Set<Book> set = new HashSet<>();
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		
//		System.out.println(set.size());
//		System.out.println(set); // 여기서 같은걸 못 잡아낸다. 갑자기 ???
//		// Hash를 987로 넣어주면 이제 책이 두 개 출력된다.
//		// set이 일하는 순서가 먼저 Hash를 살피고, 그 다음 equals까지 사용한다.
	}
}
