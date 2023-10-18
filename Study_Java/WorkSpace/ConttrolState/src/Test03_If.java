
public class Test03_If {
	public static void main(String[] args) {
		int number = 10;
		if(number%2 == 1) {
		   System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
	
		//해당 수가 3의 배수인지,아닌지를 if-else문으로 풀어보기.
		if(number% 3==0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수x");
		}
	
	
	}

}
