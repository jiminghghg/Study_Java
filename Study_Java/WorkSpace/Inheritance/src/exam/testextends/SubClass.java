package exam.testextends;
//상속받기 extends
//sum 메소드,minus메소드 상속받음,(기존기능)+ (SubClass기능)
public class SubClass extends SuperClass{
    //@override<-
	//@ : 어노테이션,기계가 (java)가 인식을 하는 주석
	//부모클래스의 기능을 자식클래스가 물려받아 형태를 '유지'하고 기능을 바꿈=>재정의
	@Override
	public SubClass() {
	
	public int mul (int x , int y) {
		return x*y;
	}
	public int div(int x, int y) {
		super.minus(x, y);
		return super.sum(x, y)+
	}
		return x/y;
	}
}
