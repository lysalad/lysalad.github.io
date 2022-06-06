
// 콜라 1500원
// 사이다 1200원
// 4가지로 계산해서 뱉어내주는 자판기

public class Vending {
	
	
	private int coke;
	private int cider;
	int change;
	int input;
	
	public Vending () {
		// 초기화시켜주는 부분
	}

	public int getCoke() {
		return coke;
	}

	public void setCoke(int coke) {
		this.coke = coke;
	}

	public int getCider() {
		return cider;
	}

	public void setCider(int cider) {
		this.cider = cider;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}
}
