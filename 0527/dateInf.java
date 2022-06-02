public class dateInf {
	
	String year;
	String month;
	String date;
	
	public String dateCheck1() {
		String check = year + "-" + month + "-" + date;
		return check;
	}
	
	
	public String dateCheck2(String year, String month, String date) {
		String check2 = year + month + date;
		return check2;
	}
	
	// String getYearTwodigit() {
		// // return String.valueOf(year % 100);
		// return String.format("%02d", year % 100);
	// }

	
}