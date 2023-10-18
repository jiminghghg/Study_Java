package ewam.changetp3;

public class Main {
public static void main(String[] args) {
	//부모클래스 변수명 = 자식클래스;자동 타입 변환
	//자식클래스 변수명 = (타입)부모클래스;강제 타입 변환
	Child child = new Child();
	Parent parent = new Parent();
	
	parent= child;
	parent.method1();
	parent.method2();
	System.out.println("부모 클래스= 자식클래스 가능(0)");
    child = parent;

}
}
