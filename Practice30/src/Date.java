public class Date {
	private int year;
	private int month;
	private int day;
	
	public String toString() {
		String s = "";
		s += year + "년 ";
		s += month + "월 ";
		s += day + "일";
		
		return s;
	}
	
	public void setYear(int i) {
		year = i;
	}
	
	public void setMonth(int i) {
		month = i;
	}
	
	public void setDay(int i) {
		day = i;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
}