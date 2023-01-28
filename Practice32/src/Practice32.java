/* •      사각형의  가로를     입력: 10
•      사각형의  세로를     입력: 20
•      사각형의  가로는  10이고  세로는  20이다.
•      사각형의  넓이는  200이다. */

import java.util.Scanner;
public class Practice32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Square sq = new Square();
		
		System.out.print("사각형의 가로를 입력 : ");
		sq.setWidth(input.nextInt());
		System.out.print("사각형의 세로를 입력 : ");
		sq.setHeight(input.nextInt());
		
		System.out.println("사각형의 넓이는 " + sq.area());
	}
}