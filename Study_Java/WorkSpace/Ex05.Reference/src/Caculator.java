
public class Caculator {
	//Calculator 클래스는 계산기 기능을 가진 클래스 입니다.
	//기능 4가지를 구현해보기
	//기능1).plus <- 두 수를 입력받아 두 수의 합을 바로 출력하는 메소드 (반환x)
	//   2)minus <- 두 수를 입력받아 두 수의 빼기를 바로 출력하는 메소드 (반환 x)
	//   3)mul <-.. 두 수의 곱하기를 메소드 호출부로 반환해주는 메소드 -> 출력은 계산기 메인에서 함.
	//  4) div <-.. 두 수의 나누기를 메소드 호출부로 반환해주는 메소드 -> 출력은 계산기 메인에서 함.
	public void plus (int num1,int num2) {
		int result = num1 + num2;
	}
	public void minus (int num1,int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}
	public int mul (int num1,int num2) {
		int mul = num1 * num2;
		return mul;
	}
   public int div (int num1,int num2) {
	  int div = num1 % num2;
	  return div;
	   
   }
}
