import java.util.Scanner;
public class Practice28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birthday.year = input.nextInt();
		System.out.print("태어난 월을 입력하세요 : ");
		birthday.month = input.nextInt();
		System.out.print("태어난 일을 입력하세요 : ");
		birthday.day = input.nextInt();
		
		adultday.year = birthday.year + 20;
		adultday.month = birthday.month;
		adultday.day = birthday.day;
		
		System.out.println("당신의 생일은 " + birthday.toString() + "입니다.");
		System.out.println("성년자가 되는 날은 " + adultday.toString() + "입니다.");
	}
}