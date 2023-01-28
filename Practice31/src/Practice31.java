//키와  몸무게  그리고  몇  개의  메소드를  갖는  Person이란  클래스를  아래와  같이  정의하고  다음과  같이 실행되도록  하라.

import java.util.Scanner;
public class Practice31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Person me = new Person();
		Person you = new Person();
		
		System.out.print("내 키를 입력하세요 : ");
		me.setHeight(input.nextInt());
		System.out.print("내 몸무게를 입력하세요 : ");
		me.setWeight(input.nextInt());
		
		System.out.print("당신 키를 입력하세요 : ");
		you.setHeight(input.nextInt());
		System.out.print("당신의 몸무게를 입력하세요 : ");
		you.setWeight(input.nextInt());
		
		if(me.isTallerThan(you) == true) {
			System.out.println("키는 내가 더 큽니다.");
		} else {
			System.out.println("키는 당신이 더 큽니다.");
		}
		
		if(needDiet(me) == true) {
			System.out.println("나는 다이어트가 필요합니다.");
		} else {
			System.out.println("나는 다이어트가 필요없습니다.");
		}
		
		if(needDiet(you) == true) {
			System.out.println("당신은 다이어트가 필요합니다.");
		} else {
			System.out.println("당신은 다이어트가 필요없습니다.");
		}
	}
	
	public static boolean needDiet(Person a) {
		if (a.getWeight() > a.idealWeight()) {
			return true;
		} else {
			return false;
		}
	}
}