
/* 설정자  연습) Practice 28의  클래스  Date에  설정자를  추가하여  프로그램이  다음과  같이 동작하도록  필요한  부분을  수정하라. */

import java.util.Scanner;
public class Practice29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birthday.setYear(input.nextInt());
		System.out.print("태어난 월을 입력하세요 : ");
		birthday.setMonth(input.nextInt());
		System.out.print("태어난 일을 입력하세요 : ");
		birthday.setDay(input.nextInt());
		
		System.out.println("당신의 생일은 " + birthday.toString() + "입니다.");
	}
}