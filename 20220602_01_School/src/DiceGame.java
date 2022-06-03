// 교재 208~209pp.
// Ctrl + shift + O 하면 자동으로 import 만들어준다.

import java.util.*;

class DiceGame { // 숫자 두 개를 관리하고 사용자가 게임을 할 수 있게 흐름을 만들어낸다.
	int diceNum; // random으로 만들어낸다.
	int userGuess; // 사용자에게 받을 값 변수.

	// private랑 public을 쓰는 차이는?
	// public으로 만들면  밑에 리턴을 하기 만들어야한다.
	// 그리고 대입연산을 받을 수 있게 해줘야한다.
	private void RollDice() {
		Random random = new Random();
		// diceNum = (int) (Math.random(6) + 1);
		diceNum = random.nextInt(6) + 1;
		// return random.nextInt(6) + 1;
		// ♨이렇게 되면 값이 자꾸 변할 가능성이 생긴다.
	}

	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		
		// void로 만든 뒤에 getUserInput에서 반환값을 받지 않고
		// 바로 넣어줄 수도 있다. 의도에 따른 방법이 다른 것이다.
		// 
	}

	public void startPlaying() {
		while (true) {
			userGuess = getUserInput("예상값을 입력하세요: ");
			RollDice();
			boolean result = checkUserGuess();
			if (result) {
				break;
			}
		}
	}

	private boolean checkUserGuess() {
		if (diceNum == userGuess) {
			System.out.println("맞았습니다");
			return true;
		} else {
			System.out.println("틀렸습니다.");
			return false;
		}
	}

}
