import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박"));
		int selectNum = 0;
		// 콘솔 입출력 만드는데
		// 과일 목록 보여주기
		// 과일 주기(제일 앞에거부터 줌)
		// 과일 추가하기 -> 최대 10개

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1. 과일 목록 보기  | 2. 과일을 드리자! | 3. 과일 추가  | 4.프로그램 종료 ");
	 
			selectNum = scan.nextInt();

			// 1. 과일 목록 보여주기 -> for-each말고 get으로 하면 더 예쁘게 나올 수 있을 듯

			if (selectNum == 1) {
				System.out.println("=============================");
				System.out.println("지금 드릴 수 있는 과일은 \n");

				for (Object o : list) {
					System.out.println(o);
				}
			}

			if (selectNum == 2) {
				Iterator<String> iterator = list.iterator();
				int choice = 0;
				

				while (iterator.hasNext()) {
					String str = iterator.next();

					for (int i = 0; i <= list.size(); i++) {
						list.get(i);
						System.out.println("과일을 드리겠읍니다  1을 입력해 받으세요!\n");
						choice = scan.nextInt();
						
						// try { try catch로 더 이상 과일이 없습니다. 만들어보기
						if (choice == 1) {
							System.out.println("[" + list.get(i) + "]" + " 을 받으셨습니다.\n");
							System.out.println("더 받으시겠습까? > 1. 예, 2. 아니오");
						} else if(iterator.hasNext() == false) {
							System.out.println("이제 과일이 없어요...");
						} else {
							System.out.println("프로그램이 종료됩니다.");
							break;
						}

						// }
					}

				}
			}

			if (selectNum == 3) {
				System.out.println("추가할 과일은?");
				String fruit = scan.next();

				list.add(fruit);
			}
			
			if (selectNum == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
