
public class MemberMain {
    public static void main(String[] args) {
		
	 //메소드 이름이 중복되면 코드 오류.
	//메소드 오버로딩 : 같은 이름의 메소드를 파라메터 타입 또는 개수를 달리해서 
	//중복시켜서 사용하는 방식
	
	
	int ifield;
	static int sField;
	
	public void iMethod() {
	    System.out.println(iField + "인스턴스 메소드" + sField);
	
	}
	public void iMethod(int param) {
		System.out.println("파라메터 1개");
	}
	public void iMethod(string param) {
		System.out.println("파라메터 1개");
	}
	public void iMethod(String param , int param2) {
		System.out.println("파라메터 2개");
	}
	
}
