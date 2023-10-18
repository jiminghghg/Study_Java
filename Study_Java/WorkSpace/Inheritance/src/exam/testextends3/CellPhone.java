package exam.testextends3;

public class CellPhone {
     //기본 기능들을 가지고있는 최상위 부모클래스 
	//필드(인스턴스멤버)
	public String model;//휴대폰 기종
	pubic void powerOn() {
		System.out.println("종료 버튼 눌러서 전원 ON"); 
		}
   public void bell() {
       System.out.println("전화 와서 벨울림(소리남)");
       }
public class DmbPhone extends CellPhone{
	//이미 기능이 완성이 되어있는 1세대(CellPone)를 이용하여 방송기능이 추가 된 2세대 폰 구현
	
	public DmbPhone(String model,String color,int channel) {
		this.channel = channel;
		this.color = color;
		this.model = model;
		}
	public void turnOnDmb() {
		System.out.println(channel + "채널 보다가 종료");
	}	public void main(String[] args) {
		DmbPhone dmb = new DmbPhone("DMB 폰 삼성","검정",0);
		System.out.println(dmb.model + " " + dmb.color + "준비완료");
		dmb = 
	}
public void onInternet() {
	System.out.println("옆에 ");
}


}
