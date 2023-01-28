/*앞의  클래스  Date에  print 메소드를  추가하여  같은  실행결과를  내는  프로그램을  작성하세요
•       문제  해결: 두  개의  클래스
•     Date 클래스에  메소드  print를  추가한다.
•  Print 메소드는  반환값이  없다.
•  print 메소드에서는  다음과  같이  출력하도록  한다. 
****년  **월  **일입니다.
•     Practice24 클래스
•    main 메소드  안에서는
•     클래스  Date의  객체를  생성합니다.
•     클래스  Scanner를  이용하여  입력  받은  값을  객체  소속변수에  대입합니다.
•     Date 객체의  메소드  print()를  이용하여  출력합니다.
*/

import java.util.Scanner;
public class Practice24 {
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
		
		birth.print();
	}
}