/*가로  입력: 10 
세로  입력: 20 
면적은  200 
둘레는  60*/

import java.util.Scanner;
public class Practice26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.print("가로 입력 : ");
		rec.w = input.nextInt();
		System.out.print("세로 입력 : ");
		rec.h = input.nextInt();
		
		System.out.println("면적은 " + rec.area());
		System.out.println("둘레는 " + rec.perimeter());
	}
}