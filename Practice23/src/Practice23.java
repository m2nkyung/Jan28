/* 실행  예제
•      태어난  년도를  입력하세요: 1980
•      태어난  월을  입력하세요: 10
•      태어난  날짜를  입력하세요: 8
•      당신의  생일은  1980년  10월  8일입니다. */

/* •      Date 클래스
•      Practice23 클래스
•     main 메소드  안에서
•     클래스  Date의  객체를  생성합니다.
•     클래스  Scanner를  이용하여  입력  받은  값을
•     객체의  소속변수에  대입합니다.
•     객체의  필드  값을  읽어서  화면에  출력합니다. */

import java.util.Scanner;
public class Practice23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Date birth = new Date();
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birth.year = input.nextInt();
		System.out.print("태어난 월을 입력하세요 : ");
		birth.month = input.nextInt();
		System.out.print("태어난 일을 입력하세요 : ");
		birth.day = input.nextInt();
		
		System.out.println("당신의 생일은 " + birth.year + "년 " + birth.month + "월 " + birth.day + "일입니다.");		
	}
}