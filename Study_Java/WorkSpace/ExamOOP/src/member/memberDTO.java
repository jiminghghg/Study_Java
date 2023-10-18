package member;

public class memberDTO {
	private String id,pw, name,nickname;
	private int money;
	private boolean isAdmin;//<= 데이터가 true이면 관리자 else 사용자
	
	public String getStrScanner(String msg) {
		System.out.println(msg);
		return getStrScanner();
	}
	
	
	public String getStrScanner() {
		return scan.nextLine();
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNickname() {
		return nickname;
	}



	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public boolean isAdmin() {
		return isAdmin;
	}



	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}



	public memberDTO(String id, String pw, String name, String nickname) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
	}



	public memberDTO(String id, String pw, String name, String nickname) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
	        
}
	public void endProgrem() {
		if(scan ! = null)scan.close();
		scan = null;
	}
	
	
}