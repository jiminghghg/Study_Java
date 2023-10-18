package member;

public class MemberDAO {
    Common common;
    
    pubic MemberDAO(Common common) {
    	this.common = common;
    }
    public void buyItem() {
    public void login(String id , String pw) {
    	MemberDTO[]memDtos = getLoginDatas();
    	for(MemberDTO dto : memDtos) {
    		if(id.equals(dti.getId()) && pw.equal
    	} else {
    		System.out.println("로그인 실패 null");
    	
    }
    public MemberDTO[] getLoginDatas() {
    	MemberDTO[] memDtos = new MemberDTO[2];
    	memDtos[0] = new MemberDTO("user","user1","김유저","김닉네임");
    	memDtos[1] = new MemberDTO("admin,"admin1","김관리","김관리");
    }
   public class Common{
   private Scanner scan;
   private MemberDTO loginInfo;
}
   public void inputMoney() {
	   System.out.println("금액입력");
	   common.loginInfo.setMoney(common.loginInfo.getMoney()+ common.getIntScanner(100))
   }
   public void displayMoney() {
	   System.out.println(common.loginInfo.getMoney()+ "원");
   }
public void startUsermode() {
	if(common,loginInfo == null)return;
	
}
public int getIntScanner(int checkValue) {
	while(true) {
		int value= getIntSanner();
		if(value > checkValue) {
			return value;
			
		}else {
			System.out.println(checkValue + "보다 큰 값 입력");
		}
	}
}
	public void startUserLogin() {
		while(true) {
			System.out.println("1.금액입력 2.상품판매 3.잔돈확인 4.종료(로그아웃)");
			System.out.println("메뉴선택");
		    int choiceMenu = common.getIntScanner();
		    if(choiceMenu==1) {
		    	login(common,getStrScanner("아이디 입력"),common.getStrScaner("패스워드 입력"));
		    if(common.loginInfo == null)return;
		    while(true) {
		    	System.out.println("1.금액입력 2.상품구매 3.잔돈확인 4.종료(로그아웃)");
		    }
		    
		    
		    }else if (common.loginInfo.getMoney() >= common.items[i].getPrice()) {
		        System.out.println("구매 완료.");
		        common.loginInfo.setMoney(common.loginInfo.getMoney)
			break;
		}else {
			System.out.println("금액 부족");
		}
	public void addItem() {
		displayItems();
	}
	return scan.nextLine();	
		}
}
	
	
	
	
	
	
	
	
	
	
