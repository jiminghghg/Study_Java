package pack02.exswitch;

public class Ex01_switch {
	public static void main(String[] args) 
		//사용빈도가 상대적으로 if문 보다는 낮기 때문에 더 중요한 것은 "if문"
		//선택문 ( switch-case)
		//다중 if문 (if else-if)를 간략하게 표현
		//값을 기준으로만 판단이 가능함.(복잡한 조건에는 사용이 까다롭다.)<=제한 사항(실무 /
	//(정해진 메뉴가 숫자 또는 정확한 문자로 되어있는 경우 가끔 사용)
		//switch(기준값) !=if (조건식)
		//case 값:
		//값이 case (값)과 같은 경우 실행
		//break; <=종료시킴.( 제어문의 탈출,가장 가까운 제어문의 중괄호 블럭킹 빠져나감.)
		int number = 10;
		switch(number%2) {// 3의 배수인지도 같이 판단이 가능할까?가능하다면 풀어보기.(삼항연사자x)
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}//swith지역
		}
 int number=10;
 
 switch(number%2) {
 case 0:
	 System.out.println("짝수");
	 break;
 }
 case 1:
	 
	
	}
	
	
	

}
