
public class Ex04_IfAndor {
	public static void main(String[] args) {

		// 조건식:반드시 true,false를 반환 받는 식.
		// boolean에 담을 수 있는 값.(==조건식)

		int score = 85;
		boolean isCheckUp90 = score >= 90;// true/false
		boolean isCheckUp80 = score >= 80;
		if (isCheckUp90) {
			System.out.println("A");
		} else if (isCheckUp80) {
			System.out.println("B");
		} else {
		}
		System.out.println("A B X");

		int number = 10;

		if (number % 2 == 0) {
			System.out.println("짝수");
			if (number % 3 == 0) {
				System.out.println("배수");
			}
		}
		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("홀수 3배수x");
		} else {
			System.out.println("홀수 3배수x");
		}
		if (number % 2 == 0) {
			if (number % 3 == 0) {
				System.out.println("홀수 3o");
			} else {
				System.out.println("짝수 3x");
			}
		} else {
			if (number % 3 == 0) {
				System.out.println("홀수 3o");
			} else {
				System.out.println("홀수 3x");
			}
		}
	}

}
