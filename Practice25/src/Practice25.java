/*Practice 24에서  작성한  클래스  Date를  이용하여  다음과  같이  동작하는  프로그 
램을  작성하세요
•        실행  예제
태어난  년도를  입력하세요: 1993
태어난  월을  입력하세요: 4
태어난  날짜를  입력하세요: 6
당신의  생일은  1993년  4월  6일입니다. 
성년자가  되는  날은  2013년  4월  6일입니다.
•        문제  해결
•      Date 클래스는  앞의  문제의  것을  그대로  사용
•      Practice25 클래스
•     main 메소드  안에서
•     클래스  Date의  2개의  객체, birthday와  adultday를  생성합니다.
•     birthday : 생일을  입력  받아  그  값을  저장
•     adultday : birthday를  이용하여  성년기준일을  계산하여  대입 
(birthday의  년도에서  20을  더하여  대입, 나머지  월과  일은  그대로  대입)
•     Date 클래스의  print() 메소드  호출하여  출력*/

import java.util.Scanner;
public class Practice25 {
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
		
		System.out.print("당신의 생일은 ");
		birthday.print();
		System.out.print("성년자가 되는 날은 ");
		adultday.print();
	}
}