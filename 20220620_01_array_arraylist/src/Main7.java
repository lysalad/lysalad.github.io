
import java.util.*;

public class Main7 {
	// 1. 2배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기

	// 2. 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기

	// 3. 위의 리스트의 원소들을 모두 다 가지는 리스트

	// 4. 3의 리스트를 오름차순으로 정렬된 원소를 가지는 리스트

	// 5. Random객체를 사용해서 0~10까지의 난수를 6개 가지는 리스트(각 숫자값은 중복 X)

	public static void main(String[] args) {

		// 1번 2번 -> 생성자로 만들어줘야지 나중에 안을 만질 수 있다??ㄴ
		List<Integer> listOf2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		List<Integer> listOf7 = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));

		// 1번 2번 출력 확인
//		System.out.println(listOf2);
//		System.out.println(listOf7);

		// 3번 -> addAll을 사용한다.
		List<Integer> listOfTwoNum = new ArrayList<Integer>();
		listOfTwoNum.addAll(listOf2);
		listOfTwoNum.addAll(listOf7);
		System.out.println(listOfTwoNum);

		// 3번 for문으로는 어케하누
		// for(int i = 0; i < listOfTwoNum.size(); i++) {
		// listOfTwoNum.
		// }

		// 4번 -> collection과 sort를 사용한다.
		Collections.sort(listOfTwoNum);
		System.out.println(listOfTwoNum);

		// 5번
		List<Integer> randomNumList = new ArrayList<>();
		Iterator<Integer> iterator = randomNumList.iterator();
		Random random = new Random();

		// 중복 제거를 위해 for문을 while로 바꿔준다.
		while (randomNumList.size() < 6) {
			// for (int i = 0; i < 7; i++) {

				int randomNum = random.nextInt(11);

				if (!randomNumList.contains(randomNum)) {
					randomNumList.add(randomNum);
				}
				randomNumList.add(randomNum);
				// 이렇게 쓰면 [] 가 여섯개 출력된다.
//			Collections.fill(randomNumList, randomNum);
				// 이렇게 쓰면 0~10까지의 숫자 한개가 한개 두개 세개 네개 다섯개 여섯개 나온다...
//			randomNumList.add(randomNum);
			//}
		}
		System.out.println(randomNumList);
	}
}
