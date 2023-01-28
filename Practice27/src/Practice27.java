/*[toString() 메소드  연습] 프로그램이  아래와  같이  동작하도록  클래스  Date에  메소드 
toString을  추가하여라.
public class Date  {
int year;
int month;
int day;
// toString 메소드  추가 */

import java.util.Scanner;
public class Practice27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Date birthDay = new Date();
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birthDay.year = input.nextInt();
		System.out.print("태어난 월을 입력하세요 : ");
		birthDay.month = input.nextInt();
		System.out.print("태어난 일을 입력하세요 : ");
		birthDay.day = input.nextInt();
		
		System.out.print("당신의 생일은 " + birthDay.toString() + "입니다");
	}
}