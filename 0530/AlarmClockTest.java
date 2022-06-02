// 교재 216pp. AlarmClockTest

class Time { //현재 시간과 알람 시간을 알려준다.
	private int time;
	private int minute;
	private int second;
	
	// 시, 분, 초를 초기화 하기 위한 생성자
	public Time(int t, int m, int s) {
		time = t;
		minute = m;
		second = s;
	}
	
	public int getTime() {
		return time;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void printAll() {
		//여기 채워야함
	}
	
}

class AlarmClock {
	private Time currenTime;
	private Time alarmTime;
	
	public AlarmClock(Time a, Time c) {
		alarmTime = a;
		currenTime = c;
	}
	
	public Time getCurrentTime() {
		return currenTime;
	}

}

public class AlarmClockTest {
	public static void main(String args []) {
		Time alarm = new Time(6, 0, 0);
		Time current = new Time(12, 56, 34);
		AlarmClock c = new AlarmClock(alarm, current);
		
		int hour = c.getCurrentTime().getTime();
		System.out.println(hour.getTime());
		System.out.println(hour);
		
		System.out.println(c); // AlarmClock@15db9742 이렇게 이상하게 나오는 게 맞음
		//정보를 보고싶고 콘솔로 출력된걸 보고싶다면 getter setter를 만들고
		//출력되게 나오는 메소드를 만들어야한다.
	}
}