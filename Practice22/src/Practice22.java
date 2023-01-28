/* 21번 문제를 발전시켜서 다음과 같이 동작하는 프로그램을 작성하여라.
•         정수를  입력하세요: -3
•         잘못된  입력입니다. 다시  입력하세요.
•         정수를  입력하세요: 3
•         구구단  3단입니다.
•         3 * 1 = 3
•         3 * 2 = 6
•…
•         3 * 9 = 27 */

import java.util.Scanner;
public class Practice22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		boolean check = false;
		
		while(check == false) {
			i = inputNum();
			check = inputTest(i);
		}
		printTimes(i);
	}
	
	public static int inputNum() {
		Scanner input = new Scanner(System.in);
		int i;
		
		System.out.print("정수를 입력하세요 : ");
		i = input.nextInt();
		
		return i;
	}
	
	public static boolean inputTest(int i) {
		if(i > 0) {
			return true;
		} else {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			return false;
		}
	}
	
	public static void printTimes(int i) {
		System.out.println("구구단 " + i + "단입니다.");
		
		for(int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
}