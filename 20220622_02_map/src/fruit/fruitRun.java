package fruit;
// 생과일주스 집 키오스크 만들기 ! ! ! 가격 계산하는 프로그램

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

// 딸기바나나 : 3000원
// 키위 : 3000원
// 파인애플망고 : 35000원
// 귤파인애플 : 3500원
// ABC주스 : 4000원

// 계산 결과 출력 가능
// 메뉴 추가 가능
public class fruitRun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();

		map.put("딸기바나나", 3000);
		map.put("키위", 3000);
		map.put("파인애플망고", 3500);
		map.put("귤파인애플", 3500);
		map.put("ABC주스", 4000);

		int selectNum = 0;

		// 1. 목록 보여주기
		// 2. 주문한 거 담기(그만할 때 까지 계속 반복)
		// 3. 담은거 다 계산하기

		// 4. 메뉴 추가

		System.out.println("과일주스 가게~");

		while (true) {
			System.out.print("1. 목록 , 2. 주문,  3. 메뉴 추가, 4.종료>");
			selectNum = scan.nextInt();

			// 1. 목록을 보여주려면 ? ?
			if (selectNum == 1) {
				System.out.println("목록을 보여드리겠읍니다");

				for (Entry<String, Integer> entrySet : map.entrySet()) {
					System.out.println(entrySet.getKey() + ", 가격 : " + entrySet.getValue());
				}
				continue;
			}

			if (selectNum == 2) {
				boolean stop = true;
				int stopNum = 0;
				int total = 0;
				while (stop) {
//						Collection<Integer> values = map.values();
					System.out.println("주문할 음료를 적어주세요.");
					String input = scan.next();

					total = map.get(input) + total;
					System.out.println("계속 주문하시려면 1을, 계산을 마치시려면 2를 눌러주세요.");
					stopNum = scan.nextInt();
					if (stopNum == 1) {
						continue;
					}
					if (stopNum == 2) {
						System.out.println("총 주문 금액은 " + total + "원 입니다.");
						break;
					}

				}
				System.out.println("--------- ♥주문해주셔서 감사합니다!♥ ---------");
			}
			
			if (selectNum == 3) {

				System.out.print("추가할 메뉴 이름> ");
				String menue = scan.next();
				System.out.print("메뉴의 가격은?> ");
				Integer price = scan.nextInt();
				map.put(menue, price);
				continue;
			}

			if (selectNum == 4) {
				System.out.println("주스가 나올 때 까지 잠시만 기다려주세요!");
			}
			break;
		}
	}
}
