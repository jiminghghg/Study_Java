package Package01;

public class TestFieldMain {
		public static void main (String[] arg) {
			TestField tf = new TestField();//TestField내부에 있는 모든 멤버가 메모리에 올라가서 사용준비마침
			//TestField내부에 있는 모든 변수들은 각타입의 기본값을 가진다 ->(숫자.0 ,null)
			System.out.println(tf.inField);
		   System.out.println(tf.booleanField);
		   tf.random = new 
			//1.클래스 기본과 필드
			//.클래스 중괄호 사이에 있는 모든 것들은 멤버라고 표현 함.
			//->main메소드 (멤버),변수(멤버)
		   //.Field(전역변수,클래스의 멤버,인스턴스 멤버,인스턴스 변수,iv)
		   //.필드부에는 내가 알고있는 모든것을 쓸수있음
		   //필드에 선언된 모든 변수들은 외부에서 인스턴스화 과정을 거치면 기본값을 가짐
		   //.인스턴스화:클래스 변수명=new 클래스();
		}
}
