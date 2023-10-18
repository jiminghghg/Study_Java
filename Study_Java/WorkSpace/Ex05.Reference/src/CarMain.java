
public class CarMain {
public static void main(String[] args) {
	//car 인스턴스 멤버-> Car가 인스턴스화->객체->객체.사용이 가능하다.
	Car car = new Car();
	for(int i=0; i<10; i++) {
	Car.kymMethod1("박지민");//만들어진 메소드를 호출 ->메소드의 중괄호 블럭킹 시작과끝.
	
}
	public void kymMethod2(String name,String state) {
	System.out.println(name + "(이)가 "+state + " 중 ");
	car.kymMethod1("김영문");
	car.kymMethod2("김영문","휴식");
	
	public void kymMethod3(String carName ,int price) {
	System.out.println(carName + " " + price + "원 ");
	}
	public void kyMethod4(int count) {
		for (int i = 1 ; 1<= count; i++) {
			System.out.println("출력");
		}
	}
	//뭐든지 내가 필요한 것 (리턴)
	public int rtnMethod() { 
		car.kymMethod1("김영문");
		car.kymMethod2("김영문","휴식");
		car.kymMethod3("현대차",0);
		car.kymMethod4(12);
		int result = car.rtnMethod1()
		System.out.println(car.rthMethod1()+1);
		sc.nextline();
		public int rthMethod2(int number) {
	 System.out.println("rthMethod2");
	 return number;
	}
	
	
	
}
}