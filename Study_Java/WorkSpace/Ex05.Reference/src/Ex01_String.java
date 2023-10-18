
public class Ex01_String {
	public static void main(String[] args) {
		 //String<- 일반변수와 다름.대문자로 시작함(Class,=>우리가 계속해서 만들고있는것)
		//참조형 데이터타입('열거',클래스,'String',인터페이스,'배열')
		//문자열 비교
		//heap메모리에 데이터를 담고 stack메모리에 heap메모리의 주소부를 저장하는 경우 (참조형 데이터 타입)
		//== <= 비교연산자는 stack메모리의 값을 비교
		//stack:int num1=10,num2=10 : num1[10],num2[10]
		String str1 = "kym";
		String str2 = sc.nextLine();//stack과 heap에 새로운 메모리 번지수를 만들고 값은 저장함.
	    System.out.println("str1 : " + System.identityhashCode(str1));
	    System.out.println("str2 : " + System.identityHashCode(str2));
	    System.out.println("str3 : " + System.identityHashCode(str3));
		if(str1 == str2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		System.out.println("==는 stack메모리 참조번지수를 비교한다.");
	}

}
