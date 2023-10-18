package pack01;
//DAO : 기능 (메소드)를 모아놓음.(<- DTO를 활용해서 CRUD,Create,Read,Update,Delete)
public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//IO
		String id = scan.nextLine();
		String pw = scan.nextLine();
		//login 메소드를 호출하여
		//아이디가 admin이고 비밀번호가 admin1234와 일치한다면 "로그인 되었습니다"
		//그 외 -> "아이디 또는 비밀번호를 확인 해주세요."
		if(id=="admin"&& pw == "admin1234") {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("아이디 또는 비밀번호 확인!");
		}
		//아이디가 admin이고 비밀번호가 admin1234와 일치한다면 "로그인 되었습니다"
		//그 외-> "아이디 또는 비밀번호를 확인 해주세요."
		
	}else {
		System.out.println("아이디 또는 비밀번호 확인");
		//login메소드를 호출하여 
		//아이디가 admin이고 비밀번호가 admin1234와 일치한다면
		}
		

}
