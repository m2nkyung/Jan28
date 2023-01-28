public class Date {
	int year;
	int month;
	int day;
	
	public String toString() {
		String s = "";
		s += year + "년 ";
		s += month + "월 ";
		s += day + "일";
		
		return s;
	}
}