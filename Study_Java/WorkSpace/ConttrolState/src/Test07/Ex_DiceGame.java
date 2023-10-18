package Test07;

import java.util.Random;

public class Ex_DiceGame {
	public static void main(String[] args) {
		//Random함수 이용해서 enter key를 누를때 컴퓨터 번호생성,사용자 번호생성 비교 승,패,무승부
		//1.기획 <- 2.설계 3.개발
		//새로운 블럭킹을 내가 만듬.<=블럭킹 내부에서만 쓰는 변수.블럭킹 외부에서도 재사용을 해야하는지
	
		Random random = new random();//<=배운거x
		int pcNum = random.nextInt(6)+1;//0~5 > 1~6
		System.out.println("enter key를 누르면 사용자의 주사위를 굴립니다.");
		sc.nextLine();
		int userNum=random.nextInt(6)+1;
		if(pcNum > userNum) {
			System.out.println(pcNum + " > "+ userNum + "PC승!");
		}else if (pcNum < userNum) {
			System.out.println(pcNum + " < "+ userNum + "유저승!");
		}else {
			System.out.println(pcNum + " = "+ userNum + "무승부");
		}

	
	
	}
	
	
	
}
