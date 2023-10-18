package pack04.exwhile;

public class Ex01_While {
	public static void main(String[] args) {
		//for ,while
		//for :정해진 횟수를 정확히 인지하고있을때.
		// ex)구구단의 경우 몇단까지 출력할지를 우리가 인지하고 있다(숫자로 알고있음,8(2~9)*9(1~0))
		//while : 정해진 횟수를 정확히 모르나,어떤 조건에 의해서 반복해야할때.
		// ex)단순하게 무한반복을 하다가,종료키를 이용하여 꺼야할때,데이터를 가져왔는데 건수를모름.
		//for(int i = 0;i<10;i++){}
		int i = 0;
		while(i<10) {
			System.out.println("while1반복");
			i++;
		}
		i= 0;// <= 제어 변수가 제어문 외부에 있을때 단점.
		while(i<10) {
			System.out.println("while2반복");
			i++;
		}
		//while문을 이용해서 1부터10까지의 합을 구하는 프로그램을 작성하세요.
		while(i<10) {
			System.out.println("while1반복");
			i++;
		}
		int sum=0;
		i=0;
		while(i<=10) {
			sum+=i;
			i++;
			
		}
}

}
	int i = 1,
	while(i<9) {
		System.out.println("while9 반복");
		j++;
		}
       i++;
       }









